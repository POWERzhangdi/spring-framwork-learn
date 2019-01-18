package com.basis.annotations;

import com.basis.beans.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class SelectorHelloWorldConfiguration implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String []{HelloWorldConfiguration.class.getName()};
    }
}
