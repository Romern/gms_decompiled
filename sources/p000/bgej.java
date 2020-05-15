package p000;

/* renamed from: bgej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgej {

    /* renamed from: c */
    private static bgej f116275c;

    /* renamed from: a */
    public final bgmi f116276a;

    /* renamed from: b */
    public long f116277b = Long.MAX_VALUE;

    private bgej(bgmi bgmi) {
        this.f116276a = bgmi;
    }

    /* renamed from: a */
    public static synchronized bgej m98704a(bgmi bgmi) {
        bgej bgej;
        synchronized (bgej.class) {
            if (f116275c == null) {
                f116275c = new bgej(bgmi);
            }
            bgej = f116275c;
        }
        return bgej;
    }
}
