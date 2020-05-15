package p000;

/* renamed from: abpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abpp extends bxvk implements bxxd {

    /* renamed from: b */
    public static final abpp f57880b;

    /* renamed from: c */
    private static volatile bxxk f57881c;

    /* renamed from: a */
    public bxww f57882a = bxww.f165013b;

    static {
        abpp abpp = new abpp();
        f57880b = abpp;
        bxvk.m124024a(abpp.class, abpp);
    }

    private abpp() {
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
            return bxvk.m124022a(f57880b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", abpn.f57876a});
        } else if (i2 == 3) {
            return new abpp();
        } else {
            if (i2 == 4) {
                return new bxvd(f57880b);
            }
            if (i2 == 5) {
                return f57880b;
            }
            bxxk bxxk = f57881c;
            if (bxxk == null) {
                synchronized (abpp.class) {
                    bxxk = f57881c;
                    if (bxxk == null) {
                        bxxk = new bxve(f57880b);
                        f57881c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
