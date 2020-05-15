package p000;

/* renamed from: bohr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bohr extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bohr f133141c;

    /* renamed from: d */
    private static volatile bxxk f133142d;

    /* renamed from: a */
    public int f133143a;

    /* renamed from: b */
    public int f133144b;

    static {
        bohr bohr = new bohr();
        f133141c = bohr;
        GeneratedMessageLite.m124024a(bohr.class, bohr);
    }

    private bohr() {
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
            return GeneratedMessageLite.m124022a(f133141c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bohr();
        } else {
            if (i2 == 4) {
                return new bxvd(f133141c);
            }
            if (i2 == 5) {
                return f133141c;
            }
            bxxk bxxk = f133142d;
            if (bxxk == null) {
                synchronized (bohr.class) {
                    bxxk = f133142d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133141c);
                        f133142d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
