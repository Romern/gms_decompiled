package p000;

/* renamed from: btme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btme extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btme f149477d;

    /* renamed from: e */
    private static volatile bxxk f149478e;

    /* renamed from: a */
    public bxtx f149479a = bxtx.f164797b;

    /* renamed from: b */
    public btiy f149480b;

    /* renamed from: c */
    public String f149481c = "";

    static {
        btme btme = new btme();
        f149477d = btme;
        bxvk.m124024a(btme.class, btme);
    }

    private btme() {
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
            return bxvk.m124022a(f149477d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\t\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btme();
        } else {
            if (i2 == 4) {
                return new bxvd(f149477d);
            }
            if (i2 == 5) {
                return f149477d;
            }
            bxxk bxxk = f149478e;
            if (bxxk == null) {
                synchronized (btme.class) {
                    bxxk = f149478e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149477d);
                        f149478e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
