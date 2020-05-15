package p000;

/* renamed from: botu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class botu extends bxvk implements bxxd {

    /* renamed from: b */
    public static final botu f134876b;

    /* renamed from: c */
    private static volatile bxxk f134877c;

    /* renamed from: a */
    public bxwc f134878a = bxxn.f165040b;

    static {
        botu botu = new botu();
        f134876b = botu;
        bxvk.m124024a(botu.class, botu);
    }

    private botu() {
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
            return bxvk.m124022a(f134876b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bott.class});
        } else if (i2 == 3) {
            return new botu();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f134876b;
            }
            bxxk bxxk = f134877c;
            if (bxxk == null) {
                synchronized (botu.class) {
                    bxxk = f134877c;
                    if (bxxk == null) {
                        bxxk = new bxve(f134876b);
                        f134877c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
