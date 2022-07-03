public class UserThread extends Thread {

    private ToggleSwitch toggleSwitch;

    private final int TIME_SWITCHING_ON_THE_TOGGLE_SWITCH = 1000;
    private final int NUMBER = 5;
    private int count = 0;

    public UserThread(String name, ToggleSwitch toggleSwitch) {
        super(name);
        this.toggleSwitch = toggleSwitch;
    }

    @Override
    public void run() {
        while (count != NUMBER) {
            if (!toggleSwitch.isToggleSwitch()) {
                try {
                    Thread.sleep(TIME_SWITCHING_ON_THE_TOGGLE_SWITCH);
                    count++;
                    System.out.println(Thread.currentThread().getName() + " включил тумблер!");
                    toggleSwitch.setToggleSwitch(true);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
