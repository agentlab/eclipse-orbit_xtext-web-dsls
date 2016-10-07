package org.eclipse.xtext.web.dsl.launguage;

import com.google.inject.Provider;
import java.util.concurrent.ExecutorService;

@SuppressWarnings("all")
public interface IExecutorServiceProvider {
  public abstract Provider<ExecutorService> getExecutorServiceProvider();
}
