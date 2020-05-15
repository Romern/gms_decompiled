package p000;

/* renamed from: bvgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgv extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bvgv f156046f;

    /* renamed from: g */
    private static volatile bxxk f156047g;

    /* renamed from: a */
    public int f156048a;

    /* renamed from: b */
    public int f156049b = 0;

    /* renamed from: c */
    public Object f156050c;

    /* renamed from: d */
    public bvgr f156051d;

    /* renamed from: e */
    public int f156052e;

    static {
        bvgv bvgv = new bvgv();
        f156046f = bvgv;
        GeneratedMessageLite.m124024a(bvgv.class, bvgv);
    }

    private bvgv() {
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
            return GeneratedMessageLite.m124022a(f156046f, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"c", "b", "a", "d", "e", bvgu.f156045a, bvgq.class, bvgn.class, bvgp.class, bvgs.class});
        } else if (i2 == 3) {
            return new bvgv();
        } else {
            if (i2 == 4) {
                return new bxvd(f156046f);
            }
            if (i2 == 5) {
                return f156046f;
            }
            bxxk bxxk = f156047g;
            if (bxxk == null) {
                synchronized (bvgv.class) {
                    bxxk = f156047g;
                    if (bxxk == null) {
                        bxxk = new bxve(f156046f);
                        f156047g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
