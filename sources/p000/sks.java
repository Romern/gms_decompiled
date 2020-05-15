package p000;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: sks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sks {

    /* renamed from: a */
    private static WeakReference f44648a;

    /* renamed from: a */
    public static int m35542a(String str) {
        if (str.contains("wlan")) {
            return 1;
        }
        if (!str.contains("eth")) {
            return !str.contains("rmnet") ? -1 : 0;
        }
        return 3;
    }

    /* renamed from: b */
    private static synchronized rtj m35545b() {
        synchronized (sks.class) {
            if (f44648a != null) {
                rtj rtj = (rtj) f44648a.get();
                if (rtj != null) {
                    return rtj;
                }
            }
            rtj rtj2 = new rtj(rpr.m34216b(), "InterfaceTypeMap", true, true);
            f44648a = new WeakReference(rtj2);
            return rtj2;
        }
    }

    /* renamed from: a */
    public static String m35543a(int i) {
        if (i == 0) {
            return "MOBILE";
        }
        if (i != 1) {
            return i != 3 ? Integer.toString(i) : "ETHERNET";
        }
        return "WIFI";
    }

    /* renamed from: a */
    public static Map m35544a() {
        return m35545b().getAll();
    }
}
