/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.web.example.hello.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.web.example.hello.HelloRuntimeModule;
import org.eclipse.xtext.web.example.hello.HelloStandaloneSetup;
import org.eclipse.xtext.web.example.hello.ide.HelloIdeModule;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class HelloIdeSetup extends HelloStandaloneSetup {
  @Override
  public Injector createInjector() {
    HelloRuntimeModule _helloRuntimeModule = new HelloRuntimeModule();
    HelloIdeModule _helloIdeModule = new HelloIdeModule();
    return Guice.createInjector(_helloRuntimeModule, _helloIdeModule);
  }
}
