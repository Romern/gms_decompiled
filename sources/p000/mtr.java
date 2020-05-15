package p000;

/* renamed from: mtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mtr extends bxvk implements bxxd {

    /* renamed from: h */
    public static final mtr f34701h;

    /* renamed from: i */
    private static volatile bxxk f34702i;

    /* renamed from: a */
    public int f34703a;

    /* renamed from: b */
    public int f34704b;

    /* renamed from: c */
    public int f34705c;

    /* renamed from: d */
    public int f34706d;

    /* renamed from: e */
    public int f34707e;

    /* renamed from: f */
    public long f34708f;

    /* renamed from: g */
    public long f34709g;

    static {
        mtr mtr = new mtr();
        f34701h = mtr;
        bxvk.m124024a(mtr.class, mtr);
    }

    private mtr() {
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
            return bxvk.m124022a(f34701h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new mtr();
        } else {
            if (i2 == 4) {
                return new bxvd(f34701h);
            }
            if (i2 == 5) {
                return f34701h;
            }
            bxxk bxxk = f34702i;
            if (bxxk == null) {
                synchronized (mtr.class) {
                    bxxk = f34702i;
                    if (bxxk == null) {
                        bxxk = new bxve(f34701h);
                        f34702i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
