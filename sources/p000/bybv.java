package p000;

/* renamed from: bybv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybv extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bybv f165600b;

    /* renamed from: c */
    private static volatile bxxk f165601c;

    /* renamed from: a */
    public String f165602a = "";

    static {
        bybv bybv = new bybv();
        f165600b = bybv;
        bxvk.m124024a(bybv.class, bybv);
    }

    private bybv() {
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
            return bxvk.m124022a(f165600b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bybv();
        } else {
            if (i2 == 4) {
                return new bxvd(f165600b);
            }
            if (i2 == 5) {
                return f165600b;
            }
            bxxk bxxk = f165601c;
            if (bxxk == null) {
                synchronized (bybv.class) {
                    bxxk = f165601c;
                    if (bxxk == null) {
                        bxxk = new bxve(f165600b);
                        f165601c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
