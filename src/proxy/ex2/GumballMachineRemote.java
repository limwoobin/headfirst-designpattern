package proxy.ex2;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Skeleton
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
