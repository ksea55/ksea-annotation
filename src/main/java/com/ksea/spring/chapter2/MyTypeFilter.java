package com.ksea.spring.chapter2;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * FilterType.CUSTOM 自定义自己的TypeFilter
 * /** Filter candidates using a given custom
 * {@link org.springframework.core.type.filter.TypeFilter} implementation.
 * 从源码注释中可以得知需要实现其 TypeFilter接口
 */

public class MyTypeFilter implements TypeFilter {

    /**
     * Determine whether this filter matches for the class described by
     * the given metadata.确定是否该过滤器与指定的类描述相匹配
     *
     * @param metadataReader        the metadata reader for the target class 元素据读取目标类，也就是当前扫描类的信息
     * @param metadataReaderFactory a factory for obtaining metadata readers
     *                              for other classes (such as superclasses and interfaces)  读取其他类的信息
     * @return whether this filter matches
     * @throws IOException in case of I/O failure when reading metadata
     *                     <p>
     *                     这里是源码的注释信息
     */

    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {


        //获取到注解
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

        // System.out.println("annotationMetadata-->:" + annotationMetadata);

        //获取到类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
//
        //得到资源信息
        Resource resource = metadataReader.getResource();

        // System.out.println("resource-->:" + resource);


        String className = classMetadata.getClassName();
        System.out.println("className-->:" + className);


        if (className.contains("My")) return true;


        return false;
    }
}
