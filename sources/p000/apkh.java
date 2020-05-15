package p000;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/* renamed from: apkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apkh implements apkd {
    /* renamed from: a */
    public final boolean mo47354a(Uri uri, int i) {
        Socket socket;
        try {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(InetAddress.getByName(uri.getHost()), uri.getPort());
            socket = new Socket();
            socket.connect(inetSocketAddress, i);
            socket.close();
            return true;
        } catch (IOException | IllegalArgumentException e) {
            Log.e("TcpReachabilityChecker", String.format("Error checking if %s:%d is reachable: %s", uri.getHost(), Integer.valueOf(uri.getPort()), e));
            return false;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
