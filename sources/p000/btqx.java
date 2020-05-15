package p000;

/* renamed from: btqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqx extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btqx f150050b;

    /* renamed from: c */
    private static volatile bxxk f150051c;

    /* renamed from: a */
    public btrg f150052a;

    static {
        btqx btqx = new btqx();
        f150050b = btqx;
        bxvk.m124024a(btqx.class, btqx);
    }

    private btqx() {
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
            return bxvk.m124022a(f150050b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btqx();
        } else {
            if (i2 == 4) {
                return new bxvd(f150050b);
            }
            if (i2 == 5) {
                return f150050b;
            }
            bxxk bxxk = f150051c;
            if (bxxk == null) {
                synchronized (btqx.class) {
                    bxxk = f150051c;
                    if (bxxk == null) {
                        bxxk = new bxve(f150050b);
                        f150051c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
