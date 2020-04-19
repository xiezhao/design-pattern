package factory.simple;

public class Test {

    public static void main(String[] args) {
        VideoFactory simpleFactory = new VideoFactory();
        Video video = simpleFactory.getVideo("java");
        video.produce();

        //这样是不需要修改工厂的,创建Video的子类，从这个里面传进来就好
        Video video1 = VideoFactory.getVideo(PythonVideo.class);
        if (video1 == null) return;
        video1.produce();
    }
}
