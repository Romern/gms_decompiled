package p000;

/* renamed from: bver */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bver extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bver f155782d;

    /* renamed from: e */
    private static volatile bxxk f155783e;

    /* renamed from: a */
    public int f155784a;

    /* renamed from: b */
    public int f155785b;

    /* renamed from: c */
    public bveh f155786c;

    static {
        bver bver = new bver();
        f155782d = bver;
        bxvk.m124024a(bver.class, bver);
    }

    private bver() {
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
            return bxvk.m124022a(f155782d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", bvid.f156128a, "c"});
        } else if (i2 == 3) {
            return new bver();
        } else {
            if (i2 == 4) {
                return new bxvd(f155782d);
            }
            if (i2 == 5) {
                return f155782d;
            }
            bxxk bxxk = f155783e;
            if (bxxk == null) {
                synchronized (bver.class) {
                    bxxk = f155783e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155782d);
                        f155783e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
