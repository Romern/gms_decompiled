package p000;

/* renamed from: zwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zwp {

    /* renamed from: b */
    private static zwp f56058b;

    /* renamed from: a */
    public final zwk f56059a = new zwk();

    /* renamed from: c */
    private final zwj f56060c = new zwj();

    static {
        zwp zwp = new zwp();
        synchronized (zwp.class) {
            f56058b = zwp;
        }
    }

    private zwp() {
    }

    /* renamed from: a */
    public static zwp m46613a() {
        zwp zwp;
        synchronized (zwp.class) {
            zwp = f56058b;
        }
        return zwp;
    }

    /* renamed from: b */
    public static zwj m46614b() {
        return m46613a().f56060c;
    }
}
