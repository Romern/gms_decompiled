package p000;

/* renamed from: byke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byke extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byke f166739b;

    /* renamed from: c */
    private static volatile bxxk f166740c;

    /* renamed from: a */
    public bxww f166741a = bxww.f165013b;

    static {
        byke byke = new byke();
        f166739b = byke;
        bxvk.m124024a(byke.class, byke);
    }

    private byke() {
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
            return bxvk.m124022a(f166739b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", bykd.f166738a});
        } else if (i2 == 3) {
            return new byke();
        } else {
            if (i2 == 4) {
                return new bxvd(f166739b);
            }
            if (i2 == 5) {
                return f166739b;
            }
            bxxk bxxk = f166740c;
            if (bxxk == null) {
                synchronized (byke.class) {
                    bxxk = f166740c;
                    if (bxxk == null) {
                        bxxk = new bxve(f166739b);
                        f166740c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
