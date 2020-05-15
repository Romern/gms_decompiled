package p000;

/* renamed from: bvvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvvx extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bvvx f157863g;

    /* renamed from: h */
    private static volatile bxxk f157864h;

    /* renamed from: a */
    public int f157865a;

    /* renamed from: b */
    public int f157866b;

    /* renamed from: c */
    public long f157867c;

    /* renamed from: d */
    public long f157868d;

    /* renamed from: e */
    public long f157869e;

    /* renamed from: f */
    public boolean f157870f;

    static {
        bvvx bvvx = new bvvx();
        f157863g = bvvx;
        GeneratedMessageLite.m124024a(bvvx.class, bvvx);
    }

    private bvvx() {
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
            return GeneratedMessageLite.m124022a(f157863g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", bvvw.f157862a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bvvx();
        } else {
            if (i2 == 4) {
                return new bxvd(f157863g);
            }
            if (i2 == 5) {
                return f157863g;
            }
            bxxk bxxk = f157864h;
            if (bxxk == null) {
                synchronized (bvvx.class) {
                    bxxk = f157864h;
                    if (bxxk == null) {
                        bxxk = new bxve(f157863g);
                        f157864h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
