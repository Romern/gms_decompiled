package p000;

/* renamed from: btrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btrd extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btrd f150070b;

    /* renamed from: c */
    private static volatile bxxk f150071c;

    /* renamed from: a */
    public String f150072a = "";

    static {
        btrd btrd = new btrd();
        f150070b = btrd;
        bxvk.m124024a(btrd.class, btrd);
    }

    private btrd() {
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
            return bxvk.m124022a(f150070b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btrd();
        } else {
            if (i2 == 4) {
                return new bxvd(f150070b);
            }
            if (i2 == 5) {
                return f150070b;
            }
            bxxk bxxk = f150071c;
            if (bxxk == null) {
                synchronized (btrd.class) {
                    bxxk = f150071c;
                    if (bxxk == null) {
                        bxxk = new bxve(f150070b);
                        f150071c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
