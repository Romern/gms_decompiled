package p000;

import android.net.TrafficStats;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* renamed from: baxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baxq extends SocketFactory {

    /* renamed from: a */
    private final SocketFactory f102056a;

    /* renamed from: b */
    private final int f102057b;

    public baxq(SocketFactory socketFactory, int i) {
        this.f102056a = socketFactory;
        this.f102057b = i;
    }

    public final Socket createSocket() {
        Socket createSocket = this.f102056a.createSocket();
        TrafficStats.setThreadStatsTag(this.f102057b);
        TrafficStats.tagSocket(createSocket);
        return createSocket;
    }

    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f102056a.createSocket(str, i);
        TrafficStats.setThreadStatsTag(this.f102057b);
        TrafficStats.tagSocket(createSocket);
        return createSocket;
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f102056a.createSocket(str, i, inetAddress, i2);
        TrafficStats.setThreadStatsTag(this.f102057b);
        TrafficStats.tagSocket(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f102056a.createSocket(inetAddress, i);
        TrafficStats.setThreadStatsTag(this.f102057b);
        TrafficStats.tagSocket(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f102056a.createSocket(inetAddress, i, inetAddress2, i2);
        TrafficStats.setThreadStatsTag(this.f102057b);
        TrafficStats.tagSocket(createSocket);
        return createSocket;
    }
}
