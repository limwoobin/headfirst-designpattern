package proxy.ex2;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
                            "rmi://boulder.mightygumball.com/gumballmachine",
                            "rmi://seattle.mightygumball.com/gumballmachine"};

        GumballMonitor[] monitors = new GumballMonitor[location.length];
        for (int i=0; i<monitors.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitors[i] = new GumballMonitor(machine);
                System.out.println(monitors[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (GumballMonitor monitor : monitors) {
            monitor.report();
        }
    }
}
