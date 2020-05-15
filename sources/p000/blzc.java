package p000;

/* renamed from: blzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blzc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blzc f128332c;

    /* renamed from: d */
    private static volatile bxxk f128333d;

    /* renamed from: a */
    public bxwc f128334a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f128335b = bxxn.f165040b;

    static {
        blzc blzc = new blzc();
        f128332c = blzc;
        bxvk.m124024a(blzc.class, blzc);
    }

    private blzc() {
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
            return bxvk.m124022a(f128332c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", blyw.class, "b", blzb.class});
        } else if (i2 == 3) {
            return new blzc();
        } else {
            if (i2 == 4) {
                return new bxvd(f128332c);
            }
            if (i2 == 5) {
                return f128332c;
            }
            bxxk bxxk = f128333d;
            if (bxxk == null) {
                synchronized (blzc.class) {
                    bxxk = f128333d;
                    if (bxxk == null) {
                        bxxk = new bxve(f128332c);
                        f128333d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
