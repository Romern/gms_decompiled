package p000;

/* renamed from: ammm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ammm extends bxvk implements bxxd {

    /* renamed from: f */
    public static final ammm f75305f;

    /* renamed from: g */
    private static volatile bxxk f75306g;

    /* renamed from: a */
    public int f75307a;

    /* renamed from: b */
    public int f75308b;

    /* renamed from: c */
    public int f75309c;

    /* renamed from: d */
    public int f75310d;

    /* renamed from: e */
    public int f75311e;

    static {
        ammm ammm = new ammm();
        f75305f = ammm;
        bxvk.m124024a(ammm.class, ammm);
    }

    private ammm() {
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
            return bxvk.m124022a(f75305f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"a", "b", amki.f75067a, "c", amkg.f75065a, "d", amkh.f75066a, "e"});
        } else if (i2 == 3) {
            return new ammm();
        } else {
            if (i2 == 4) {
                return new bxvd(f75305f);
            }
            if (i2 == 5) {
                return f75305f;
            }
            bxxk bxxk = f75306g;
            if (bxxk == null) {
                synchronized (ammm.class) {
                    bxxk = f75306g;
                    if (bxxk == null) {
                        bxxk = new bxve(f75305f);
                        f75306g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
