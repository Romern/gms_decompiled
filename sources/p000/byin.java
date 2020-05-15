package p000;

/* renamed from: byin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byin extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byin f166582b;

    /* renamed from: c */
    private static volatile bxxk f166583c;

    /* renamed from: a */
    public bxwc f166584a = bxxn.f165040b;

    static {
        byin byin = new byin();
        f166582b = byin;
        bxvk.m124024a(byin.class, byin);
    }

    private byin() {
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
            return bxvk.m124022a(f166582b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", byim.class});
        } else if (i2 == 3) {
            return new byin();
        } else {
            if (i2 == 4) {
                return new bxvd(f166582b);
            }
            if (i2 == 5) {
                return f166582b;
            }
            bxxk bxxk = f166583c;
            if (bxxk == null) {
                synchronized (byin.class) {
                    bxxk = f166583c;
                    if (bxxk == null) {
                        bxxk = new bxve(f166582b);
                        f166583c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
