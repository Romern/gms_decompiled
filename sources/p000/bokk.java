package p000;

/* renamed from: bokk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bokk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bokk f133422d;

    /* renamed from: e */
    private static volatile bxxk f133423e;

    /* renamed from: a */
    public int f133424a;

    /* renamed from: b */
    public int f133425b;

    /* renamed from: c */
    public String f133426c = "";

    static {
        bokk bokk = new bokk();
        f133422d = bokk;
        bxvk.m124024a(bokk.class, bokk);
    }

    private bokk() {
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
            return bxvk.m124022a(f133422d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bokj.f133421a, "c"});
        } else if (i2 == 3) {
            return new bokk();
        } else {
            if (i2 == 4) {
                return new bxvd(f133422d);
            }
            if (i2 == 5) {
                return f133422d;
            }
            bxxk bxxk = f133423e;
            if (bxxk == null) {
                synchronized (bokk.class) {
                    bxxk = f133423e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133422d);
                        f133423e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
