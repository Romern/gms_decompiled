package p000;

/* renamed from: bku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bku extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bku f5035b;

    /* renamed from: c */
    private static volatile bxxk f5036c;

    /* renamed from: a */
    public bxwc f5037a = bxxn.f165040b;

    static {
        bku bku = new bku();
        f5035b = bku;
        bxvk.m124024a(bku.class, bku);
    }

    private bku() {
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
            return bxvk.m124022a(f5035b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bkt.class});
        } else if (i2 == 3) {
            return new bku();
        } else {
            if (i2 == 4) {
                return new bxvd(f5035b);
            }
            if (i2 == 5) {
                return f5035b;
            }
            bxxk bxxk = f5036c;
            if (bxxk == null) {
                synchronized (bku.class) {
                    bxxk = f5036c;
                    if (bxxk == null) {
                        bxxk = new bxve(f5035b);
                        f5036c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
