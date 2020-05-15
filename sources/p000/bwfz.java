package p000;

/* renamed from: bwfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwfz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwfz f159157d;

    /* renamed from: e */
    private static volatile bxxk f159158e;

    /* renamed from: a */
    public int f159159a;

    /* renamed from: b */
    public int f159160b;

    /* renamed from: c */
    public boolean f159161c;

    static {
        bwfz bwfz = new bwfz();
        f159157d = bwfz;
        bxvk.m124024a(bwfz.class, bwfz);
    }

    private bwfz() {
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
            return bxvk.m124022a(f159157d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", bwfy.f159156a, "c"});
        } else if (i2 == 3) {
            return new bwfz();
        } else {
            if (i2 == 4) {
                return new bxvd(f159157d);
            }
            if (i2 == 5) {
                return f159157d;
            }
            bxxk bxxk = f159158e;
            if (bxxk == null) {
                synchronized (bwfz.class) {
                    bxxk = f159158e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159157d);
                        f159158e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
