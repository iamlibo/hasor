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
package org.more.beans.resource.namespace.beans;
import java.net.URI;
import java.net.URISyntaxException;
import org.more.beans.ValueMetaData;
import org.more.beans.define.QuickProperty_ValueMetaData;
import org.more.beans.define.URI_ValueMetaData;
import org.more.beans.resource.QuickParserEvent;
import org.more.beans.resource.QuickPropertyParser;
/**
 * ��������ֵ��������Ĭ��ֵ��null��
 * @version 2010-9-22
 * @author ������ (zyc@byshell.org)
 */
public class QPP_URILocation implements QuickPropertyParser {
    /**��ͼ������Ϊ{@link URI_ValueMetaData}�������ʧ�ܷ���null��*/
    public ValueMetaData parser(QuickParserEvent event) throws URISyntaxException {
        QuickProperty_ValueMetaData meta = event.getOldMetaData();
        if (meta.getUriLocation() == null)
            return null;
        URI_ValueMetaData newMETA = new URI_ValueMetaData();
        newMETA.setUriObject(new URI(meta.getUriLocation()));
        return newMETA;
    }
}