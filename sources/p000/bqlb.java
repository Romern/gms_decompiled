package p000;

/* renamed from: bqlb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqlb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bqlb f141072d;

    /* renamed from: e */
    private static volatile bxxk f141073e;

    /* renamed from: a */
    public String f141074a = "";

    /* renamed from: b */
    public boolean f141075b;

    /* renamed from: c */
    public boolean f141076c;

    static {
        bqlb bqlb = new bqlb();
        f141072d = bqlb;
        bxvk.m124024a(bqlb.class, bqlb);
    }

    private bqlb() {
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
            return bxvk.m124022a(f141072d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0004\u0007", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqlb();
        } else {
            if (i2 == 4) {
                return new bxvd(f141072d);
            }
            if (i2 == 5) {
                return f141072d;
            }
            bxxk bxxk = f141073e;
            if (bxxk == null) {
                synchronized (bqlb.class) {
                    bxxk = f141073e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141072d);
                        f141073e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
