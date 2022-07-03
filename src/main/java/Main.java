public class Main {

    public static void main(String[] args) throws InterruptedException {
        ToggleSwitch toggleSwitch = new ToggleSwitch(false);

        Thread user = new UserThread("Пользователь", toggleSwitch);
        Thread toy = new ToyThread("Игрушка", toggleSwitch);

        user.start();
        toy.start();

        user.join();
        toy.interrupt();
    }
}
