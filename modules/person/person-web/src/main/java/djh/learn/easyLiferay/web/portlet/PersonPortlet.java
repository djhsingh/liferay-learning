package djh.learn.easyLiferay.web.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import djh.learn.builder.easyLiferay.exception.NoSuchPersonException;
import djh.learn.builder.easyLiferay.model.Person;
import djh.learn.builder.easyLiferay.model.PersonModel;
import djh.learn.builder.easyLiferay.service.PersonService;
import djh.learn.easyLiferay.web.constants.PersonPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * @author DEEPAK SINGH JANGRA
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.init-param.add-process-action-success-action=false",
		"javax.portlet.display-name=Persons",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PersonPortletKeys.PERSON,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PersonPortlet extends MVCPortlet {
	@Reference(bind = "djh.learn.builder.easyLiferay.service.PersonService")
	private PersonService _personService;


	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		List<Person> persons = new ArrayList<>();

		try {
			persons = _personService.getAllPersons();
		} catch (PortalException e) {
			throw new RuntimeException(e);
		}
		System.out.println("Persons retrived are: "+persons);
		renderRequest.setAttribute("persons",persons);
		super.render(renderRequest, renderResponse);
	}

	@ProcessAction(name = "actionPerson")
	public void process(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException, PortalException {
		String personId = ParamUtil.getString(actionRequest,"personId");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(PersonPortlet.class.getName(), actionRequest);

		String name = ParamUtil.getString(actionRequest,"name");
		int age = ParamUtil.getInteger(actionRequest,"age");
		boolean married = ParamUtil.getBoolean(actionRequest,"married");
		Person person;
		if(personId.isEmpty()|| personId.isBlank() || personId.equals("") || age==0) {
			if (name.isEmpty() || name.isBlank() || name.equals("")) {
				SessionErrors.add(actionRequest, "isEmpty");
				actionResponse.setRenderParameter("jspPage","/addPerson.jsp");
			}
			if (age < 10 || age > 100) {
				SessionErrors.add(actionRequest, "lessAge");
				actionResponse.setRenderParameter("jspPage","/addPerson.jsp");
			}
			person = _personService.createPerson(serviceContext,name,age,married);
			SessionMessages.add(actionRequest,"successEntryAdded");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			System.out.println("New Person Added!");
		}
		else{
			person = _personService.updatePerson(Long.parseLong(personId),name,age,married);
			SessionMessages.add(actionRequest,"successEntryUpdated");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			System.out.println("Person updated!");
		}
		actionResponse.setRenderParameter("jspPage", "/view.jsp");
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {
		String personId = ParamUtil.getString(resourceRequest,"personId");
		System.out.println("person Id is: "+personId);
		if(resourceRequest.getResourceID().equals("deleteRow")){
			try {
				_personService.delete(Long.parseLong(personId));
			} catch (NoSuchPersonException e) {
				throw new RuntimeException(e);
			}
			SessionMessages.add(resourceRequest,"success");
		}

	}
}