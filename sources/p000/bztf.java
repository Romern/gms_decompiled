package p000;

/* renamed from: bztf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztf extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bztf f171320b;

    /* renamed from: c */
    private static volatile bxxk f171321c;

    /* renamed from: a */
    public bztb f171322a;

    static {
        bztf bztf = new bztf();
        f171320b = bztf;
        bxvk.m124024a(bztf.class, bztf);
    }

    private bztf() {
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
            return bxvk.m124022a(f171320b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bztf();
        } else {
            if (i2 == 4) {
                return new bxvd(f171320b);
            }
            if (i2 == 5) {
                return f171320b;
            }
            bxxk bxxk = f171321c;
            if (bxxk == null) {
                synchronized (bztf.class) {
                    bxxk = f171321c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171320b);
                        f171321c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
