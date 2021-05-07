public class DatabaseAdapterSingelton {

    private static DatabaseThing instance;

    public static DatabaseThing getInstance(){
        if (instance != null){
            instance = new DatabaseThing();
        }
        return instance;
    }
}
