package p000;

/* renamed from: bmvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvi extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmvi f131049c;

    /* renamed from: d */
    private static volatile bxxk f131050d;

    /* renamed from: a */
    public int f131051a;

    /* renamed from: b */
    public bmvt f131052b;

    static {
        bmvi bmvi = new bmvi();
        f131049c = bmvi;
        GeneratedMessageLite.m124024a(bmvi.class, bmvi);
    }

    private bmvi() {
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
            return GeneratedMessageLite.m124022a(f131049c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmvi();
        } else {
            if (i2 == 4) {
                return new bxvd(f131049c);
            }
            if (i2 == 5) {
                return f131049c;
            }
            bxxk bxxk = f131050d;
            if (bxxk == null) {
                synchronized (bmvi.class) {
                    bxxk = f131050d;
                    if (bxxk == null) {
                        bxxk = new bxve(f131049c);
                        f131050d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
