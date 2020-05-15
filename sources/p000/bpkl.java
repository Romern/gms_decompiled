package p000;

/* renamed from: bpkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpkl extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bpkl f137979g;

    /* renamed from: h */
    private static volatile bxxk f137980h;

    /* renamed from: a */
    public int f137981a;

    /* renamed from: b */
    public int f137982b;

    /* renamed from: c */
    public bpkm f137983c;

    /* renamed from: d */
    public bpkq f137984d;

    /* renamed from: e */
    public bpkn f137985e;

    /* renamed from: f */
    public bpkp f137986f;

    static {
        bpkl bpkl = new bpkl();
        f137979g = bpkl;
        GeneratedMessageLite.m124024a(bpkl.class, bpkl);
    }

    private bpkl() {
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
            return GeneratedMessageLite.m124022a(f137979g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", bpkk.f137978a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpkl();
        } else {
            if (i2 == 4) {
                return new bxvd(f137979g);
            }
            if (i2 == 5) {
                return f137979g;
            }
            bxxk bxxk = f137980h;
            if (bxxk == null) {
                synchronized (bpkl.class) {
                    bxxk = f137980h;
                    if (bxxk == null) {
                        bxxk = new bxve(f137979g);
                        f137980h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
