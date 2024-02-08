package djh.learn.easyLiferay.portlet;

import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import djh.learn.easyLiferay.constants.MessagesPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import org.osgi.service.component.annotations.Component;

import java.io.IOException;

/**
 * @author DEEPAK SINGH JANGRA
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Messages",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MessagesPortletKeys.MESSAGES,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MessagesPortlet extends MVCPortlet {

	@ProcessAction(name="action")
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {

		String name = actionRequest.getParameter("name");
		String pass = actionRequest.getParameter("pass");
		System.out.println(name+"----"+pass);
		if(name.equalsIgnoreCase("hello")&& pass.equalsIgnoreCase("hello"))
		{
			SessionMessages.add(actionRequest,"success-key");
		}
		else{
			SessionErrors.add(actionRequest, "error-key");
		}
	}
}