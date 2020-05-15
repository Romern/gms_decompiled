package p000;

/* renamed from: bioj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bioj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bioj f121047c;

    /* renamed from: f */
    private static volatile bxxk f121048f;

    /* renamed from: a */
    public int f121049a;

    /* renamed from: b */
    public int f121050b;

    /* renamed from: d */
    private int f121051d;

    /* renamed from: e */
    private byte f121052e = 2;

    static {
        bioj bioj = new bioj();
        f121047c = bioj;
        bxvk.m124024a(bioj.class, bioj);
    }

    private bioj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121052e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121052e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121047c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔋ\u0000\u0002ᔄ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bioj();
        } else {
            if (i2 == 4) {
                return new bxvd(f121047c);
            }
            if (i2 == 5) {
                return f121047c;
            }
            bxxk bxxk = f121048f;
            if (bxxk == null) {
                synchronized (bioj.class) {
                    bxxk = f121048f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121047c);
                        f121048f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
