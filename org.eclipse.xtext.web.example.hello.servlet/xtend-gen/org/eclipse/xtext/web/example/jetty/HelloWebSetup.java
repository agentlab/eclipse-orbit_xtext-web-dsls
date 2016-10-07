/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.web.example.jetty;

import com.google.inject.Injector;
import com.google.inject.Provider;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.web.example.hello.HelloStandaloneSetup;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class HelloWebSetup extends HelloStandaloneSetup {
  private final Provider<ExecutorService> executorServiceProvider;
  
  private final /* IResourceBaseProvider */Object resourceBaseProvider;
  
  @Override
  public Injector createInjector() {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from HelloWebModule to Iterable<? extends Module>"
      + "\nThe constructor HelloWebModule(Provider<ExecutorService>, IResourceBaseProvider) refers to the missing type IResourceBaseProvider"
      + "\nThe field HelloWebSetup.resourceBaseProvider refers to the missing type IResourceBaseProvider");
  }
  
  public HelloWebSetup(final Provider<ExecutorService> executorServiceProvider, final IResourceBaseProvider resourceBaseProvider) {
    super();
    this.executorServiceProvider = executorServiceProvider;
    this.resourceBaseProvider = resourceBaseProvider;
  }
}
