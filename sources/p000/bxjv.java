package p000;

/* renamed from: bxjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxjv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxjv f163686d;

    /* renamed from: f */
    private static volatile bxxk f163687f;

    /* renamed from: a */
    public bxjd f163688a;

    /* renamed from: b */
    public bxwc f163689b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f163690c = bxxn.f165040b;

    /* renamed from: e */
    private int f163691e;

    static {
        bxjv bxjv = new bxjv();
        f163686d = bxjv;
        bxvk.m124024a(bxjv.class, bxjv);
    }

    private bxjv() {
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
            return bxvk.m124022a(f163686d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001c\u0003\u001b", new Object[]{"e", "a", "b", "c", bxii.class});
        } else if (i2 == 3) {
            return new bxjv();
        } else {
            if (i2 == 4) {
                return new bxvd(f163686d);
            }
            if (i2 == 5) {
                return f163686d;
            }
            bxxk bxxk = f163687f;
            if (bxxk == null) {
                synchronized (bxjv.class) {
                    bxxk = f163687f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163686d);
                        f163687f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
