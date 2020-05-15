package p000;

/* renamed from: byyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byyy f169040c;

    /* renamed from: d */
    private static volatile bxxk f169041d;

    /* renamed from: a */
    public int f169042a;

    /* renamed from: b */
    public int f169043b;

    static {
        byyy byyy = new byyy();
        f169040c = byyy;
        bxvk.m124024a(byyy.class, byyy);
    }

    private byyy() {
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
            return bxvk.m124022a(f169040c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzas.f169226a});
        } else if (i2 == 3) {
            return new byyy();
        } else {
            if (i2 == 4) {
                return new bxvd(f169040c);
            }
            if (i2 == 5) {
                return f169040c;
            }
            bxxk bxxk = f169041d;
            if (bxxk == null) {
                synchronized (byyy.class) {
                    bxxk = f169041d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169040c);
                        f169041d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
