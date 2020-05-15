package p000;

/* renamed from: bslv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bslv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bslv f144965b;

    /* renamed from: c */
    private static volatile bxxk f144966c;

    /* renamed from: a */
    public bxwc f144967a = bxxn.f165040b;

    static {
        bslv bslv = new bslv();
        f144965b = bslv;
        GeneratedMessageLite.m124024a(bslv.class, bslv);
    }

    private bslv() {
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
            return GeneratedMessageLite.m124022a(f144965b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsmf.class});
        } else if (i2 == 3) {
            return new bslv();
        } else {
            if (i2 == 4) {
                return new bxvd(f144965b);
            }
            if (i2 == 5) {
                return f144965b;
            }
            bxxk bxxk = f144966c;
            if (bxxk == null) {
                synchronized (bslv.class) {
                    bxxk = f144966c;
                    if (bxxk == null) {
                        bxxk = new bxve(f144965b);
                        f144966c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
