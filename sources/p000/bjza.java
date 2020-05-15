package p000;

import android.util.Log;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;

/* renamed from: bjza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjza {
    /* renamed from: a */
    public static ArrayList m104956a() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return arrayList;
            }
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        arrayList.add(nextElement);
                    }
                }
            }
        } catch (NullPointerException | SocketException e) {
            Log.e("NetUtils", "Unable to retrieve network interfaces", e);
        }
        return arrayList;
    }
}
