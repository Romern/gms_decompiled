package p000;

/* renamed from: bzti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzti extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzti f171329e;

    /* renamed from: f */
    private static volatile bxxk f171330f;

    /* renamed from: a */
    public String f171331a = "";

    /* renamed from: b */
    public String f171332b = "";

    /* renamed from: c */
    public bztj f171333c;

    /* renamed from: d */
    public String f171334d = "";

    static {
        bzti bzti = new bzti();
        f171329e = bzti;
        bxvk.m124024a(bzti.class, bzti);
    }

    private bzti() {
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
            return bxvk.m124022a(f171329e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzti();
        } else {
            if (i2 == 4) {
                return new bxvd(f171329e);
            }
            if (i2 == 5) {
                return f171329e;
            }
            bxxk bxxk = f171330f;
            if (bxxk == null) {
                synchronized (bzti.class) {
                    bxxk = f171330f;
                    if (bxxk == null) {
                        bxxk = new bxve(f171329e);
                        f171330f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
