package assignments;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
    int authorId() default 123;
    String Authorname() default "Vasavi";
    String developersupervisor() default "Srinivas";
    String date() default "04/04/22";
    String Time() default "8.00 PM";
    int version() default 7;
}




@info
class Developers{
    int authorId;
    String Authorname;
    String developersupervisor;
    String date;
    String Time;
    int version;
}
