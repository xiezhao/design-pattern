package factory.abstractfactory;

import factory.method.Video;

public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        System.out.println(article.getName());
        video.produce();
    }
}
