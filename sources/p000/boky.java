package p000;

/* renamed from: boky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boky extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final boky f133475c;

    /* renamed from: d */
    private static volatile bxxk f133476d;

    /* renamed from: a */
    public int f133477a;

    /* renamed from: b */
    public boolean f133478b;

    static {
        boky boky = new boky();
        f133475c = boky;
        GeneratedMessageLite.m124024a(boky.class, boky);
    }

    private boky() {
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
            return GeneratedMessageLite.m124022a(f133475c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new boky();
        } else {
            if (i2 == 4) {
                return new bxvd(f133475c);
            }
            if (i2 == 5) {
                return f133475c;
            }
            bxxk bxxk = f133476d;
            if (bxxk == null) {
                synchronized (boky.class) {
                    bxxk = f133476d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133475c);
                        f133476d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
