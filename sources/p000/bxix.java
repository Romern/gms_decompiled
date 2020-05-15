package p000;

/* renamed from: bxix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxix extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxix f163580d;

    /* renamed from: e */
    private static volatile bxxk f163581e;

    /* renamed from: a */
    public int f163582a;

    /* renamed from: b */
    public int f163583b;

    /* renamed from: c */
    public bxil f163584c;

    static {
        bxix bxix = new bxix();
        f163580d = bxix;
        bxvk.m124024a(bxix.class, bxix);
    }

    private bxix() {
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
            return bxvk.m124022a(f163580d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", bxiw.f163579a, "c"});
        } else if (i2 == 3) {
            return new bxix();
        } else {
            if (i2 == 4) {
                return new bxvd(f163580d);
            }
            if (i2 == 5) {
                return f163580d;
            }
            bxxk bxxk = f163581e;
            if (bxxk == null) {
                synchronized (bxix.class) {
                    bxxk = f163581e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163580d);
                        f163581e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
