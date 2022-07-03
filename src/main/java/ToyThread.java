public class ToyThread extends Thread {

    private ToggleSwitch toggleSwitch;

    public ToyThread(String name, ToggleSwitch toggleSwitch) {
        super(name);
        this.toggleSwitch = toggleSwitch;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            if (toggleSwitch.isToggleSwitch()) {
                System.out.println(Thread.currentThread().getName() + " выключила тумблер!");
                toggleSwitch.setToggleSwitch(false);
            }
        }
    }
}
