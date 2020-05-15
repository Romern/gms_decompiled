package p000;

/* renamed from: biut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biut extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final biut f121870d;

    /* renamed from: f */
    private static volatile bxxk f121871f;

    /* renamed from: a */
    public int f121872a;

    /* renamed from: b */
    public int f121873b = 1;

    /* renamed from: c */
    public long f121874c;

    /* renamed from: e */
    private byte f121875e = 2;

    static {
        biut biut = new biut();
        f121870d = biut;
        GeneratedMessageLite.m124024a(biut.class, biut);
    }

    private biut() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121875e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121875e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121870d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᔂ\u0001", new Object[]{"a", "b", biva.m102864b(), "c"});
        } else if (i2 == 3) {
            return new biut();
        } else {
            if (i2 == 4) {
                return new bxvd(f121870d);
            }
            if (i2 == 5) {
                return f121870d;
            }
            bxxk bxxk = f121871f;
            if (bxxk == null) {
                synchronized (biut.class) {
                    bxxk = f121871f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121870d);
                        f121871f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
