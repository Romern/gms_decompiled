package p000;

/* renamed from: bpjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpjv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpjv f137913c;

    /* renamed from: d */
    private static volatile bxxk f137914d;

    /* renamed from: a */
    public int f137915a;

    /* renamed from: b */
    public int f137916b;

    static {
        bpjv bpjv = new bpjv();
        f137913c = bpjv;
        bxvk.m124024a(bpjv.class, bpjv);
    }

    private bpjv() {
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
            return bxvk.m124022a(f137913c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bpju.f137912a});
        } else if (i2 == 3) {
            return new bpjv();
        } else {
            if (i2 == 4) {
                return new bxvd(f137913c);
            }
            if (i2 == 5) {
                return f137913c;
            }
            bxxk bxxk = f137914d;
            if (bxxk == null) {
                synchronized (bpjv.class) {
                    bxxk = f137914d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137913c);
                        f137914d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
