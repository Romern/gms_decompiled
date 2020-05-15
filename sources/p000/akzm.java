package p000;

import android.content.Context;

/* renamed from: akzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akzm {

    /* renamed from: a */
    private static bdtr f73170a;

    /* renamed from: a */
    public static synchronized bdtr m60712a(Context context) {
        bdtr bdtr;
        synchronized (akzm.class) {
            if (f73170a == null) {
                bdtt bdtt = new bdtt();
                bdtt.mo58364a(context);
                bdtt.mo58365a("octarine");
                f73170a = bdtt.mo58363a();
            }
            bdtr = f73170a;
        }
        return bdtr;
    }
}
