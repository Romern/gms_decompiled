package p000;

/* renamed from: blt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blt f5116e;

    /* renamed from: f */
    private static volatile bxxk f5117f;

    /* renamed from: a */
    public int f5118a;

    /* renamed from: b */
    public String f5119b = "";

    /* renamed from: c */
    public String f5120c = "";

    /* renamed from: d */
    public int f5121d;

    static {
        blt blt = new blt();
        f5116e = blt;
        bxvk.m124024a(blt.class, blt);
    }

    private blt() {
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
            return bxvk.m124022a(f5116e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", "c", "d", bls.f5115a});
        } else if (i2 == 3) {
            return new blt();
        } else {
            if (i2 == 4) {
                return new bxvd(f5116e);
            }
            if (i2 == 5) {
                return f5116e;
            }
            bxxk bxxk = f5117f;
            if (bxxk == null) {
                synchronized (blt.class) {
                    bxxk = f5117f;
                    if (bxxk == null) {
                        bxxk = new bxve(f5116e);
                        f5117f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
