package p000;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;

/* renamed from: aimw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aimw implements Runnable {

    /* renamed from: a */
    public aiwb f69213a;

    /* renamed from: b */
    final /* synthetic */ InetAddress f69214b;

    /* renamed from: c */
    final /* synthetic */ int f69215c;

    public aimw(InetAddress inetAddress, int i) {
        this.f69214b = inetAddress;
        this.f69215c = i;
    }

    public final void run() {
        try {
            ails.m57439a();
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(this.f69214b, this.f69215c), (int) cfnv.m140766ab());
            this.f69213a = new aiwb(socket);
        } catch (SocketTimeoutException e) {
            throw new RuntimeException(String.format("Timed out while trying to connect via a Wifi Direct socket to %s within %d milliseconds", this.f69214b, Long.valueOf(cfnv.m140766ab())), e);
        } catch (IOException e2) {
            throw new RuntimeException(String.format("WiFi Direct failed to connect to %s:%s", this.f69214b, Integer.valueOf(this.f69215c)), e2);
        }
    }
}
