package factory.abstractfactory;

import factory.method.JavaVideo;
import factory.method.Video;

public class JavaCourseFactory extends CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
