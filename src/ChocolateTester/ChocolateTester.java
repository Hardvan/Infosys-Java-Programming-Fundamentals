package ChocolateTester;

class Chocolate {
    int barCode;
    String name;
    int weight;
    int cost;

    // Constructor
    Chocolate(int barCode, String name, int weight, int cost) {
        this.barCode = barCode;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

public class ChocolateTester {
    public static void main(String[] args) {
        Chocolate obj = new Chocolate(101, "Cadbury", 12, 10);
        System.out.println("Bar Code: " + obj.getBarCode());
        System.out.println("Name: " + obj.getName());
        System.out.println("Weight: " + obj.getWeight());
        System.out.println("Cost: " + obj.getCost());
        System.out.println();

        obj.setBarCode(102);
        obj.setName("Hershey's");
        obj.setWeight(24);
        obj.setCost(50);
        System.out.println("Bar Code: " + obj.getBarCode());
        System.out.println("Name: " + obj.getName());
        System.out.println("Weight: " + obj.getWeight());
        System.out.println("Cost: " + obj.getCost());
    }
}
