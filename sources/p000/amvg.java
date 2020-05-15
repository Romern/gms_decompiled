package p000;

import android.net.NetworkCapabilities;
import java.util.concurrent.TimeUnit;

/* renamed from: amvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amvg {

    /* renamed from: a */
    public static amvg f76001a;

    /* renamed from: c */
    private static long f76002c = 0;

    /* renamed from: b */
    public final ancw f76003b = anbx.INSTANCE;

    private amvg() {
        f76002c = 0;
    }

    /* renamed from: a */
    public static int m63358a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return 1;
        }
        if (networkCapabilities.hasTransport(1)) {
            return 2;
        }
        if (networkCapabilities.hasTransport(0)) {
            return 8;
        }
        if (networkCapabilities.hasTransport(2)) {
            return 9;
        }
        if (networkCapabilities.hasTransport(3)) {
            return 7;
        }
        return 1;
    }

    /* renamed from: a */
    public static synchronized amvg m63359a() {
        amvg amvg;
        synchronized (amvg.class) {
            if (f76001a == null) {
                f76001a = new amvg();
            }
            amvg = f76001a;
        }
        return amvg;
    }

    /* renamed from: a */
    public static void m63360a(int i, int i2, String str) {
        if (!cfvu.m143233b()) {
            return;
        }
        if (!cfvu.f185805a.mo6606a().mo82806h() || System.currentTimeMillis() - f76002c > TimeUnit.SECONDS.toMillis(cfvu.f185805a.mo6606a().mo82807i())) {
            bxvd da = amkx.f75126e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amkx amkx = (amkx) da.f164949b;
            amkx.f75129b = 1;
            int i3 = 1 | amkx.f75128a;
            amkx.f75128a = i3;
            amkx.f75130c = i - 1;
            int i4 = i3 | 2;
            amkx.f75128a = i4;
            amkx.f75131d = i2 - 1;
            amkx.f75128a = i4 | 4;
            almk.m61263a().mo40516a((amkx) da.mo74062i(), str);
            f76002c = System.currentTimeMillis();
        }
    }
}
