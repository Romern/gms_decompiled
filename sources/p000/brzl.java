package p000;

/* renamed from: brzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final brzl f143752c;

    /* renamed from: d */
    private static volatile bxxk f143753d;

    /* renamed from: a */
    public int f143754a = 0;

    /* renamed from: b */
    public Object f143755b;

    static {
        brzl brzl = new brzl();
        f143752c = brzl;
        GeneratedMessageLite.m124024a(brzl.class, brzl);
    }

    private brzl() {
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
            return GeneratedMessageLite.m124022a(f143752c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဵ\u0000\u0002ဳ\u0000\u0003ြ\u0000", new Object[]{"b", "a", brzj.class});
        } else if (i2 == 3) {
            return new brzl();
        } else {
            if (i2 == 4) {
                return new bxvd(f143752c);
            }
            if (i2 == 5) {
                return f143752c;
            }
            bxxk bxxk = f143753d;
            if (bxxk == null) {
                synchronized (brzl.class) {
                    bxxk = f143753d;
                    if (bxxk == null) {
                        bxxk = new bxve(f143752c);
                        f143753d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
