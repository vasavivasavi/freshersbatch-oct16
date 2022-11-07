package File;
class DatabasePersistence extends Persistence{



    @Override
    public void persist() {
        System.out.println("The client data is stored in terms of Database");
    }

}
