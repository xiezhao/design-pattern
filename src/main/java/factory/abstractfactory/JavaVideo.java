package factory.abstractfactory;

public class JavaVideo extends Video {
        @Override
        public void produce() {
            System.out.println("生产Java视频");
        }
    }