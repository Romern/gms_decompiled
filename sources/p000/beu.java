package p000;

import java.util.Map;

/* renamed from: beu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beu {
    /* renamed from: a */
    public static String m2848a(String str) {
        if (m2849a().containsKey(bev.m2859b(str))) {
            return ((bia) m2849a().get(bev.m2859b(str))).f3270h;
        }
        return null;
    }

    /* renamed from: b */
    public static String m2852b(String str) {
        bhz bhz = new bhz();
        bhz.f3263a = bgt.m2993a("NFC_LUPC_DGI");
        bhz.f3264b = bgt.m2993a("NFC_LUPC_TAG");
        bhz.f3266d = Integer.parseInt(str, 16);
        bhw bhw = (bhw) m2849a().get(bhz);
        if (bhw != null) {
            return bhw.f3256e;
        }
        return null;
    }

    /* renamed from: a */
    public static Map m2849a() {
        return bet.m2847a().f3122d;
    }

    /* renamed from: a */
    public static void m2850a(bhz bhz) {
        bia bia = (bia) bet.m2847a().f3122d.remove(bhz);
    }

    /* renamed from: a */
    public static void m2851a(String str, bia bia) {
        m2849a().put(bev.m2859b(str), bia);
    }
}
