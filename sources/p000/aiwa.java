package p000;

import android.content.Context;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: aiwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiwa {

    /* renamed from: a */
    public static final long f69919a = TimeUnit.SECONDS.toMillis(11);

    /* renamed from: b */
    private final Context f69920b;

    /* renamed from: c */
    private final WifiP2pManager f69921c;

    /* renamed from: d */
    private WifiP2pManager.Channel f69922d;

    /* renamed from: e */
    private final Set f69923e = new C1225nr();

    /* renamed from: f */
    private long f69924f;

    public aiwa(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f69920b = applicationContext;
        this.f69921c = (WifiP2pManager) applicationContext.getSystemService("wifip2p");
    }

    /* renamed from: b */
    public static boolean m58045b() {
        if (ssw.m36269a()) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        if (Build.ID.contains("QQ3") || Build.ID.contains("QQ2")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized WifiP2pManager.Channel mo38143a(int i) {
        if (this.f69922d == null) {
            aivz aivz = new aivz(this);
            WifiP2pManager.Channel initialize = this.f69921c.initialize(this.f69920b, Looper.getMainLooper(), aivz);
            aivz.f69917a = initialize;
            this.f69922d = initialize;
            if (initialize != null) {
                srn srn = ailf.f69111a;
            } else {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aiwa", "a", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("WiFi Direct failed to initialize a channel.");
                return null;
            }
        }
        this.f69923e.add(Integer.valueOf(i));
        return this.f69922d;
    }

    /* renamed from: b */
    public final synchronized void mo38146b(int i) {
        if (this.f69922d != null) {
            this.f69923e.remove(Integer.valueOf(i));
            if (i == 3) {
                this.f69924f = SystemClock.elapsedRealtime() + f69919a;
            }
            if (this.f69923e.isEmpty()) {
                mo38144a();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo38144a() {
        mo38145a(this.f69922d);
    }

    /* renamed from: a */
    public final synchronized void mo38145a(WifiP2pManager.Channel channel) {
        long j;
        if (channel != null) {
            boolean z = false;
            if (this.f69924f == 0 && !this.f69923e.contains(3)) {
                z = true;
            }
            if (!m58045b()) {
                if (!z) {
                    if (!this.f69923e.contains(3)) {
                        j = this.f69924f - SystemClock.elapsedRealtime();
                    } else {
                        j = f69919a;
                    }
                    if (j > 0) {
                        new aivy(10, j, channel, "WifiDirect").start();
                    } else {
                        channel.close();
                    }
                    this.f69922d = null;
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                    bnsl.mo68432a("aiwa", "a", 136, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Closed WiFi Direct channel.");
                }
            }
            channel.close();
            this.f69922d = null;
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aiwa", "a", 136, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Closed WiFi Direct channel.");
        }
        this.f69923e.clear();
        this.f69924f = 0;
    }
}
