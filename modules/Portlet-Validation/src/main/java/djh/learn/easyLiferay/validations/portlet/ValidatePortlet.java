package djh.learn.easyLiferay.validations.portlet;

import com.liferay.portal.kernel.portlet.LiferayPortletConfig;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import djh.learn.easyLiferay.validations.constants.ValidatePortletKeys;

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
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Validate",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ValidatePortletKeys.VALIDATE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ValidatePortlet extends MVCPortlet {

	@ProcessAction(name="action")
	public void processAction(ActionRequest request, ActionResponse response) throws IOException, PortletException {

		String phoneNumber = ParamUtil.getString(request,"phone");
		System.out.println(phoneNumber);
		if(!Validator.isDigit(phoneNumber))
		{
			SessionErrors.add(request, "notNumber");
		}
		else if(phoneNumber.length()!=10)
		{
			SessionErrors.add(request, "lessLength");
		}
		else
		{
			SessionMessages.add(request, "success");
		}
		request.setAttribute("phoneNumber", phoneNumber);


	}
}