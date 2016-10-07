/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.web.example.jetty;

import com.google.inject.Provider;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.web.example.jetty.AbstractHelloWebModule;

/**
 * Use this class to register additional components to be used within the web application.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class HelloWebModule extends AbstractHelloWebModule {
  private final /* IResourceBaseProvider */Object resourceBaseProvider;
  
  public HelloWebModule(final Provider<ExecutorService> executorServiceProvider, final IResourceBaseProvider resourceBaseProvider) {
    super(executorServiceProvider);
    this.resourceBaseProvider = resourceBaseProvider;
  }
}
