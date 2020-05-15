package p000;

import android.net.wifi.WifiManager;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;

/* renamed from: aior */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aior extends airo {

    /* renamed from: a */
    public final WifiManager f69367a;

    /* renamed from: b */
    public final InetAddress f69368b;

    /* renamed from: c */
    public aiwf f69369c;

    /* renamed from: d */
    private final int f69370d;

    /* renamed from: e */
    private final String f69371e;

    /* renamed from: f */
    private final ahfk f69372f;

    public aior(WifiManager wifiManager, InetAddress inetAddress, int i, ahfk ahfk) {
        super(43, ahfk);
        this.f69367a = wifiManager;
        this.f69368b = inetAddress;
        this.f69370d = i;
        String valueOf = String.valueOf(inetAddress);
        int i2 = this.f69370d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append(valueOf);
        sb.append("::");
        sb.append(i2);
        this.f69371e = sb.toString();
        this.f69372f = ahfk;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aiox.a(android.net.wifi.WifiManager, java.net.InetAddress, boolean):void
     arg types: [android.net.wifi.WifiManager, java.net.InetAddress, int]
     candidates:
      aiox.a(java.net.InetAddress, int, ahfk):aiwf
      aiox.a(java.lang.String, com.google.android.gms.mdns.MdnsServiceInfo, ahok):void
      aiox.a(java.lang.String, java.lang.String, ahok):void
      aiox.a(android.net.wifi.WifiManager, java.net.InetAddress, boolean):void */
    /* renamed from: b */
    public final int mo37568b() {
        if (this.f69372f.mo36401b()) {
            srn srn = ailf.f69111a;
            return 3;
        }
        aiox.m57586a(this.f69367a, this.f69368b, true);
        ails.m57439a();
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(this.f69368b, this.f69370d), (int) cfnv.m140775ak());
            aiwf aiwf = new aiwf(socket);
            this.f69369c = aiwf;
            aiwf.mo37637a(new aioq(this));
        } catch (SocketTimeoutException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aior", "b", 1127, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68423a("Timed out while trying to connect via a Wifi LAN socket to %s within %d milliseconds.", this.f69371e, cfnv.m140775ak());
        } catch (IOException e2) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("aior", "b", 1131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to connect via a Wifi LAN socket to %s.", this.f69371e);
        } catch (Throwable th) {
            ails.m57447b();
            throw th;
        }
        ails.m57447b();
        if (this.f69369c != null) {
            srn srn2 = ailf.f69111a;
            return mo37899a(44);
        }
        aiox.m57586a(this.f69367a, this.f69368b, false);
        return 3;
    }
}
