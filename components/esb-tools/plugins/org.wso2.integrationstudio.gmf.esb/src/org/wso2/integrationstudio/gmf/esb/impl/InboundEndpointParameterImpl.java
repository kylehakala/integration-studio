/**
 * Copyright 2009-2012 WSO2, Inc. (http://wso2.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.integrationstudio.gmf.esb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.wso2.integrationstudio.gmf.esb.EsbPackage;
import org.wso2.integrationstudio.gmf.esb.InboundEndpointParameter;
import org.wso2.integrationstudio.gmf.esb.KeyType;
import org.wso2.integrationstudio.gmf.esb.RegistryKeyProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inbound Endpoint Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.integrationstudio.gmf.esb.impl.InboundEndpointParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.wso2.integrationstudio.gmf.esb.impl.InboundEndpointParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.wso2.integrationstudio.gmf.esb.impl.InboundEndpointParameterImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.wso2.integrationstudio.gmf.esb.impl.InboundEndpointParameterImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InboundEndpointParameterImpl extends EObjectImpl implements InboundEndpointParameter {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = "parameter_name";

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = "parameter_value";

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * The cached value of the '{@link #getKey() <em>Key</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKey()
     * @generated
     * @ordered
     */
    protected RegistryKeyProperty key;

                /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final KeyType TYPE_EDEFAULT = KeyType.STATIC;

                /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected KeyType type = TYPE_EDEFAULT;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InboundEndpointParameterImpl() {
        super();
        RegistryKeyProperty key = EsbFactoryImpl.eINSTANCE.createRegistryKeyProperty();
        key.setPrettyName("Script Key");
        key.setKeyName("key");
        key.setKeyValue("");
        setKey(key);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsbPackage.Literals.INBOUND_ENDPOINT_PARAMETER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.INBOUND_ENDPOINT_PARAMETER__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(String newValue) {
        String oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.INBOUND_ENDPOINT_PARAMETER__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RegistryKeyProperty getKey() {
        if (key != null && key.eIsProxy()) {
            InternalEObject oldKey = (InternalEObject)key;
            key = (RegistryKeyProperty)eResolveProxy(oldKey);
            if (key != oldKey) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsbPackage.INBOUND_ENDPOINT_PARAMETER__KEY, oldKey, key));
            }
        }
        return key;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RegistryKeyProperty basicGetKey() {
        return key;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKey(RegistryKeyProperty newKey) {
        RegistryKeyProperty oldKey = key;
        key = newKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.INBOUND_ENDPOINT_PARAMETER__KEY, oldKey, key));
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KeyType getType() {
        return type;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(KeyType newType) {
        KeyType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.INBOUND_ENDPOINT_PARAMETER__TYPE, oldType, type));
    }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EsbPackage.INBOUND_ENDPOINT_PARAMETER__NAME:
                return getName();
            case EsbPackage.INBOUND_ENDPOINT_PARAMETER__VALUE:
                return getValue();
            case EsbPackage.INBOUND_ENDPOINT_PARAMETER__KEY:
                if (resolve) return getKey();
                return basicGetKey();
            case EsbPackage.INBOUND_ENDPOINT_PARAMETER__TYPE:
                return getType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case EsbPackage.INBOUND_ENDPOINT_PARAMETER__NAME:
                setName((String)newValue);
                return;
            case EsbPackage.INBOUND_ENDPOINT_PARAMETER__VALUE:
                setValue((String)newValue);
                return;
            case EsbPackage.INBOUND_ENDPOINT_PARAMETER__KEY:
                setKey((RegistryKeyProperty)newValue);
                return;
            case EsbPackage.INBOUND_ENDPOINT_PARAMETER__TYPE:
                setType((KeyType)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case EsbPackage.INBOUND_ENDPOINT_PARAMETER__NAME:
                setName(NAME_EDEFAULT);
                return;
            case EsbPackage.INBOUND_ENDPOINT_PARAMETER__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case EsbPackage.INBOUND_ENDPOINT_PARAMETER__KEY:
                setKey((RegistryKeyProperty)null);
                return;
            case EsbPackage.INBOUND_ENDPOINT_PARAMETER__TYPE:
                setType(TYPE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case EsbPackage.INBOUND_ENDPOINT_PARAMETER__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case EsbPackage.INBOUND_ENDPOINT_PARAMETER__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
            case EsbPackage.INBOUND_ENDPOINT_PARAMETER__KEY:
                return key != null;
            case EsbPackage.INBOUND_ENDPOINT_PARAMETER__TYPE:
                return type != TYPE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(", value: ");
        result.append(value);
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} // InboundEndpointParameterImpl
