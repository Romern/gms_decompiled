package p000;

/* renamed from: boip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boip extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final boip f133201h;

    /* renamed from: i */
    private static volatile bxxk f133202i;

    /* renamed from: a */
    public int f133203a;

    /* renamed from: b */
    public boje f133204b;

    /* renamed from: c */
    public int f133205c;

    /* renamed from: d */
    public int f133206d;

    /* renamed from: e */
    public boolean f133207e;

    /* renamed from: f */
    public boiz f133208f;

    /* renamed from: g */
    public int f133209g;

    static {
        boip boip = new boip();
        f133201h = boip;
        GeneratedMessageLite.m124024a(boip.class, boip);
    }

    private boip() {
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
            return GeneratedMessageLite.m124022a(f133201h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0006ဉ\u0005\u0007ဌ\u0006", new Object[]{"a", "b", "c", bojc.f133262a, "d", boio.f133200a, "e", "f", "g", bojb.f133261a});
        } else if (i2 == 3) {
            return new boip();
        } else {
            if (i2 == 4) {
                return new bxvd(f133201h);
            }
            if (i2 == 5) {
                return f133201h;
            }
            bxxk bxxk = f133202i;
            if (bxxk == null) {
                synchronized (boip.class) {
                    bxxk = f133202i;
                    if (bxxk == null) {
                        bxxk = new bxve(f133201h);
                        f133202i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
