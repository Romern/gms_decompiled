package p000;

import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.util.Log;
import com.google.android.gms.common.stats.radio.NetworkActivityEvent;
import java.net.Socket;
import java.net.SocketException;

/* renamed from: shr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class shr {

    /* renamed from: a */
    private static rpr f44498a = null;

    /* renamed from: a */
    public static int m35311a(int i) {
        return i | (m35318c() << 28);
    }

    /* renamed from: b */
    private static rpr m35315b() {
        if (f44498a == null) {
            f44498a = rpr.m34216b();
        }
        return f44498a;
    }

    /* renamed from: c */
    private static int m35318c() {
        int a = srf.m36091a(m35315b());
        if (a == -1) {
            return 7;
        }
        return a;
    }

    /* renamed from: a */
    public static void m35312a() {
        TrafficStats.clearThreadStatsTag();
        TrafficStats.clearThreadStatsUid();
    }

    /* renamed from: b */
    public static void m35316b(int i) {
        m35313a(i, -1);
    }

    /* renamed from: a */
    public static void m35313a(int i, int i2) {
        int i3;
        TrafficStats.setThreadStatsTag(m35311a(i));
        if (i2 == -1) {
            TrafficStats.clearThreadStatsUid();
        } else {
            TrafficStats.setThreadStatsUid(i2);
        }
        if (cdna.m134125f()) {
            NetworkInfo d = ssk.m36240d(m35315b());
            if (d != null) {
                i3 = d.getType();
            } else {
                i3 = -1;
            }
            m35315b().getNetworkActivityLogger().logAsync(new NetworkActivityEvent(System.currentTimeMillis(), i3, i, m35318c(), ssk.m36241e(m35315b())));
        }
    }

    /* renamed from: b */
    public static void m35317b(Socket socket) {
        try {
            TrafficStats.untagSocket(socket);
        } catch (SocketException e) {
            Log.w("GmsNetworkTrafficStats", "failed to untag socket", e);
        }
    }

    /* renamed from: a */
    public static void m35314a(Socket socket) {
        try {
            TrafficStats.tagSocket(socket);
        } catch (SocketException e) {
            Log.w("GmsNetworkTrafficStats", "failed to tag socket", e);
        }
    }
}
