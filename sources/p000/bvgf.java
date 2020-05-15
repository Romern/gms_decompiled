package p000;

/* renamed from: bvgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvgf f155994d;

    /* renamed from: e */
    private static volatile bxxk f155995e;

    /* renamed from: a */
    public int f155996a;

    /* renamed from: b */
    public ByteString f155997b = ByteString.f164797b;

    /* renamed from: c */
    public int f155998c;

    static {
        bvgf bvgf = new bvgf();
        f155994d = bvgf;
        GeneratedMessageLite.m124024a(bvgf.class, bvgf);
    }

    private bvgf() {
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
            return GeneratedMessageLite.m124022a(f155994d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bvgj.f156006a});
        } else if (i2 == 3) {
            return new bvgf();
        } else {
            if (i2 == 4) {
                return new bxvd(f155994d);
            }
            if (i2 == 5) {
                return f155994d;
            }
            bxxk bxxk = f155995e;
            if (bxxk == null) {
                synchronized (bvgf.class) {
                    bxxk = f155995e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155994d);
                        f155995e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
