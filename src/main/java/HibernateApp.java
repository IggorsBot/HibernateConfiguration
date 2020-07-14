import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateApp {


    public static void main(String[] args) {

        User alien = new User();
        alien.setName("Jack");
        alien.setSurname("Smith");

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        session.save(alien);
        transaction.commit();

        HibernateUtil.shutdown();
    }
}
