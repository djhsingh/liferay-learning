package djh.learn.easyLiferay.contribute.context.contributor;

import com.liferay.calendar.recurrence.Weekday;
import com.liferay.portal.kernel.template.TemplateContextContributor;

import java.text.DateFormatSymbols;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.vulcan.util.LocalDateTimeUtil;
import com.liferay.portal.vulcan.util.LocalizedMapUtil;
import org.osgi.service.component.annotations.Component;

/**
 * @author DEEPAK SINGH JANGRA
 */
@Component(
	immediate = true,
	property = {"type=" + TemplateContextContributor.TYPE_GLOBAL},
	service = TemplateContextContributor.class
)
public class ContributerTemplateContextContributor
	implements TemplateContextContributor {

	@Override
	public void prepare(
		Map<String, Object> contextObjects, HttpServletRequest request) {

		LocalDateTime ldt = LocalDateTime.now();
		Weekday day = Weekday.getWeekday(ldt.getDayOfWeek().getValue());
		System.out.println(day.name());
		contextObjects.put("ldt", ldt);
		contextObjects.put("day",day.name());
	}

}