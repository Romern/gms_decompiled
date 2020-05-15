package p000;

/* renamed from: biuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biuq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final biuq f121858c;

    /* renamed from: f */
    private static volatile bxxk f121859f;

    /* renamed from: a */
    public int f121860a = 1;

    /* renamed from: b */
    public int f121861b = 1;

    /* renamed from: d */
    private int f121862d;

    /* renamed from: e */
    private byte f121863e = 2;

    static {
        biuq biuq = new biuq();
        f121858c = biuq;
        GeneratedMessageLite.m124024a(biuq.class, biuq);
    }

    private biuq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121863e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121863e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121858c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᔌ\u0001", new Object[]{"d", "a", biva.m102864b(), "b", bius.m102854b()});
        } else if (i2 == 3) {
            return new biuq();
        } else {
            if (i2 == 4) {
                return new bxvd(f121858c);
            }
            if (i2 == 5) {
                return f121858c;
            }
            bxxk bxxk = f121859f;
            if (bxxk == null) {
                synchronized (biuq.class) {
                    bxxk = f121859f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121858c);
                        f121859f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
