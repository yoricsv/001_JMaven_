public class CostCalculator
{
    private double weightCost;
    private int    distanceCost;

    public CostCalculator(double weightCost, int distanceCost)
    {
        this.weightCost   = weightCost;
        this.distanceCost = distanceCost;
    }

    public double calcCost(Cargo cargoWeight, int distance)
    {
        return cargoWeight.getWeight() * weightCost + distance.getDistance() * distanceCost;
    }

}
