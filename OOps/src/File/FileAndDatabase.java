package File;
public class FileAndDatabase {



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Persistence perFile=new FilePersistence();
        perFile.persist();

        Persistence perDatabase=new DatabasePersistence();
        perDatabase.persist();
    }



}
