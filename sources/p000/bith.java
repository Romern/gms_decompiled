package p000;

/* renamed from: bith */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bith extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bith f121645b;

    /* renamed from: e */
    private static volatile bxxk f121646e;

    /* renamed from: a */
    public boolean f121647a;

    /* renamed from: c */
    private int f121648c;

    /* renamed from: d */
    private byte f121649d = 2;

    static {
        bith bith = new bith();
        f121645b = bith;
        GeneratedMessageLite.m124024a(bith.class, bith);
    }

    private bith() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121649d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121649d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121645b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔇ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bith();
        } else {
            if (i2 == 4) {
                return new bxvd(f121645b);
            }
            if (i2 == 5) {
                return f121645b;
            }
            bxxk bxxk = f121646e;
            if (bxxk == null) {
                synchronized (bith.class) {
                    bxxk = f121646e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121645b);
                        f121646e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
