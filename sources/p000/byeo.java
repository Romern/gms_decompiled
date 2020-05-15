package p000;

/* renamed from: byeo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byeo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byeo f165930d;

    /* renamed from: e */
    private static volatile bxxk f165931e;

    /* renamed from: a */
    public int f165932a;

    /* renamed from: b */
    public byen f165933b;

    /* renamed from: c */
    public byen f165934c;

    static {
        byeo byeo = new byeo();
        f165930d = byeo;
        bxvk.m124024a(byeo.class, byeo);
    }

    private byeo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f165930d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byeo();
        } else {
            if (i2 == 4) {
                return new bxvd(f165930d);
            }
            if (i2 == 5) {
                return f165930d;
            }
            bxxk bxxk = f165931e;
            if (bxxk == null) {
                synchronized (byeo.class) {
                    bxxk = f165931e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165930d);
                        f165931e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
