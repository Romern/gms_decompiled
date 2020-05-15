package p000;

/* renamed from: boow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boow extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final boow f134030f;

    /* renamed from: g */
    private static volatile bxxk f134031g;

    /* renamed from: a */
    public int f134032a;

    /* renamed from: b */
    public long f134033b;

    /* renamed from: c */
    public bxyk f134034c;

    /* renamed from: d */
    public bxyk f134035d;

    /* renamed from: e */
    public long f134036e;

    static {
        boow boow = new boow();
        f134030f = boow;
        GeneratedMessageLite.m124024a(boow.class, boow);
    }

    private boow() {
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
            return GeneratedMessageLite.m124022a(f134030f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0002\u0002\u0004\t\u0005\t\u0006\u0002", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new boow();
        } else {
            if (i2 == 4) {
                return new bxvd(f134030f);
            }
            if (i2 == 5) {
                return f134030f;
            }
            bxxk bxxk = f134031g;
            if (bxxk == null) {
                synchronized (boow.class) {
                    bxxk = f134031g;
                    if (bxxk == null) {
                        bxxk = new bxve(f134030f);
                        f134031g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
