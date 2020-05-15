package p000;

/* renamed from: bxpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpw extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bxpw f164324h;

    /* renamed from: i */
    private static volatile bxxk f164325i;

    /* renamed from: a */
    public int f164326a;

    /* renamed from: b */
    public int f164327b = 0;

    /* renamed from: c */
    public Object f164328c;

    /* renamed from: d */
    public int f164329d = 1;

    /* renamed from: e */
    public bxpp f164330e;

    /* renamed from: f */
    public bxpr f164331f;

    /* renamed from: g */
    public bxpv f164332g;

    static {
        bxpw bxpw = new bxpw();
        f164324h = bxpw;
        GeneratedMessageLite.m124024a(bxpw.class, bxpw);
    }

    private bxpw() {
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
            return GeneratedMessageLite.m124022a(f164324h, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001ြ\u0000\u0002င\u0006\u0003ြ\u0000\u0004ဉ\u0007\u0005ဉ\b\u0006ဉ\t\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000", new Object[]{"c", "b", "a", bxod.class, "d", bxot.class, "e", "f", "g", bxoj.class, bxon.class, bxpa.class, bxof.class});
        } else if (i2 == 3) {
            return new bxpw();
        } else {
            if (i2 == 4) {
                return new bxvd(f164324h);
            }
            if (i2 == 5) {
                return f164324h;
            }
            bxxk bxxk = f164325i;
            if (bxxk == null) {
                synchronized (bxpw.class) {
                    bxxk = f164325i;
                    if (bxxk == null) {
                        bxxk = new bxve(f164324h);
                        f164325i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
