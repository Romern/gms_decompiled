package p000;

import android.net.Network;
import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.Callable;

/* renamed from: ainq */
final /* synthetic */ class ainq implements Callable {

    /* renamed from: a */
    private final ains f69272a;

    /* renamed from: b */
    private final int f69273b;

    /* renamed from: c */
    private final String f69274c;

    public ainq(ains ains, int i, String str) {
        this.f69272a = ains;
        this.f69273b = i;
        this.f69274c = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0087 A[SYNTHETIC, Splitter:B:18:0x0087] */
    public final Object call() {
        Socket socket;
        ains ains = this.f69272a;
        int i = this.f69273b;
        String str = this.f69274c;
        try {
            ails.m57439a();
            socket = ainv.m57524a();
            int i2 = Build.VERSION.SDK_INT;
            Network[] c = ains.mo37729c();
            int length = c.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    Network network = c[i3];
                    if (ains.f69279b.getNetworkInfo(network).getType() == 1) {
                        network.bindSocket(socket);
                        break;
                    }
                    i3++;
                }
            }
            try {
                srn srn = ailf.f69111a;
                ails.m57449c(ains.f69278a.getDhcpInfo().gateway);
                socket.connect(new InetSocketAddress(ails.m57449c(ains.f69278a.getDhcpInfo().gateway), i), (int) cfnv.f184625a.mo6606a().mo81796bB());
                bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                bnsl.mo68432a("ains", "a", 2241, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Successfully connected via a Wifi socket to %s.", str);
                aiwd aiwd = new aiwd(socket);
                ails.m57447b();
                return aiwd;
            } catch (IOException e) {
                e = e;
                if (socket != null) {
                    try {
                        socket.close();
                        srn srn2 = ailf.f69111a;
                    } catch (IOException e2) {
                        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                        bnsl2.mo68437a(e2);
                        bnsl2.mo68432a("ails", "a", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68424a("Failed to close %sSocket %s", "WifiHotspot", str);
                    } catch (Throwable th) {
                        ails.m57447b();
                        throw th;
                    }
                }
                throw new RuntimeException(String.format("Failed to connect via a Wifi socket to %s.", str), e);
            }
        } catch (IOException e3) {
            e = e3;
            socket = null;
            if (socket != null) {
            }
            throw new RuntimeException(String.format("Failed to connect via a Wifi socket to %s.", str), e);
        }
    }
}
