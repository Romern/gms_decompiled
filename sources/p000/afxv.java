package p000;

import java.util.Map;

/* renamed from: afxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afxv {

    /* renamed from: a */
    public final bnhe f64949a;

    public afxv(Map map) {
        m53657a(!map.containsKey(afrg.UNKNOWN), "Sync handlers can't be registered for the UNKNOWN operation!");
        this.f64949a = bnmt.m109791a(map);
    }

    /* renamed from: a */
    public static void m53657a(boolean z, String str) {
        if (!z) {
            throw new afxr(str);
        }
    }
}
