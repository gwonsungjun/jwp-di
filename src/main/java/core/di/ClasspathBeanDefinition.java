package core.di;

import core.di.factory.BeanFactoryUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by iltaek on 2020/07/16 Blog : http://blog.iltaek.me Github : http://github.com/iltaek
 */
public class ClasspathBeanDefinition implements BeanDefinition {

    private final Class<?> beanClass;

    public ClasspathBeanDefinition(Class<?> clazz) {
        this.beanClass = clazz;
    }

    @Override
    public Constructor<?> getBeanConstructor() {
        return BeanFactoryUtils.getInjectedConstructor(beanClass);
    }

    @Override
    public Class<?> getBeanClass() {
        return beanClass;
    }

    @Override
    public Method getMethod() {
        return null;
    }
}