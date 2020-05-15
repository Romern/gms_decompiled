package p000;

/* renamed from: bpnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpnb extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpnb f138382c;

    /* renamed from: d */
    private static volatile bxxk f138383d;

    /* renamed from: a */
    public int f138384a;

    /* renamed from: b */
    public int f138385b;

    static {
        bpnb bpnb = new bpnb();
        f138382c = bpnb;
        bxvk.m124024a(bpnb.class, bpnb);
    }

    private bpnb() {
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
            return bxvk.m124022a(f138382c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpnb();
        } else {
            if (i2 == 4) {
                return new bxvd(f138382c);
            }
            if (i2 == 5) {
                return f138382c;
            }
            bxxk bxxk = f138383d;
            if (bxxk == null) {
                synchronized (bpnb.class) {
                    bxxk = f138383d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138382c);
                        f138383d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
