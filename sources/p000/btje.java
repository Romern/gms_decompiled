package p000;

/* renamed from: btje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btje extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btje f149102b;

    /* renamed from: c */
    private static volatile bxxk f149103c;

    /* renamed from: a */
    public bxwc f149104a = bxxn.f165040b;

    static {
        btje btje = new btje();
        f149102b = btje;
        bxvk.m124024a(btje.class, btje);
    }

    private btje() {
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
            return bxvk.m124022a(f149102b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", btjk.class});
        } else if (i2 == 3) {
            return new btje();
        } else {
            if (i2 == 4) {
                return new bxvd(f149102b);
            }
            if (i2 == 5) {
                return f149102b;
            }
            bxxk bxxk = f149103c;
            if (bxxk == null) {
                synchronized (btje.class) {
                    bxxk = f149103c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149102b);
                        f149103c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
