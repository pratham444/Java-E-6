class Water {

    String pHLevel;
    String type;
    String temperature;
    int minerals;
    int flowRate;

    Water(String pHLevel, String type, String temperature, int minerals, int flowRate) {
        this.pHLevel = pHLevel;
        this.type = type;
        this.temperature = temperature;
        this.minerals = minerals;
        this.flowRate = flowRate;
    }

    void displayWater() {
        System.out.println();
        System.out.println("Water Info");
        System.out.println("pH Level: " + pHLevel);
        System.out.println("Type: " + type);
        System.out.println("Temperature: " + temperature);
        System.out.println("Minerals: " + minerals);
        System.out.println("Flow Rate: " + flowRate + " L/min");
        System.out.println();
    }
}

class Soil {

    String texture;
    String color;
    String type;
    String region;
    int fertility;
    double moistureContent;
    Water water;

    Soil(String texture, String color, String type, String region, int fertility, double moistureContent) {
        this.texture = texture;
        this.color = color;
        this.type = type;
        this.region = region;
        this.fertility = fertility;
        this.moistureContent = moistureContent;
        this.water = new Water("6.8", "Groundwater", "20°C", 5, 15);
    }

    void displaySoil() {
        System.out.println();
        System.out.println("Soil Info");
        System.out.println("Texture: " + texture);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Region: " + region);
        System.out.println("Fertility: " + fertility + "/10");
        System.out.println("Moisture Content: " + moistureContent + " %");
        System.out.println();
    }
}

class SoilDriver {

    public static void main(String[] args) {
        Soil obj = new Soil("Loamy", "Brown", "Agricultural", "Punjab", 9, 22.5);

        obj.displaySoil();
        obj.water.displayWater();
    }
}
