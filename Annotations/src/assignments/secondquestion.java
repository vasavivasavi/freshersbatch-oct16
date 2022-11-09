package assignments;

import java.lang.annotation.Annotation;

public class secondquestion {
    public static void main(String[] args) {
        Developers obj = new Developers();
        Class n = obj.getClass();
        Annotation anno = n.getAnnotation(info.class);
        info k = (info) anno;
        System.out.println(k.authorId());
        System.out.println(k.Authorname());
        System.out.println(k.date());
        System.out.println(k.developersupervisor());
        System.out.println(k.Time());
        System.out.println(k.version());
    }
}
