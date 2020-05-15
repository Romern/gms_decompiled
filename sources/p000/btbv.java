package p000;

/* renamed from: btbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btbv f148220c;

    /* renamed from: e */
    private static volatile bxxk f148221e;

    /* renamed from: a */
    public bxwc f148222a = bxxn.f165040b;

    /* renamed from: b */
    public btcp f148223b;

    /* renamed from: d */
    private byte f148224d = 2;

    static {
        btbv btbv = new btbv();
        f148220c = btbv;
        bxvk.m124024a(btbv.class, btbv);
    }

    private btbv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148224d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148224d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f148220c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002\t", new Object[]{"a", btcr.class, "b"});
        } else if (i2 == 3) {
            return new btbv();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f148220c;
            }
            bxxk bxxk = f148221e;
            if (bxxk == null) {
                synchronized (btbv.class) {
                    bxxk = f148221e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148220c);
                        f148221e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
