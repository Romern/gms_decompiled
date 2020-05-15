package p000;

/* renamed from: budx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budx extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final budx f153536m;

    /* renamed from: o */
    private static volatile bxxk f153537o;

    /* renamed from: a */
    public float f153538a;

    /* renamed from: b */
    public long f153539b;

    /* renamed from: c */
    public bxwc f153540c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f153541d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f153542e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f153543f = bxxn.f165040b;

    /* renamed from: g */
    public float f153544g;

    /* renamed from: h */
    public float f153545h;

    /* renamed from: i */
    public bxwc f153546i = bxxn.f165040b;

    /* renamed from: j */
    public bxwc f153547j = bxxn.f165040b;

    /* renamed from: k */
    public float f153548k;

    /* renamed from: l */
    public bxwc f153549l = bxxn.f165040b;

    /* renamed from: n */
    private int f153550n;

    static {
        budx budx = new budx();
        f153536m = budx;
        GeneratedMessageLite.m124024a(budx.class, budx);
    }

    private budx() {
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
            return GeneratedMessageLite.m124022a(f153536m, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0007\u0000\u0001ခ\u0000\u0002ဃ\u0001\u0003\u001b\u0004\u001b\u0005ခ\u0002\u0006ခ\u0003\u0007\u001b\b\u001b\tခ\u0004\n\u001b\u000b\u001b\f\u001b", new Object[]{"n", "a", "b", "c", buem.class, "f", buej.class, "g", "h", "i", budu.class, "j", budu.class, "k", "l", budv.class, "d", buem.class, "e", buem.class});
        } else if (i2 == 3) {
            return new budx();
        } else {
            if (i2 == 4) {
                return new bxvd(f153536m);
            }
            if (i2 == 5) {
                return f153536m;
            }
            bxxk bxxk = f153537o;
            if (bxxk == null) {
                synchronized (budx.class) {
                    bxxk = f153537o;
                    if (bxxk == null) {
                        bxxk = new bxve(f153536m);
                        f153537o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
