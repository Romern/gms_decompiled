package p000;

/* renamed from: btfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btfg extends bxvk implements bxxd {

    /* renamed from: f */
    public static final btfg f148645f;

    /* renamed from: g */
    private static volatile bxxk f148646g;

    /* renamed from: a */
    public String f148647a = "";

    /* renamed from: b */
    public String f148648b = "";

    /* renamed from: c */
    public int f148649c;

    /* renamed from: d */
    public boolean f148650d;

    /* renamed from: e */
    public boolean f148651e;

    static {
        btfg btfg = new btfg();
        f148645f = btfg;
        bxvk.m124024a(btfg.class, btfg);
    }

    private btfg() {
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
            return bxvk.m124022a(f148645f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0007\u0005\u0007", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btfg();
        } else {
            if (i2 == 4) {
                return new bxvd(f148645f);
            }
            if (i2 == 5) {
                return f148645f;
            }
            bxxk bxxk = f148646g;
            if (bxxk == null) {
                synchronized (btfg.class) {
                    bxxk = f148646g;
                    if (bxxk == null) {
                        bxxk = new bxve(f148645f);
                        f148646g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
