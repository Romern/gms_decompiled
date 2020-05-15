package p000;

/* renamed from: bisg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bisg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bisg f121549e;

    /* renamed from: h */
    private static volatile bxxk f121550h;

    /* renamed from: a */
    public int f121551a;

    /* renamed from: b */
    public boolean f121552b;

    /* renamed from: c */
    public boolean f121553c;

    /* renamed from: d */
    public boolean f121554d;

    /* renamed from: f */
    private int f121555f;

    /* renamed from: g */
    private byte f121556g = 2;

    static {
        bisg bisg = new bisg();
        f121549e = bisg;
        bxvk.m124024a(bisg.class, bisg);
    }

    private bisg() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m102784a(bisg bisg) {
        bisg.f121551a |= 8;
        bisg.f121555f = 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121556g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121556g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121549e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "f"});
        } else if (i2 == 3) {
            return new bisg();
        } else {
            if (i2 == 4) {
                return new bxvd(f121549e);
            }
            if (i2 == 5) {
                return f121549e;
            }
            bxxk bxxk = f121550h;
            if (bxxk == null) {
                synchronized (bisg.class) {
                    bxxk = f121550h;
                    if (bxxk == null) {
                        bxxk = new bxve(f121549e);
                        f121550h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
