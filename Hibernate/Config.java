package hibernate

public class HibernateConfig

{

	private SessionFactory sessionFactory;

    public HibernateConfig() {
        Configuration config = new Configuration();

        config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

        config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");

        //change the next line of code to match your MySQL URL and port

        config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:7071/test");

        config.setProperty("hibernate.connection.username", "aaron");

        config.setProperty("hibernate.connection.password", "skline");

        //change the pool size to reflect how many users you expect your application to have initially

        config.setProperty("hibernate.connection.pool_size", "4");

        config.setProperty("hibernate.connection.autocommit", "true");
	    
        config.setProperty("hibernate.id.new_generator_mappings", "false");

        config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");

        config.setProperty("hibernate.show_sql", "true");

        config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");

        config.setProperty("hibernate.current_session_context_class", "thread");

		/*
		 *  Add your classes here that you want to match your database tables
		 *  The example has a User and a PhoneNumber class.
		 */

        config.addAnnotatedClass(User.class);
	
	config.addAnnotatedClass(User.class);

        config.addAnnotatedClass(PhoneNumber.class);
/*
 * There have been several changes to the Hibernate libraries.
 * Please uncomment the source code for the version of Hibernate you are using.
*/
         /*Hibernate 4.3 - 5.x */ //ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        /*Hibernate 3.x - 4.2*/ ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();

        sessionFactory = config.buildSessionFactory(serviceRegistry);
    }

    public  Session getCurrentSession() {

        return sessionFactory.getCurrentSession();

    }

}
