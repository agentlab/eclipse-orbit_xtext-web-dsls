package org.eclipse.xtext.web.hello.setup;

import com.google.inject.Provider;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtext.web.dsl.launguage.IExecutorServiceProvider;
import org.eclipse.xtext.web.example.jetty.HelloWebSetup;
import org.eclipse.xtext.web.server.persistence.ResourceBaseProviderImpl;

@SuppressWarnings("all")
public class WebSetup {
  private IExecutorServiceProvider service;
  
  private ResourceBaseProviderImpl resourceBaseProvider = new ResourceBaseProviderImpl("./test-files");
  
  public synchronized void setDsl(final IExecutorServiceProvider service) {
    this.service = service;
    Provider<ExecutorService> _executorServiceProvider = this.service.getExecutorServiceProvider();
    HelloWebSetup _helloWebSetup = new HelloWebSetup(_executorServiceProvider, this.resourceBaseProvider);
    _helloWebSetup.createInjectorAndDoEMFRegistration();
  }
  
  public synchronized void unsetDsl(final IExecutorServiceProvider service) {
    this.service = null;
  }
}
