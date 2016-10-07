/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.web.example.jetty;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Provider;
import com.google.inject.util.Modules;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.web.example.hello.HelloRuntimeModule;
import org.eclipse.xtext.web.example.hello.HelloStandaloneSetup;
import org.eclipse.xtext.web.example.jetty.HelloWebModule;
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class HelloWebSetup extends HelloStandaloneSetup {
  private final Provider<ExecutorService> executorServiceProvider;
  
  private final IResourceBaseProvider resourceBaseProvider;
  
  @Override
  public Injector createInjector() {
    final HelloRuntimeModule runtimeModule = new HelloRuntimeModule();
    final HelloWebModule webModule = new HelloWebModule(this.executorServiceProvider, this.resourceBaseProvider);
    Modules.OverriddenModuleBuilder _override = Modules.override(runtimeModule);
    Module _with = _override.with(webModule);
    return Guice.createInjector(_with);
  }
  
  public HelloWebSetup(final Provider<ExecutorService> executorServiceProvider, final IResourceBaseProvider resourceBaseProvider) {
    super();
    this.executorServiceProvider = executorServiceProvider;
    this.resourceBaseProvider = resourceBaseProvider;
  }
}
