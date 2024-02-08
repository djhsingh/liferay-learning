package djh.learn.easyLiferay.lucine.portlet;

import com.liferay.journal.constants.JournalFolderConstants;
import com.liferay.journal.model.JournalArticle;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.search.*;
import com.liferay.portal.kernel.search.generic.BooleanQueryImpl;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.search.searcher.*;
import djh.learn.easyLiferay.lucine.constants.LucinePortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

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
		"javax.portlet.display-name=Lucine",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + LucinePortletKeys.LUCINE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class LucinePortlet extends MVCPortlet {

	@ProcessAction(name = "searchArticle")
	public void search(ActionRequest actionRequest,ActionResponse actionResponse)
			throws PortalException {
		String keyword = ParamUtil.getString(actionRequest,"keyword");
		HttpServletRequest httpRequest = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(actionRequest));
		SearchContext searchContext = SearchContextFactory.getInstance(httpRequest);
		System.out.println("keyword is: "+keyword);
		BooleanQuery structureQuery = new BooleanQueryImpl();
		structureQuery.addRequiredTerm(Field.COMPANY_ID,searchContext.getCompanyId());
		structureQuery.addRequiredTerm(Field.ENTRY_CLASS_NAME, JournalArticle.class.getName());
		structureQuery.addRequiredTerm(Field.USER_ID,searchContext.getUserId() );
		structureQuery.addRequiredTerm("articleId",44419);	//only visible contents
		structureQuery.addRequiredTerm("urlTitle", keyword);	//only last version

		Hits hits = IndexSearcherHelperUtil.search(searchContext, structureQuery);
		System.out.println("hits are: "+hits);
		Document[] documents = hits.getDocs();
		System.out.println("documents are: "+documents);

	}

}