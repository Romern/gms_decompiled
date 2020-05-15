package p000;

import android.content.Context;

/* renamed from: apbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apbg {

    /* renamed from: a */
    private static bdtr f84100a;

    /* renamed from: a */
    public static synchronized bdtr m69995a(Context context) {
        bdtr bdtr;
        synchronized (apbg.class) {
            if (f84100a == null) {
                Context applicationContext = context.getApplicationContext();
                bdtt bdtt = new bdtt();
                bdtt.mo58364a(applicationContext);
                bdtt.mo58365a("gmscoreinmemoryfacscache_contact_uploads");
                bdtt.f106427a.f106460c = new aytg();
                f84100a = bdtt.mo58363a();
            }
            bdtr = f84100a;
        }
        return bdtr;
    }
}
