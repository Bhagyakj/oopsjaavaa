class cpu {
    int price;

    // Constructor for the CPU class
    cpu(int p) {
        this.price = p;
    }

    // Inner class Processor
    class Processor {
        int cores;
        String manufacture;

        // Constructor for the Processor class
        Processor(int n, String m) {
            this.cores = n;
            this.manufacture = m;
        }

        // Method to display the Processor details
        void display() {
            System.out.println("No of Cores: " + this.cores);
            System.out.println("Processor manufacture: " + this.manufacture);
        }
    }

    // Static inner class Ram
    static class Ram {
        int memory;
        String manufacture;

        // Constructor for the Ram class
        Ram(int n, String m) {
            this.memory = n;
            this.manufacture = m;
        }

        // Method to display the Ram details
        void display() {
            System.out.println("Memory size: " + this.memory);
            System.out.println("Memory manufacture: " + this.manufacture);
        }
    }

    // Method to display the CPU details
    void display() {
        System.out.println("Price of CPU: " + this.price);
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of the CPU class
        cpu intel = new cpu(23000);

        // Create an instance of the Processor class using the outer class instance
        cpu.Processor iProcessor = intel.new Processor(4, "Intel");

        // Create an instance of the static Ram class
        cpu.Ram iRam = new cpu.Ram(1024, "Asus");

        // Display details of the CPU, Processor, and Ram
        intel.display();
        iProcessor.display();
        iRam.display();
    }
}
