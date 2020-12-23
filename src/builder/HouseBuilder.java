package builder;

// abstract builder
public abstract class HouseBuilder {
    protected House house = new House();

    // abstract methods to build all components
    public abstract void buildBase();
    public abstract void buildWall();
    public abstract void buildRoof();

    // build a house
    public House buildHouse() {
        return house;
    }
}
