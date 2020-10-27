package lab4;

import java.util.concurrent.TimeUnit;

public class imageProxy implements Element {
    Image Name;
    imageProxy(String name) {
        Name=new Image(name);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void pint() {
            System.out.println("Image with name: " + this.Name.imageName);
    }
}
