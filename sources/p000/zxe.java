package p000;

/* renamed from: zxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zxe extends bxvk implements bxxd {

    /* renamed from: c */
    public static final zxe f56079c;

    /* renamed from: e */
    private static volatile bxxk f56080e;

    /* renamed from: a */
    public bxwc f56081a = bxxn.f165040b;

    /* renamed from: b */
    public int f56082b;

    /* renamed from: d */
    private int f56083d;

    static {
        zxe zxe = new zxe();
        f56079c = zxe;
        bxvk.m124024a(zxe.class, zxe);
    }

    private zxe() {
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
            return bxvk.m124022a(f56079c, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0001\u0000\u0001\u001b\u0005င\u0000", new Object[]{"d", "a", zxi.class, "b"});
        } else if (i2 == 3) {
            return new zxe();
        } else {
            if (i2 == 4) {
                return new bxvd(f56079c);
            }
            if (i2 == 5) {
                return f56079c;
            }
            bxxk bxxk = f56080e;
            if (bxxk == null) {
                synchronized (zxe.class) {
                    bxxk = f56080e;
                    if (bxxk == null) {
                        bxxk = new bxve(f56079c);
                        f56080e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
