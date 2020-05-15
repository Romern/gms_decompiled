package p000;

/* renamed from: btip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btip extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btip f149008e;

    /* renamed from: f */
    private static volatile bxxk f149009f;

    /* renamed from: a */
    public camk f149010a;

    /* renamed from: b */
    public String f149011b = "";

    /* renamed from: c */
    public long f149012c;

    /* renamed from: d */
    public bxtx f149013d = bxtx.f164797b;

    static {
        btip btip = new btip();
        f149008e = btip;
        bxvk.m124024a(btip.class, btip);
    }

    private btip() {
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
            return bxvk.m124022a(f149008e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\u0002\u0004\n", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btip();
        } else {
            if (i2 == 4) {
                return new bxvd(f149008e);
            }
            if (i2 == 5) {
                return f149008e;
            }
            bxxk bxxk = f149009f;
            if (bxxk == null) {
                synchronized (btip.class) {
                    bxxk = f149009f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149008e);
                        f149009f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
