package p000;

/* renamed from: bpxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpxo f139746d;

    /* renamed from: e */
    private static volatile bxxk f139747e;

    /* renamed from: a */
    public int f139748a;

    /* renamed from: b */
    public int f139749b;

    /* renamed from: c */
    public bpwz f139750c;

    static {
        bpxo bpxo = new bpxo();
        f139746d = bpxo;
        bxvk.m124024a(bpxo.class, bpxo);
    }

    private bpxo() {
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
            return bxvk.m124022a(f139746d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", bqaa.f140118a, "c"});
        } else if (i2 == 3) {
            return new bpxo();
        } else {
            if (i2 == 4) {
                return new bxvd(f139746d);
            }
            if (i2 == 5) {
                return f139746d;
            }
            bxxk bxxk = f139747e;
            if (bxxk == null) {
                synchronized (bpxo.class) {
                    bxxk = f139747e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139746d);
                        f139747e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
