package p000;

/* renamed from: blee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blee extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blee f126183d;

    /* renamed from: e */
    private static volatile bxxk f126184e;

    /* renamed from: a */
    public int f126185a;

    /* renamed from: b */
    public bleu f126186b;

    /* renamed from: c */
    public String f126187c = "";

    static {
        blee blee = new blee();
        f126183d = blee;
        bxvk.m124024a(blee.class, blee);
    }

    private blee() {
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
            return bxvk.m124022a(f126183d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blee();
        } else {
            if (i2 == 4) {
                return new bxvd(f126183d);
            }
            if (i2 == 5) {
                return f126183d;
            }
            bxxk bxxk = f126184e;
            if (bxxk == null) {
                synchronized (blee.class) {
                    bxxk = f126184e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126183d);
                        f126184e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
