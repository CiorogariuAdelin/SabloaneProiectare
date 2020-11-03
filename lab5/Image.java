package lab5;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    public String imageName;


    Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void pint() {
        System.out.println("Image with name: " + this.imageName);
    }
}