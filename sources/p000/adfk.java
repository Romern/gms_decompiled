package p000;

import android.os.Build;

/* renamed from: adfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adfk {

    /* renamed from: a */
    private static int f61559a = 0;

    /* renamed from: b */
    private static boolean f61560b = false;

    /* renamed from: a */
    public static synchronized int m50305a() {
        int i;
        synchronized (adfk.class) {
            if (!f61560b) {
                int i2 = Build.VERSION.SDK_INT;
                f61559a = 1;
                f61560b = true;
            }
            i = f61559a;
        }
        return i;
    }
}
