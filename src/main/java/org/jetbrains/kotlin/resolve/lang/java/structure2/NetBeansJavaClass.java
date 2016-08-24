/**
 * *****************************************************************************
 * Copyright 2000-2016 JetBrains s.r.o.
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
 *
 ******************************************************************************
 */
package org.jetbrains.kotlin.resolve.lang.java.structure2;

import java.util.Collection;
import java.util.List;
import javax.lang.model.element.ElementKind;
import org.jetbrains.kotlin.descriptors.Visibility;
import org.jetbrains.kotlin.load.java.structure.JavaClass;
import org.jetbrains.kotlin.load.java.structure.JavaClassifierType;
import org.jetbrains.kotlin.load.java.structure.JavaConstructor;
import org.jetbrains.kotlin.load.java.structure.JavaField;
import org.jetbrains.kotlin.load.java.structure.JavaMethod;
import org.jetbrains.kotlin.load.java.structure.JavaTypeParameter;
import org.jetbrains.kotlin.name.FqName;
import org.jetbrains.kotlin.name.Name;
import org.jetbrains.kotlin.resolve.lang.java2.NBClassUtils;
import org.netbeans.api.java.source.ElementHandle;
import org.netbeans.api.project.Project;

/**
 *
 * @author Alexander.Baratynski
 */
public class NetBeansJavaClass extends NetBeansJavaClassifier implements JavaClass {

    public NetBeansJavaClass(ElementHandle elementHandle, Project project) {
        super(elementHandle, null, project);
    }

    @Override
    public Name getName() {
        return NBClassUtils.getName(getElementHandle(), getProject());
    }

    @Override
    public FqName getFqName() {
        return new FqName(getElementHandle().getQualifiedName());
    }

    @Override
    public Collection<JavaClassifierType> getSupertypes() {
        return NBClassUtils.getSuperTypes(getElementHandle(), getProject());
    }

    @Override
    public Collection<JavaClass> getInnerClasses() {
        return NBClassUtils.getInnerClasses(getElementHandle(), getProject());
    }

    @Override
    public JavaClass getOuterClass() {
        return NBClassUtils.getOuterClass(getElementHandle(), getProject());
    }

    @Override
    public boolean isInterface() {
        return getElementHandle().getKind() == ElementKind.INTERFACE;
    }

    @Override
    public boolean isAnnotationType() {
        return getElementHandle().getKind() == ElementKind.ANNOTATION_TYPE;
    }

    @Override
    public boolean isEnum() {
        return getElementHandle().getKind() == ElementKind.ENUM;
    }

    @Override
    public boolean isKotlinLightClass() {
        return false;
    }

    @Override
    public Collection<JavaMethod> getMethods() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<JavaField> getFields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<JavaConstructor> getConstructors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAbstract() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isStatic() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Visibility getVisibility() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<JavaTypeParameter> getTypeParameters() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
