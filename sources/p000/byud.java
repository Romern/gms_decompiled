package p000;

/* renamed from: byud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byud extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byud f167762b;

    /* renamed from: d */
    private static volatile bxxk f167763d;

    /* renamed from: a */
    public String f167764a = "";

    /* renamed from: c */
    private int f167765c;

    static {
        byud byud = new byud();
        f167762b = byud;
        bxvk.m124024a(byud.class, byud);
    }

    private byud() {
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
            return bxvk.m124022a(f167762b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new byud();
        } else {
            if (i2 == 4) {
                return new bxvd(f167762b);
            }
            if (i2 == 5) {
                return f167762b;
            }
            bxxk bxxk = f167763d;
            if (bxxk == null) {
                synchronized (byud.class) {
                    bxxk = f167763d;
                    if (bxxk == null) {
                        bxxk = new bxve(f167762b);
                        f167763d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
