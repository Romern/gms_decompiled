package p000;

/* renamed from: bvnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvnv extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvnv f156966c;

    /* renamed from: e */
    private static volatile bxxk f156967e;

    /* renamed from: a */
    public int f156968a;

    /* renamed from: b */
    public int f156969b;

    /* renamed from: d */
    private int f156970d;

    static {
        bvnv bvnv = new bvnv();
        f156966c = bvnv;
        GeneratedMessageLite.m124024a(bvnv.class, bvnv);
    }

    private bvnv() {
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
            return GeneratedMessageLite.m124022a(f156966c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", bvnt.f156965a, "b", bvnr.f156964a});
        } else if (i2 == 3) {
            return new bvnv();
        } else {
            if (i2 == 4) {
                return new bxvd(f156966c);
            }
            if (i2 == 5) {
                return f156966c;
            }
            bxxk bxxk = f156967e;
            if (bxxk == null) {
                synchronized (bvnv.class) {
                    bxxk = f156967e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156966c);
                        f156967e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
