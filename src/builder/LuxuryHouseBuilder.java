package builder;

public class LuxuryHouseBuilder extends HouseBuilder {
    @Override
    public void buildBase() {
        System.out.println("build base for luxury house...");
    }

    @Override
    public void buildWall() {
        System.out.println("build wall for luxury house...");
    }

    @Override
    public void buildRoof() {
        System.out.println("build roof for luxury house...");
    }
}
