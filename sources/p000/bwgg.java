package p000;

/* renamed from: bwgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgg extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwgg f159194d;

    /* renamed from: e */
    private static volatile bxxk f159195e;

    /* renamed from: a */
    public int f159196a;

    /* renamed from: b */
    public bmav f159197b;

    /* renamed from: c */
    public String f159198c = "";

    static {
        bwgg bwgg = new bwgg();
        f159194d = bwgg;
        bxvk.m124024a(bwgg.class, bwgg);
    }

    private bwgg() {
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
            return bxvk.m124022a(f159194d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwgg();
        } else {
            if (i2 == 4) {
                return new bxvd(f159194d);
            }
            if (i2 == 5) {
                return f159194d;
            }
            bxxk bxxk = f159195e;
            if (bxxk == null) {
                synchronized (bwgg.class) {
                    bxxk = f159195e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159194d);
                        f159195e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
