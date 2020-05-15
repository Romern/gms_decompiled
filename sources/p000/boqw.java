package p000;

/* renamed from: boqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final boqw f134338d;

    /* renamed from: e */
    private static volatile bxxk f134339e;

    /* renamed from: a */
    public int f134340a;

    /* renamed from: b */
    public long f134341b;

    /* renamed from: c */
    public int f134342c;

    static {
        boqw boqw = new boqw();
        f134338d = boqw;
        GeneratedMessageLite.m124024a(boqw.class, boqw);
    }

    private boqw() {
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
            return GeneratedMessageLite.m124022a(f134338d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new boqw();
        } else {
            if (i2 == 4) {
                return new bxvd(f134338d);
            }
            if (i2 == 5) {
                return f134338d;
            }
            bxxk bxxk = f134339e;
            if (bxxk == null) {
                synchronized (boqw.class) {
                    bxxk = f134339e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134338d);
                        f134339e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
