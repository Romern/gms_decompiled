package p000;

/* renamed from: bxrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxrw extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bxrw f164625g;

    /* renamed from: h */
    private static volatile bxxk f164626h;

    /* renamed from: a */
    public int f164627a;

    /* renamed from: b */
    public bxre f164628b;

    /* renamed from: c */
    public String f164629c = "";

    /* renamed from: d */
    public bxvt f164630d = bxvm.f164965b;

    /* renamed from: e */
    public bxss f164631e;

    /* renamed from: f */
    public bxwc f164632f = bxxn.f165040b;

    static {
        bxrw bxrw = new bxrw();
        f164625g = bxrw;
        GeneratedMessageLite.m124024a(bxrw.class, bxrw);
    }

    private bxrw() {
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
            return GeneratedMessageLite.m124022a(f164625g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0000\u0001\u0016\u0002ဉ\u0003\u0004ဉ\u0000\u0005ဈ\u0001\u0006\u001b", new Object[]{"a", "d", "e", "b", "c", "f", bxrq.class});
        } else if (i2 == 3) {
            return new bxrw();
        } else {
            if (i2 == 4) {
                return new bxrv();
            }
            if (i2 == 5) {
                return f164625g;
            }
            bxxk bxxk = f164626h;
            if (bxxk == null) {
                synchronized (bxrw.class) {
                    bxxk = f164626h;
                    if (bxxk == null) {
                        bxxk = new bxve(f164625g);
                        f164626h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
