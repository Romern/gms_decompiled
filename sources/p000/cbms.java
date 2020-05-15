package p000;

/* renamed from: cbms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbms extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbms f177673b;

    /* renamed from: c */
    private static volatile bxxk f177674c;

    /* renamed from: a */
    public int f177675a;

    static {
        cbms cbms = new cbms();
        f177673b = cbms;
        bxvk.m124024a(cbms.class, cbms);
    }

    private cbms() {
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
            return bxvk.m124022a(f177673b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbms();
        } else {
            if (i2 == 4) {
                return new bxvd(f177673b);
            }
            if (i2 == 5) {
                return f177673b;
            }
            bxxk bxxk = f177674c;
            if (bxxk == null) {
                synchronized (cbms.class) {
                    bxxk = f177674c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177673b);
                        f177674c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
