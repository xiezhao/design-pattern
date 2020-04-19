package factory.method;

public class Test {


    public static void main(String[] args) {
        VideoFactory videoFactory  = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

        VideoFactory videoFactory1  = new PythonVideoFactory();
        Video video1 = videoFactory1.getVideo();
        video1.produce();
    }
}
