package p000;

/* renamed from: btlt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btlt extends bxvk implements bxxd {

    /* renamed from: f */
    public static final btlt f149424f;

    /* renamed from: g */
    private static volatile bxxk f149425g;

    /* renamed from: a */
    public int f149426a = 0;

    /* renamed from: b */
    public Object f149427b;

    /* renamed from: c */
    public String f149428c = "";

    /* renamed from: d */
    public btlv f149429d;

    /* renamed from: e */
    public bxtx f149430e = bxtx.f164797b;

    static {
        btlt btlt = new btlt();
        f149424f = btlt;
        bxvk.m124024a(btlt.class, btlt);
    }

    private btlt() {
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
            return bxvk.m124022a(f149424f, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002=\u0000\u0003<\u0000\u0004\t\u0005\n", new Object[]{"b", "a", "c", btls.class, "d", "e"});
        } else if (i2 == 3) {
            return new btlt();
        } else {
            if (i2 == 4) {
                return new bxvd(f149424f);
            }
            if (i2 == 5) {
                return f149424f;
            }
            bxxk bxxk = f149425g;
            if (bxxk == null) {
                synchronized (btlt.class) {
                    bxxk = f149425g;
                    if (bxxk == null) {
                        bxxk = new bxve(f149424f);
                        f149425g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
