package org.eclipse.xtext.web.statemachine.servlet.activator;

import java.util.Hashtable;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

@SuppressWarnings("all")
public class Activator implements BundleActivator {
  @Override
  public void start(final BundleContext context) {
    ContextHandler ch1 = new ContextHandler();
    Hashtable<String, String> props1 = new Hashtable<String, String>();
    props1.put("Web-ContextPath", "/dsl/statemachine");
    props1.put("Jetty-ContextFilePath", "handlers/root.xml");
    String _name = ContextHandler.class.getName();
    context.registerService(_name, ch1, props1);
  }
  
  @Override
  public void stop(final BundleContext context) throws Exception {
    String _name = ContextHandler.class.getName();
    ServiceReference<?> _serviceReference = context.getServiceReference(_name);
    context.ungetService(_serviceReference);
  }
}
