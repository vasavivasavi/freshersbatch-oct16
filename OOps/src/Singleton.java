public class Singleton {
        public static Singleton s=null;
        String txt="Hi";
        private Singleton(){
        }
        public static Singleton Instance(){
            if(s==null){
                s=new Singleton();
            }
            return s;
        }
    }
