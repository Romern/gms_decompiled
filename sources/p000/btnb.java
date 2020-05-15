package p000;

/* renamed from: btnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btnb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btnb f149588b;

    /* renamed from: c */
    private static volatile bxxk f149589c;

    /* renamed from: a */
    public int f149590a;

    static {
        btnb btnb = new btnb();
        f149588b = btnb;
        bxvk.m124024a(btnb.class, btnb);
    }

    private btnb() {
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
            return bxvk.m124022a(f149588b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btnb();
        } else {
            if (i2 == 4) {
                return new bxvd(f149588b);
            }
            if (i2 == 5) {
                return f149588b;
            }
            bxxk bxxk = f149589c;
            if (bxxk == null) {
                synchronized (btnb.class) {
                    bxxk = f149589c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149588b);
                        f149589c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
