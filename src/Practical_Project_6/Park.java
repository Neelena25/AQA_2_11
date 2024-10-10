package Practical_Project_6;

public class Park {
    private String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    public class Attraction {
        private String attractionName;
        private String operatingTime;
        private double cost;

        public Attraction(String attractionName, String operatingTime, double cost) {
            this.attractionName = attractionName;
            this.operatingTime = operatingTime;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + operatingTime);
            System.out.println("Стоимость: " + cost);
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Парк развлечений");
        Park.Attraction attraction1 = park.new Attraction("Карусель", "10:00 - 18:00", 200.0);
        Park.Attraction attraction2 = park.new Attraction("Американские горки", "11:00 - 19:00", 300.0);

        attraction1.printInfo();
        attraction2.printInfo();
    }
}
