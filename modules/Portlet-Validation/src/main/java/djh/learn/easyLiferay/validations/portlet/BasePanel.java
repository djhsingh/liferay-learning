package djh.learn.easyLiferay.validations.portlet;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.model.Portlet;
import djh.learn.easyLiferay.validations.constants.ValidatePortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        immediate = true,
        property = {
                "panel.app.order:Integer=0",
                "panel.category.key=" + PanelCategoryKeys.CONTROL_PANEL
        },

        service = PanelApp.class)

public class BasePanel extends BasePanelApp {

    @Override
    public String getPortletId() {
        return ValidatePortletKeys.VALIDATE;
    }

    @Override
    @Reference(target = "(javax.portlet.name=" + ValidatePortletKeys.VALIDATE + ")", unbind = "-")
    public void setPortlet(Portlet portlet) {
        super.setPortlet(portlet);
    }
}
