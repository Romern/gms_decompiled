package p000;

/* renamed from: bztg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztg extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bztg f171323b;

    /* renamed from: c */
    private static volatile bxxk f171324c;

    /* renamed from: a */
    public bztb f171325a;

    static {
        bztg bztg = new bztg();
        f171323b = bztg;
        bxvk.m124024a(bztg.class, bztg);
    }

    private bztg() {
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
            return bxvk.m124022a(f171323b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bztg();
        } else {
            if (i2 == 4) {
                return new bxvd(f171323b);
            }
            if (i2 == 5) {
                return f171323b;
            }
            bxxk bxxk = f171324c;
            if (bxxk == null) {
                synchronized (bztg.class) {
                    bxxk = f171324c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171323b);
                        f171324c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
