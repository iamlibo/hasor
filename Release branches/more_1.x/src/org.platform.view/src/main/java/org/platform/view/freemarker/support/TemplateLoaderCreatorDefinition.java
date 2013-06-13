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
package org.platform.view.freemarker.support;
import org.platform.context.AppContext;
import org.platform.view.freemarker.ITemplateLoaderCreator;
import com.google.inject.Provider;
/**
 * ����һ��Cache����Cache��Ҫʵ��{@link ICache}�ӿڡ�
 * @version : 2013-3-12
 * @author ������ (zyc@byshell.org)
 */
class TemplateLoaderCreatorDefinition implements Provider<ITemplateLoaderCreator> {
    private String                        name                = null;
    private AppContext                    appContext          = null;
    private Class<ITemplateLoaderCreator> loaderCreatorType   = null;
    private ITemplateLoaderCreator        loaderCreatorObject = null;
    //
    public TemplateLoaderCreatorDefinition(String name, Class<ITemplateLoaderCreator> loaderCreatorType) {
        this.name = name;
        this.loaderCreatorType = loaderCreatorType;
    }
    public String getName() {
        return name;
    }
    public void setAppContext(AppContext appContext) {
        this.appContext = appContext;
    }
    @Override
    public ITemplateLoaderCreator get() {
        if (this.loaderCreatorObject == null)
            this.loaderCreatorObject = this.appContext.getInstance(this.loaderCreatorType);
        return this.loaderCreatorObject;
    }
}