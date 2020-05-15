package p000;

import android.content.Context;

/* renamed from: ajvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajvy {

    /* renamed from: a */
    private static bdtr f71387a;

    /* renamed from: a */
    public static synchronized bdtr m59121a(Context context) {
        bdtr bdtr;
        synchronized (ajvy.class) {
            if (f71387a == null) {
                Context applicationContext = context.getApplicationContext();
                bdtt bdtt = new bdtt();
                bdtt.mo58364a(applicationContext);
                bdtt.mo58365a("gmscoreinmemoryfacscache_nearby_sharing");
                f71387a = bdtt.mo58363a();
            }
            bdtr = f71387a;
        }
        return bdtr;
    }
}
