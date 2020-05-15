package p000;

import android.net.wifi.WifiInfo;
import android.os.SystemClock;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* renamed from: oto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oto implements Runnable {

    /* renamed from: a */
    public int f38414a = 0;

    /* renamed from: b */
    final /* synthetic */ String f38415b;

    /* renamed from: c */
    final /* synthetic */ int f38416c;

    /* renamed from: d */
    final /* synthetic */ boolean f38417d;

    /* renamed from: e */
    final /* synthetic */ WifiInfo f38418e;

    /* renamed from: f */
    final /* synthetic */ C1585otp f38419f;

    public oto(C1585otp otp, String str, int i, boolean z, WifiInfo wifiInfo) {
        this.f38419f = otp;
        this.f38415b = str;
        this.f38416c = i;
        this.f38417d = z;
        this.f38418e = wifiInfo;
    }

    public final void run() {
        try {
            Socket socket = new Socket();
            if (ccws.m131956b() > 0) {
                socket.setSendBufferSize((int) ccws.m131956b());
            }
            if (ccws.f180121a.mo6606a().mo76956c()) {
                socket.setTcpNoDelay(true);
            }
            if (ccws.m131957c() > 0) {
                socket.setSoTimeout((int) ccws.m131957c());
            }
            if (this.f38419f.f38423d) {
                shr.m35316b(768);
                shr.m35314a(socket);
                shr.m35312a();
            }
            socket.bind(null);
            socket.connect(new InetSocketAddress(this.f38415b, this.f38416c), 10000);
            this.f38419f.f38422c.mo22619a(1, Integer.valueOf(this.f38414a), Integer.valueOf(this.f38419f.f38429j), 0, Integer.valueOf((int) (SystemClock.elapsedRealtime() - this.f38419f.f38430k)));
            this.f38419f.f38425f.post(new otm(this, socket));
        } catch (IOException e) {
            int i = this.f38414a;
            if (i < 2) {
                bnsn bnsn = C1585otp.f38420a;
                this.f38414a = i + 1;
                C1585otp otp = this.f38419f;
                otp.f38427h = ((sny) otp.f38426g).schedule(this, 1000, TimeUnit.MILLISECONDS);
                return;
            }
            this.f38419f.f38425f.post(new otn(this, this.f38417d, this.f38415b, this.f38416c, this.f38418e));
        }
    }
}
