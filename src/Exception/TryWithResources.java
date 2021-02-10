package Exception;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        try (Element element = new Element()) {
            return;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}

class Element implements AutoCloseable {

    @Override
    public void close() throws java.lang.Exception {
        System.out.println("Закриття успішне");
    }
}