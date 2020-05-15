package p000;

/* renamed from: bivx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivx extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bivx f122052e;

    /* renamed from: g */
    private static volatile bxxk f122053g;

    /* renamed from: a */
    public int f122054a;

    /* renamed from: b */
    public int f122055b;

    /* renamed from: c */
    public int f122056c;

    /* renamed from: d */
    public int f122057d;

    /* renamed from: f */
    private byte f122058f = 2;

    static {
        bivx bivx = new bivx();
        f122052e = bivx;
        bxvk.m124024a(bivx.class, bivx);
    }

    private bivx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f122058f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f122058f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f122052e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bivx();
        } else {
            if (i2 == 4) {
                return new bxvd(f122052e);
            }
            if (i2 == 5) {
                return f122052e;
            }
            bxxk bxxk = f122053g;
            if (bxxk == null) {
                synchronized (bivx.class) {
                    bxxk = f122053g;
                    if (bxxk == null) {
                        bxxk = new bxve(f122052e);
                        f122053g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
