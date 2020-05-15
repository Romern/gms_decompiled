package p000;

/* renamed from: slh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class slh {

    /* renamed from: a */
    public static slg f44684a;

    /* renamed from: a */
    public static synchronized boolean m35572a(slg slg) {
        boolean z;
        synchronized (slh.class) {
            if (f44684a == null) {
                f44684a = slg;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
