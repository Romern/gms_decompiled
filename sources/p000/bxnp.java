package p000;

/* renamed from: bxnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxnp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxnp f164073c;

    /* renamed from: d */
    public static final bxvj f164074d;

    /* renamed from: e */
    private static volatile bxxk f164075e;

    /* renamed from: a */
    public int f164076a;

    /* renamed from: b */
    public bxno f164077b;

    static {
        bxnp bxnp = new bxnp();
        f164073c = bxnp;
        bxvk.m124024a(bxnp.class, bxnp);
        bxcf bxcf = bxcf.f162779a;
        bxnp bxnp2 = f164073c;
        f164074d = bxvk.m124006a(bxcf, bxnp2, bxnp2, 114881661, bxzf.MESSAGE);
    }

    private bxnp() {
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
            return bxvk.m124022a(f164073c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxnp();
        } else {
            if (i2 == 4) {
                return new bxvd(f164073c);
            }
            if (i2 == 5) {
                return f164073c;
            }
            bxxk bxxk = f164075e;
            if (bxxk == null) {
                synchronized (bxnp.class) {
                    bxxk = f164075e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164073c);
                        f164075e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
