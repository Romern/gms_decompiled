package p000;

/* renamed from: bpve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpve extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bpve f139314f;

    /* renamed from: g */
    private static volatile bxxk f139315g;

    /* renamed from: a */
    public int f139316a;

    /* renamed from: b */
    public int f139317b;

    /* renamed from: c */
    public String f139318c = "";

    /* renamed from: d */
    public int f139319d = -1;

    /* renamed from: e */
    public String f139320e = "";

    static {
        bpve bpve = new bpve();
        f139314f = bpve;
        bxvk.m124024a(bpve.class, bpve);
    }

    private bpve() {
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
            return bxvk.m124022a(f139314f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"a", "b", bpvd.f139313a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpve();
        } else {
            if (i2 == 4) {
                return new bxvd(f139314f);
            }
            if (i2 == 5) {
                return f139314f;
            }
            bxxk bxxk = f139315g;
            if (bxxk == null) {
                synchronized (bpve.class) {
                    bxxk = f139315g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139314f);
                        f139315g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
