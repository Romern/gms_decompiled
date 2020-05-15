package p000;

/* renamed from: bsrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsrw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bsrw f146804d;

    /* renamed from: e */
    private static volatile bxxk f146805e;

    /* renamed from: a */
    public int f146806a;

    /* renamed from: b */
    public int f146807b;

    /* renamed from: c */
    public bssl f146808c;

    static {
        bsrw bsrw = new bsrw();
        f146804d = bsrw;
        bxvk.m124024a(bsrw.class, bsrw);
    }

    private bsrw() {
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
            return bxvk.m124022a(f146804d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", bsrv.f146803a, "c"});
        } else if (i2 == 3) {
            return new bsrw();
        } else {
            if (i2 == 4) {
                return new bxvd(f146804d);
            }
            if (i2 == 5) {
                return f146804d;
            }
            bxxk bxxk = f146805e;
            if (bxxk == null) {
                synchronized (bsrw.class) {
                    bxxk = f146805e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146804d);
                        f146805e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
