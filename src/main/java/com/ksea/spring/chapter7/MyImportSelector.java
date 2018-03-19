package com.ksea.spring.chapter7;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.io.IOException;
import java.util.Set;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        Set<String> annotationTypes = importingClassMetadata.getAnnotationTypes();
        annotationTypes.forEach(System.out::println);
        return new String[]{"com.ksea.spring.chapter7.Blue", "com.ksea.spring.chapter7.Yellow"};


        /**这里默认返回的是一个长度为0的数组，不能返回null
         * 因为在org.springframework.context.annotation.ConfigurationClassParser中
         * 下面的方法
         * Factory method to obtain {@link SourceClass}s from class names.
         * private Collection<SourceClass> asSourceClasses(String[] classNames) throws IOException {
         List<SourceClass> annotatedClasses = new ArrayList<SourceClass>(classNames.length);
         for (String className : classNames) {
         annotatedClasses.add(asSourceClass(className));
         }
         return annotatedClasses;

         如果返回null 这里的classNames.length就会抛出空指针异常
         */


        //   return new String[0];
    }
}
