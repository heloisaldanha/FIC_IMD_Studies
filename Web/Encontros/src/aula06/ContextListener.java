package aula06;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ContextListener
 *
 */
@WebListener
public class ContextListener implements ServletContextListener {
public static final String SISTEMA_ENCONTROS = "sistemaEncontros";

    public void contextDestroyed(ServletContextEvent event)  { 
         ServletContext context = event.getServletContext();
         context.removeAttribute("SISTEMA_ENCONTROS");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  { 
         ServletContext context = event.getServletContext();
         context.setAttribute(SISTEMA_ENCONTROS, new SistemaEncontros());
    }
	
}
