package p000;

/* renamed from: ryu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ryu {

    /* renamed from: a */
    private static boolean f43864a = false;

    /* renamed from: a */
    public static void m34677a() {
        synchronized (ryu.class) {
            if (!f43864a) {
                f43864a = true;
                new Thread(ryt.f43863a).start();
            }
        }
    }
}
