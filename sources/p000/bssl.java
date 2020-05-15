package p000;

/* renamed from: bssl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssl extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bssl f146873c;

    /* renamed from: d */
    private static volatile bxxk f146874d;

    /* renamed from: a */
    public int f146875a;

    /* renamed from: b */
    public int f146876b;

    static {
        bssl bssl = new bssl();
        f146873c = bssl;
        bxvk.m124024a(bssl.class, bssl);
    }

    private bssl() {
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
            return bxvk.m124022a(f146873c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bssj.f146872a});
        } else if (i2 == 3) {
            return new bssl();
        } else {
            if (i2 == 4) {
                return new bxvd(f146873c);
            }
            if (i2 == 5) {
                return f146873c;
            }
            bxxk bxxk = f146874d;
            if (bxxk == null) {
                synchronized (bssl.class) {
                    bxxk = f146874d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146873c);
                        f146874d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
