/*
 * Copyright 2008-2009 the original ������(zyc@hasor.net).
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
package net.hasor.jdbc.transaction;
import java.sql.SQLException;
/**
 * ��ʾһ������״̬
 * @version : 2013-10-30
 * @author ������(zyc@hasor.net)
 */
public interface TransactionStatus {
    /**��ȡ����ʹ�õĴ�����Ϊ*/
    public TransactionBehavior getTransactionBehavior();
    /**��ȡ����ĸ��뼶��*/
    public TransactionLevel getIsolationLevel();
    //
    /**�����Ƿ��Ѿ���ɡ�
     * <p>�������Ѿ��ݽ����߱��ع��ͱ�־������ɡ�*/
    public boolean isCompleted();
    /**�Ƿ��ѱ����Ϊ�ع����������ֵΪ true ����commit ʱ��ع�������*/
    public boolean isRollbackOnly();
    /**�Ƿ�Ϊֻ��ģʽ��*/
    public boolean isReadOnly();
    /**�Ƿ�ʹ����һ��ȫ�µ����ݿ����ӿ�������*/
    public boolean isNewConnection();
    /**���Ը������Ƿ񱻹���*/
    public boolean isSuspend();
    /**��ʾ�����Ƿ�Я����һ������㣬Ƕ������ͨ���ᴴ��һ���������ΪǶ����������һ������ķֽ�㡣
     * <p>ע�⣺��������а�������㣬���ڵݽ�����ʱֻ�����������㡣*/
    public boolean hasSavepoint();
    //
    /**��������״̬Ϊ�ع�����Ϊ����׳��쳣���������ع�������
     * <p>ֻ�е�isCompleted Ϊ false ʱ���ø÷����Ż���Ч�� */
    public void setRollbackOnly() throws SQLException;
    /**��������״̬Ϊֻ����
     * <p>ֻ�е�isCompleted Ϊ false ʱ���ø÷����Ż���Ч��*/
    public void setReadOnly() throws SQLException;
}