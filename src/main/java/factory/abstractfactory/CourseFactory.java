package factory.abstractfactory;

import factory.method.Video;

/**
 * 抽象工厂方法
 *  和工厂方法的最大区别就是 工厂方法是创建一个产品，而抽象工厂是创建一个产品族，既创建多个产品，使用一个工厂
 */
public abstract class CourseFactory {
    public abstract Video getVideo();
    public abstract Article getArticle();
}
