package p000;

/* renamed from: biol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biol extends bxvk implements bxxd {

    /* renamed from: e */
    public static final biol f121057e;

    /* renamed from: f */
    private static volatile bxxk f121058f;

    /* renamed from: a */
    public int f121059a;

    /* renamed from: b */
    public int f121060b;

    /* renamed from: c */
    public int f121061c;

    /* renamed from: d */
    public int f121062d;

    static {
        biol biol = new biol();
        f121057e = biol;
        bxvk.m124024a(biol.class, biol);
    }

    private biol() {
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
            return bxvk.m124022a(f121057e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new biol();
        } else {
            if (i2 == 4) {
                return new bxvd(f121057e);
            }
            if (i2 == 5) {
                return f121057e;
            }
            bxxk bxxk = f121058f;
            if (bxxk == null) {
                synchronized (biol.class) {
                    bxxk = f121058f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121057e);
                        f121058f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
