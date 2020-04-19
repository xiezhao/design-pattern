package factory.method;

/**
 * 工厂方法   每一种算法都对应一个工厂
 *  缺点就是当算法过多的时候，需要定义很多算法对应的工厂类。
 */
public abstract class VideoFactory {
    public abstract Video getVideo();
}
