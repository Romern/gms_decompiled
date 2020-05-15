package p000;

/* renamed from: btvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvy extends bxvk implements bxxd {

    /* renamed from: f */
    public static final btvy f152660f;

    /* renamed from: g */
    private static volatile bxxk f152661g;

    /* renamed from: a */
    public btwb f152662a;

    /* renamed from: b */
    public btwn f152663b;

    /* renamed from: c */
    public btvr f152664c;

    /* renamed from: d */
    public btwj f152665d;

    /* renamed from: e */
    public btwg f152666e;

    static {
        btvy btvy = new btvy();
        f152660f = btvy;
        bxvk.m124024a(btvy.class, btvy);
    }

    private btvy() {
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
            return bxvk.m124022a(f152660f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btvy();
        } else {
            if (i2 == 4) {
                return new bxvd(f152660f);
            }
            if (i2 == 5) {
                return f152660f;
            }
            bxxk bxxk = f152661g;
            if (bxxk == null) {
                synchronized (btvy.class) {
                    bxxk = f152661g;
                    if (bxxk == null) {
                        bxxk = new bxve(f152660f);
                        f152661g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
