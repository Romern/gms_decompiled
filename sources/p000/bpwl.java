package p000;

/* renamed from: bpwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpwl f139521d;

    /* renamed from: f */
    private static volatile bxxk f139522f;

    /* renamed from: a */
    public int f139523a;

    /* renamed from: b */
    public String f139524b = "";

    /* renamed from: c */
    public bxwc f139525c = bxxn.f165040b;

    /* renamed from: e */
    private byte f139526e = 2;

    static {
        bpwl bpwl = new bpwl();
        f139521d = bpwl;
        bxvk.m124024a(bpwl.class, bpwl);
    }

    private bpwl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f139526e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f139526e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f139521d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0002\u0001ᔈ\u0000\u0004б", new Object[]{"a", "b", "c", bpwk.class});
        } else if (i2 == 3) {
            return new bpwl();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f139521d;
            }
            bxxk bxxk = f139522f;
            if (bxxk == null) {
                synchronized (bpwl.class) {
                    bxxk = f139522f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139521d);
                        f139522f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
