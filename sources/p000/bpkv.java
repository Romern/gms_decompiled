package p000;

/* renamed from: bpkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpkv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpkv f138018d;

    /* renamed from: e */
    private static volatile bxxk f138019e;

    /* renamed from: a */
    public int f138020a;

    /* renamed from: b */
    public int f138021b;

    /* renamed from: c */
    public bpku f138022c;

    static {
        bpkv bpkv = new bpkv();
        f138018d = bpkv;
        bxvk.m124024a(bpkv.class, bpkv);
    }

    private bpkv() {
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
            return bxvk.m124022a(f138018d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", bpks.f138012a, "c"});
        } else if (i2 == 3) {
            return new bpkv();
        } else {
            if (i2 == 4) {
                return new bxvd(f138018d);
            }
            if (i2 == 5) {
                return f138018d;
            }
            bxxk bxxk = f138019e;
            if (bxxk == null) {
                synchronized (bpkv.class) {
                    bxxk = f138019e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138018d);
                        f138019e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
