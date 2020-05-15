package p000;

/* renamed from: bvlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvlv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvlv f156599d;

    /* renamed from: e */
    private static volatile bxxk f156600e;

    /* renamed from: a */
    public int f156601a;

    /* renamed from: b */
    public bvow f156602b;

    /* renamed from: c */
    public int f156603c;

    static {
        bvlv bvlv = new bvlv();
        f156599d = bvlv;
        GeneratedMessageLite.m124024a(bvlv.class, bvlv);
    }

    private bvlv() {
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
            return GeneratedMessageLite.m124022a(f156599d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bvlt.f156598a});
        } else if (i2 == 3) {
            return new bvlv();
        } else {
            if (i2 == 4) {
                return new bxvd(f156599d);
            }
            if (i2 == 5) {
                return f156599d;
            }
            bxxk bxxk = f156600e;
            if (bxxk == null) {
                synchronized (bvlv.class) {
                    bxxk = f156600e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156599d);
                        f156600e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
