package p000;

/* renamed from: jeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jeu extends bxvk implements bxxd {

    /* renamed from: h */
    public static final jeu f22305h;

    /* renamed from: j */
    private static volatile bxxk f22306j;

    /* renamed from: a */
    public String f22307a = "";

    /* renamed from: b */
    public String f22308b = "";

    /* renamed from: c */
    public String f22309c = "";

    /* renamed from: d */
    public String f22310d = "/";

    /* renamed from: e */
    public long f22311e = -1;

    /* renamed from: f */
    public boolean f22312f;

    /* renamed from: g */
    public boolean f22313g;

    /* renamed from: i */
    private int f22314i;

    static {
        jeu jeu = new jeu();
        f22305h = jeu;
        bxvk.m124024a(jeu.class, jeu);
    }

    private jeu() {
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
            return bxvk.m124022a(f22305h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"i", "a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new jeu();
        } else {
            if (i2 == 4) {
                return new bxvd(f22305h);
            }
            if (i2 == 5) {
                return f22305h;
            }
            bxxk bxxk = f22306j;
            if (bxxk == null) {
                synchronized (jeu.class) {
                    bxxk = f22306j;
                    if (bxxk == null) {
                        bxxk = new bxve(f22305h);
                        f22306j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
