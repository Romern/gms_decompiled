package p000;

/* renamed from: jvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jvo {

    /* renamed from: c */
    private static jvo f23372c;

    /* renamed from: a */
    public long f23373a = -1;

    /* renamed from: b */
    public final Object f23374b = new Object();

    private jvo() {
    }

    /* renamed from: a */
    public static synchronized jvo m17402a() {
        jvo jvo;
        synchronized (jvo.class) {
            if (f23372c == null) {
                f23372c = new jvo();
            }
            jvo = f23372c;
        }
        return jvo;
    }
}
