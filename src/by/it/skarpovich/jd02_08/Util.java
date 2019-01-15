package by.it.skarpovich.jd02_08;

import java.io.File;

public class Util {

    private Util() {
    }

    private static String getPath(Class<?> clazz) {
        String simpleName = clazz.getSimpleName();
        String path = clazz.getName().replace(simpleName, "");
        path = path.replace(".", File.separator);
        String root = System.getProperty("user.dir");
        String result = root + File.separator + "src" + File.separator + path;
        return result;
    }

    public static String getPath() {
        return getPath(Util.class);
    }

    static String getPath(String filename) {
        return getPath() + filename;
    }
}
