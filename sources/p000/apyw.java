package p000;

import java.util.LinkedHashMap;

/* renamed from: apyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apyw {

    /* renamed from: a */
    public static final LinkedHashMap f85197a = new LinkedHashMap(16, 0.75f, true);

    static {
        apyw.class.getSimpleName();
    }

    private apyw() {
    }

    /* renamed from: a */
    public static byte[] m71203a(String str, long j) {
        if (str == null || str.isEmpty() || !f85197a.containsKey(str)) {
            return null;
        }
        aqdw aqdw = (aqdw) f85197a.get(str);
        if (aqdw.f85811c == j) {
            return aqdw.f85810b.mo73780k();
        }
        f85197a.remove(str);
        return null;
    }
}
