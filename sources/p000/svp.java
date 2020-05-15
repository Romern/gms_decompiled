package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: svp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class svp {

    /* renamed from: a */
    private static Context f45243a;

    /* renamed from: b */
    private static Boolean f45244b;

    /* renamed from: a */
    public static synchronized boolean m36471a(Context context) {
        synchronized (svp.class) {
            Context applicationContext = context.getApplicationContext();
            if (f45243a != null) {
                if (f45244b != null && f45243a == applicationContext) {
                    boolean booleanValue = f45244b.booleanValue();
                    return booleanValue;
                }
            }
            f45244b = null;
            int i = Build.VERSION.SDK_INT;
            Boolean valueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            f45244b = valueOf;
            f45243a = applicationContext;
            boolean booleanValue2 = valueOf.booleanValue();
            return booleanValue2;
        }
    }
}
