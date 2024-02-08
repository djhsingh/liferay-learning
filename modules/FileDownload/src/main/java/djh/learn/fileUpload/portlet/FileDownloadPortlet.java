package djh.learn.fileUpload.portlet;

import com.liferay.dynamic.data.mapping.model.DDMForm;
import com.liferay.dynamic.data.mapping.model.DDMFormInstanceRecord;
import com.liferay.dynamic.data.mapping.model.DDMFormInstanceRecordTable;
import com.liferay.dynamic.data.mapping.model.DDMFormInstanceRecordWrapper;
import com.liferay.dynamic.data.mapping.service.DDMFormInstanceRecordService;
import com.liferay.dynamic.data.mapping.storage.DDMFormFieldValue;
import com.liferay.dynamic.data.mapping.storage.DDMFormValues;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import djh.learn.fileUpload.constants.FileDownloadPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.io.FileUtils;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * @author DEEPAK SINGH JANGRA
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=FileDownload",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + FileDownloadPortletKeys.FILEDOWNLOAD,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FileDownloadPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		String folder = "C:\\Files";
		Path source = Paths.get(folder);
		List<File> files = new ArrayList<>();
		List<Path> paths =Files.walk(source).filter(Files::isRegularFile).collect(Collectors.toList());
		for(Path path:paths){
			File file = path.toFile();
			System.out.println(file.getName());
			System.out.println(file.getPath());
			files.add(file);
		}
		String url="";
		try {
			List<DDMFormInstanceRecord> records = 	ddmFormInstanceRecordService.getFormInstanceRecords(44306l);
			System.out.println("forms records are"+records);
			System.out.println(records.get(0).getDDMFormValues().getDDMFormFieldValuesMap().values());
			System.out.println(records.get(0).getDDMFormValues().getDDMFormFieldValues());
			DDMFormFieldValue value = records.get(0).getDDMFormValues().getDDMFormFieldValues().get(0);
			System.out.println(value.getName()+"----------"+value.getValue().getString(Locale.ROOT));

			for(DDMFormInstanceRecord record: records){
				List<DDMFormFieldValue> values = record.getDDMFormValues().getDDMFormFieldValues();
				for(DDMFormFieldValue val: values){
					System.out.println("name is: "+val.getName());
					System.out.println("value is "+val.getValue());
					System.out.println("value received si:"+val.getValue().getString(Locale.ROOT));
					System.out.println("values are: "+val.getValue().toString());
					if(val.getName().startsWith("Upload")){
						JSONObject json = JSONFactoryUtil.createJSONObject(val.getValue().getString(Locale.ROOT));
						System.out.println("sjon objse s"+json);
						System.out.println("sjon objse s"+json.getString("url"));
						url = json.getString("url");
					}
					}

			} }catch (JSONException ex) {
			throw new RuntimeException(ex);
		} catch (PortalException ex) {
			throw new RuntimeException(ex);
		}
		renderRequest.setAttribute("url",url);
		renderRequest.setAttribute("files",files);
		super.render(renderRequest, renderResponse);
	}

	@Reference
	DDMFormInstanceRecordService ddmFormInstanceRecordService;
}