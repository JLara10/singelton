package singletonDemo;

public class Lion {
    private Lion() {
        // Initialize lion-specific data
        System.out.println("Lion instance created.");
    }

    // Static inner class responsible for holding the singleton instance
    private static class LionHolder {
        // The instance is created only when the inner class is loaded
        private static final Lion INSTANCE = new Lion();
    }

    // Public method to provide access to the singleton instance
    public static Lion getInstance() {
        return LionHolder.INSTANCE;
    }

    // Other methods representing the lion's behavior
    public void roar() {
        System.out.println("The lion roars!");
    }

    public void hunt() {
        System.out.println("The lion is hunting.");
    }
    public static void main(String[] args) {
        // Test the singleton implementation
        Lion lion1 = Lion.getInstance();
        Lion lion2 = Lion.getInstance();

        lion1.roar();
        lion2.hunt();

        // Check if both references point to the same instance
        System.out.println("Are both lion instances the same? " + (lion1 == lion2));
    }
}
