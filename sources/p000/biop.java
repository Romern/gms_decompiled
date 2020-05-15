package p000;

/* renamed from: biop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biop extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final biop f121083c;

    /* renamed from: f */
    private static volatile bxxk f121084f;

    /* renamed from: a */
    public int f121085a;

    /* renamed from: b */
    public boolean f121086b;

    /* renamed from: d */
    private int f121087d;

    /* renamed from: e */
    private byte f121088e = 2;

    static {
        biop biop = new biop();
        f121083c = biop;
        GeneratedMessageLite.m124024a(biop.class, biop);
    }

    private biop() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121088e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121088e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121083c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔌ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", biou.m102678b(), "b"});
        } else if (i2 == 3) {
            return new biop();
        } else {
            if (i2 == 4) {
                return new bxvd(f121083c);
            }
            if (i2 == 5) {
                return f121083c;
            }
            bxxk bxxk = f121084f;
            if (bxxk == null) {
                synchronized (biop.class) {
                    bxxk = f121084f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121083c);
                        f121084f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
