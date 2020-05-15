package p000;

/* renamed from: biox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biox extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final biox f121113b;

    /* renamed from: e */
    private static volatile bxxk f121114e;

    /* renamed from: a */
    public int f121115a;

    /* renamed from: c */
    private int f121116c;

    /* renamed from: d */
    private byte f121117d = 2;

    static {
        biox biox = new biox();
        f121113b = biox;
        GeneratedMessageLite.m124024a(biox.class, biox);
    }

    private biox() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121117d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121117d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121113b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new biox();
        } else {
            if (i2 == 4) {
                return new bxvd(f121113b);
            }
            if (i2 == 5) {
                return f121113b;
            }
            bxxk bxxk = f121114e;
            if (bxxk == null) {
                synchronized (biox.class) {
                    bxxk = f121114e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121113b);
                        f121114e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
