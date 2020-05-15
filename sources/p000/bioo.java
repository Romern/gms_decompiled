package p000;

/* renamed from: bioo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bioo extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bioo f121076e;

    /* renamed from: g */
    private static volatile bxxk f121077g;

    /* renamed from: a */
    public int f121078a;

    /* renamed from: b */
    public int f121079b;

    /* renamed from: c */
    public int f121080c;

    /* renamed from: d */
    public int f121081d;

    /* renamed from: f */
    private byte f121082f = 2;

    static {
        bioo bioo = new bioo();
        f121076e = bioo;
        GeneratedMessageLite.m124024a(bioo.class, bioo);
    }

    private bioo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121082f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121082f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121076e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bioo();
        } else {
            if (i2 == 4) {
                return new bxvd(f121076e);
            }
            if (i2 == 5) {
                return f121076e;
            }
            bxxk bxxk = f121077g;
            if (bxxk == null) {
                synchronized (bioo.class) {
                    bxxk = f121077g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121076e);
                        f121077g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
