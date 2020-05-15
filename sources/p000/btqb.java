package p000;

/* renamed from: btqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqb extends bxvk implements bxxd {

    /* renamed from: g */
    public static final btqb f149918g;

    /* renamed from: h */
    private static volatile bxxk f149919h;

    /* renamed from: a */
    public int f149920a;

    /* renamed from: b */
    public int f149921b;

    /* renamed from: c */
    public String f149922c = "";

    /* renamed from: d */
    public String f149923d = "";

    /* renamed from: e */
    public String f149924e = "";

    /* renamed from: f */
    public long f149925f;

    static {
        btqb btqb = new btqb();
        f149918g = btqb;
        bxvk.m124024a(btqb.class, btqb);
    }

    private btqb() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f149918g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0002", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new btqb();
        } else {
            if (i2 == 4) {
                return new bxvd(f149918g);
            }
            if (i2 == 5) {
                return f149918g;
            }
            bxxk bxxk = f149919h;
            if (bxxk == null) {
                synchronized (btqb.class) {
                    bxxk = f149919h;
                    if (bxxk == null) {
                        bxxk = new bxve(f149918g);
                        f149919h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
