package p000;

/* renamed from: mpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mpm extends bxvk implements bxxd {

    /* renamed from: i */
    public static final mpm f34178i;

    /* renamed from: j */
    private static volatile bxxk f34179j;

    /* renamed from: a */
    public int f34180a;

    /* renamed from: b */
    public int f34181b;

    /* renamed from: c */
    public mpq f34182c;

    /* renamed from: d */
    public mpg f34183d;

    /* renamed from: e */
    public mpn f34184e;

    /* renamed from: f */
    public mow f34185f;

    /* renamed from: g */
    public mpj f34186g;

    /* renamed from: h */
    public mpe f34187h;

    static {
        mpm mpm = new mpm();
        f34178i = mpm;
        bxvk.m124024a(mpm.class, mpm);
    }

    private mpm() {
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
            return bxvk.m124022a(f34178i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"a", "b", mpl.m25484b(), "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new mpm();
        } else {
            if (i2 == 4) {
                return new bxvd(f34178i);
            }
            if (i2 == 5) {
                return f34178i;
            }
            bxxk bxxk = f34179j;
            if (bxxk == null) {
                synchronized (mpm.class) {
                    bxxk = f34179j;
                    if (bxxk == null) {
                        bxxk = new bxve(f34178i);
                        f34179j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
