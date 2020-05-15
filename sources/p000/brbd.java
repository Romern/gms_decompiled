package p000;

/* renamed from: brbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final brbd f142230c;

    /* renamed from: d */
    private static volatile bxxk f142231d;

    /* renamed from: a */
    public int f142232a;

    /* renamed from: b */
    public String f142233b = "";

    static {
        brbd brbd = new brbd();
        f142230c = brbd;
        bxvk.m124024a(brbd.class, brbd);
    }

    private brbd() {
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
            return bxvk.m124022a(f142230c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new brbd();
        } else {
            if (i2 == 4) {
                return new bxvd(f142230c);
            }
            if (i2 == 5) {
                return f142230c;
            }
            bxxk bxxk = f142231d;
            if (bxxk == null) {
                synchronized (brbd.class) {
                    bxxk = f142231d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142230c);
                        f142231d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
