package builder;

public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void buildBase() {
        System.out.println("build base for common house...");
    }

    @Override
    public void buildWall() {
        System.out.println("build wall for common house...");
    }

    @Override
    public void buildRoof() {
        System.out.println("build roof for common roof...");
    }
}
