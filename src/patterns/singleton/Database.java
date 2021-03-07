package patterns.singleton;

public class Database {
    private static Database instance;

    private Database() {
    }

    public static Database getInstance() {
        if (Database.instance == null) {
            Database.instance = new Database();
        }
        return Database.instance;
    }

    public String getCity() {
        return "Nur-Sultan";
    }
}
