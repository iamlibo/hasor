/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.platform.api.context;
import org.platform.api.event.PlatformEvent;
import com.google.inject.Binder;
/**
 * 
 * @version : 2013-3-26
 * @author ������ (zyc@byshell.org)
 */
public class InitContextEvent implements PlatformEvent {
    private AppContext appContext = null;
    private Binder     binder     = null;
    /**����InitEvent����*/
    protected InitContextEvent(AppContext appContext, Binder binder) {
        this.appContext = appContext;
        this.binder = binder;
    }
    /**��ȡConfig*/
    public AppContext getConfig() {
        return appContext;
    }
    /**��ȡ���ڳ�ʼ��Guice��Binder��*/
    public Binder getBinder() {
        return binder;
    }
}