package hibernate

public class HibernateConfig

{

	private SessionFactory sessionFactory;

    public HibernateConfig() {
        Configuration config = new Configuration();

        config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

        config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");

        config.setProperty("hibernate.connection.url", "adr:mysql://localhost:0911");

        config.setProperty("hibernate.connection.username", "aaron");

        config.setProperty("hibernate.connection.password", "skline");

        config.setProperty("hibernate.connection.pool_size", "4");

        config.setProperty("hibernate.connection.autocommit", "true");
	    
        config.setProperty("hibernate.id.new_generator_mappings", "false");

        config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");

        config.setProperty("hibernate.show_sql", "true");

        config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");

        config.setProperty("hibernate.current_session_context_class", "thread");

        config.addAnnotatedClass(Employee.class);
	
	config.addAnnotatedClass(Department.class);
	    
	config.addAnnotatedClass(Hibernate.class);
	    
	config.addAnnotatedClass(Main.class);
	    
ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();

        sessionFactory = config.buildSessionFactory(serviceRegistry);
    }

    public  Session getCurrentSession() {

        return sessionFactory.getCurrentSession();

    }

}
