package djh.learn.easyLiferay.jQuery.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.ParamUtil;
import djh.learn.builder.easyLiferay.model.Person;
import djh.learn.builder.easyLiferay.service.PersonService;
import djh.learn.easyLiferay.jQuery.constants.JQueryPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DEEPAK SINGH JANGRA
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=JQuery",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + JQueryPortletKeys.JQUERY,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class JQueryPortlet extends MVCPortlet {

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

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {

		String personId = ParamUtil.getString(resourceRequest,"personId");
		System.out.println("personId is: "+personId);
		try {
			_personService.delete(Long.parseLong(personId));
		} catch (PortalException e) {
			throw new RuntimeException(e);
		}
		System.out.println("Person deleted Successfully !");
		super.serveResource(resourceRequest, resourceResponse);
	}
}