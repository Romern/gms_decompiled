package p000;

/* renamed from: btlu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btlu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btlu f149431c;

    /* renamed from: d */
    private static volatile bxxk f149432d;

    /* renamed from: a */
    public int f149433a = 0;

    /* renamed from: b */
    public Object f149434b;

    static {
        btlu btlu = new btlu();
        f149431c = btlu;
        bxvk.m124024a(btlu.class, btlu);
    }

    private btlu() {
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
            return bxvk.m124022a(f149431c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001=\u0000\u0002=\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new btlu();
        } else {
            if (i2 == 4) {
                return new bxvd(f149431c);
            }
            if (i2 == 5) {
                return f149431c;
            }
            bxxk bxxk = f149432d;
            if (bxxk == null) {
                synchronized (btlu.class) {
                    bxxk = f149432d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149431c);
                        f149432d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
