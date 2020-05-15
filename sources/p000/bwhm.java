package p000;

/* renamed from: bwhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwhm extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bwhm f159522h;

    /* renamed from: i */
    private static volatile bxxk f159523i;

    /* renamed from: a */
    public int f159524a;

    /* renamed from: b */
    public long f159525b;

    /* renamed from: c */
    public bmnr f159526c;

    /* renamed from: d */
    public bwiu f159527d;

    /* renamed from: e */
    public bwiv f159528e;

    /* renamed from: f */
    public int f159529f;

    /* renamed from: g */
    public boolean f159530g;

    static {
        bwhm bwhm = new bwhm();
        f159522h = bwhm;
        GeneratedMessageLite.m124024a(bwhm.class, bwhm);
    }

    private bwhm() {
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
            return GeneratedMessageLite.m124022a(f159522h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\bဇ\u0005\tဌ\u0004\nဉ\u0002", new Object[]{"a", "b", "c", "e", "g", "f", bwhk.f159521a, "d"});
        } else if (i2 == 3) {
            return new bwhm();
        } else {
            if (i2 == 4) {
                return new bxvd(f159522h);
            }
            if (i2 == 5) {
                return f159522h;
            }
            bxxk bxxk = f159523i;
            if (bxxk == null) {
                synchronized (bwhm.class) {
                    bxxk = f159523i;
                    if (bxxk == null) {
                        bxxk = new bxve(f159522h);
                        f159523i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
