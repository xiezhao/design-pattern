package factory.simple;

/**
 * 简单工厂 每次都需要修改工厂方法，不符合开闭原则
 */
public class VideoFactory {

    /**
     * 每次都需要修改工厂方法，不符合开闭原则
     */
    public Video getVideo(String type){
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }

    //一般不用static是，不好集成扩展
    public static Video getVideo(Class clz) {
        Video video = null;
        try {
            video = (Video) Class.forName(clz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return video;
    }






}
