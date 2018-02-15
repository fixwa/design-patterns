
// The INTERFACE
public interface Building {
    String getType();
}

// First implementation
public class House implements Building {
    public String getType(){
        return "house"
    }
}

// Second implementation
public class Edifice implements Building {
    public String getType(){
        return "edifice"
    }
}


// The FACTORY:
public class BuildingFactory {
    private static Map<String, Building> instances;

    static {
        instances = new HashMap<>();

        instances.put("house", new House());
        instances.put("edifice", new Edifice());
    }

    public static <T extends Building> T getBuilding(String type){
        return (T) instances.get(type);
    }
}


// Usage:
Building building = BuildingFactory.getBuilding("house");