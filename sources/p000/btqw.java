package p000;

/* renamed from: btqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btqw f150046c;

    /* renamed from: d */
    private static volatile bxxk f150047d;

    /* renamed from: a */
    public bxwc f150048a = bxxn.f165040b;

    /* renamed from: b */
    public bxvt f150049b = bxvm.f164965b;

    static {
        btqw btqw = new btqw();
        f150046c = btqw;
        bxvk.m124024a(btqw.class, btqw);
    }

    private btqw() {
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
            return bxvk.m124022a(f150046c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001b\u0003,", new Object[]{"a", btqv.class, "b"});
        } else if (i2 == 3) {
            return new btqw();
        } else {
            if (i2 == 4) {
                return new btqu();
            }
            if (i2 == 5) {
                return f150046c;
            }
            bxxk bxxk = f150047d;
            if (bxxk == null) {
                synchronized (btqw.class) {
                    bxxk = f150047d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150046c);
                        f150047d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
