package p000;

/* renamed from: bspi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bspi extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bspi f146504e;

    /* renamed from: f */
    private static volatile bxxk f146505f;

    /* renamed from: a */
    public int f146506a;

    /* renamed from: b */
    public String f146507b = "";

    /* renamed from: c */
    public String f146508c = "";

    /* renamed from: d */
    public String f146509d = "";

    static {
        bspi bspi = new bspi();
        f146504e = bspi;
        bxvk.m124024a(bspi.class, bspi);
    }

    private bspi() {
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
            return bxvk.m124022a(f146504e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bspi();
        } else {
            if (i2 == 4) {
                return new bxvd(f146504e);
            }
            if (i2 == 5) {
                return f146504e;
            }
            bxxk bxxk = f146505f;
            if (bxxk == null) {
                synchronized (bspi.class) {
                    bxxk = f146505f;
                    if (bxxk == null) {
                        bxxk = new bxve(f146504e);
                        f146505f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
