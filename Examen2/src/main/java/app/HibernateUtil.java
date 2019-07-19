package app;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.entity.Catalogo;
import com.entity.Marca;
import com.entity.Producto;
import com.entity.Proveedor;




public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			
			try {
				
				Configuration config = new Configuration();
				
				//Hibernate settings equivalent to hibernate.cfg.xml's properties
				Properties settings = new Properties();
				settings.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://ubuntu-mysql.creativa.com:3306/celulares?useSSL=false");
				settings.put(Environment.USER,"developer");
				settings.put(Environment.PASS, "rjniKzBeWObf");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				config.setProperties(settings);
				config.addAnnotatedClass(Producto.class);
				config.addAnnotatedClass(Catalogo.class);
				config.addAnnotatedClass(Marca.class);
				config.addAnnotatedClass(Proveedor.class);
				
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
				
				sessionFactory = config.buildSessionFactory(serviceRegistry);
				
			}catch(Exception e) {
				e.toString();
			}
			
		}
		
		return sessionFactory;
		
	}
}
