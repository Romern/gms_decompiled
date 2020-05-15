package p000;

/* renamed from: brcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brcu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final brcu f142430c;

    /* renamed from: d */
    private static volatile bxxk f142431d;

    /* renamed from: a */
    public int f142432a;

    /* renamed from: b */
    public String f142433b = "";

    static {
        brcu brcu = new brcu();
        f142430c = brcu;
        bxvk.m124024a(brcu.class, brcu);
    }

    private brcu() {
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
            return bxvk.m124022a(f142430c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new brcu();
        } else {
            if (i2 == 4) {
                return new bxvd(f142430c);
            }
            if (i2 == 5) {
                return f142430c;
            }
            bxxk bxxk = f142431d;
            if (bxxk == null) {
                synchronized (brcu.class) {
                    bxxk = f142431d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142430c);
                        f142431d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
