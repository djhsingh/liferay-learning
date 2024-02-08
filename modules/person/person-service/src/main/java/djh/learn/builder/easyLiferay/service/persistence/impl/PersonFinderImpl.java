package djh.learn.builder.easyLiferay.service.persistence.impl;

import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import djh.learn.builder.easyLiferay.model.Person;
import djh.learn.builder.easyLiferay.model.impl.PersonImpl;
import djh.learn.builder.easyLiferay.service.persistence.PersonFinder;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.List;

@Component(
        service = PersonFinder.class
)
public class PersonFinderImpl extends PersonFinderBaseImpl implements PersonFinder {
    @Reference
    private CustomSQL _customSQL;

    public List<Person> getPersonsByName(String name){
        System.out.println("Inside custom sql");
        Session session=null;
        try{
            session=openSession();
            String sql=_customSQL.get(getClass(),"getPersonsByName");
            System.out.println("Query==>"+sql);
            SQLQuery sqlQuery=session.createSQLQuery(sql);
            sqlQuery.setCacheable(false);
            sqlQuery.addEntity("Person", PersonImpl.class);
            QueryPos queryPos=QueryPos.getInstance(sqlQuery);
            queryPos.add(name);
            return (List<Person>)sqlQuery.list();
        }catch(Exception e){

        }finally {
            closeSession(session);
        }
        return null;
    }
}
