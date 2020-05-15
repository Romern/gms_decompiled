package p000;

/* renamed from: apyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apyo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final apyo f85164c;

    /* renamed from: d */
    private static volatile bxxk f85165d;

    /* renamed from: a */
    public int f85166a;

    /* renamed from: b */
    public apyp f85167b;

    static {
        apyo apyo = new apyo();
        f85164c = apyo;
        bxvk.m124024a(apyo.class, apyo);
    }

    private apyo() {
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
            return bxvk.m124022a(f85164c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new apyo();
        } else {
            if (i2 == 4) {
                return new bxvd(f85164c);
            }
            if (i2 == 5) {
                return f85164c;
            }
            bxxk bxxk = f85165d;
            if (bxxk == null) {
                synchronized (apyo.class) {
                    bxxk = f85165d;
                    if (bxxk == null) {
                        bxxk = new bxve(f85164c);
                        f85165d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
