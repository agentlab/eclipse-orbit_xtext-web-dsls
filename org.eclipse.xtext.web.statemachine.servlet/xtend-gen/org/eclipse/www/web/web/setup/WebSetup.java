package org.eclipse.www.web.web.setup;

import com.google.inject.Provider;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtext.web.dsl.launguage.IExecutorServiceProvider;
import org.eclipse.xtext.web.server.persistence.ResourceBaseProviderImpl;
import ru.one.c.www.statemachine.servlet.StatemachineWebSetup;

@SuppressWarnings("all")
public class WebSetup {
  private IExecutorServiceProvider service;
  
  private ResourceBaseProviderImpl resourceBaseProvider = new ResourceBaseProviderImpl("./test-files");
  
  public synchronized void setDsl(final IExecutorServiceProvider service) {
    this.service = service;
    Provider<ExecutorService> _executorServiceProvider = this.service.getExecutorServiceProvider();
    StatemachineWebSetup _statemachineWebSetup = new StatemachineWebSetup(_executorServiceProvider, this.resourceBaseProvider);
    _statemachineWebSetup.createInjectorAndDoEMFRegistration();
  }
  
  public synchronized void unsetDsl(final IExecutorServiceProvider service) {
    this.service = null;
  }
}
