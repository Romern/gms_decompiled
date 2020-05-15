package p000;

/* renamed from: boey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boey extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final boey f132867d;

    /* renamed from: e */
    private static volatile bxxk f132868e;

    /* renamed from: a */
    public int f132869a;

    /* renamed from: b */
    public int f132870b;

    /* renamed from: c */
    public boex f132871c;

    static {
        boey boey = new boey();
        f132867d = boey;
        GeneratedMessageLite.m124024a(boey.class, boey);
    }

    private boey() {
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
            return GeneratedMessageLite.m124022a(f132867d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0004ဉ\u0003", new Object[]{"a", "b", boew.f132860a, "c"});
        } else if (i2 == 3) {
            return new boey();
        } else {
            if (i2 == 4) {
                return new bxvd(f132867d);
            }
            if (i2 == 5) {
                return f132867d;
            }
            bxxk bxxk = f132868e;
            if (bxxk == null) {
                synchronized (boey.class) {
                    bxxk = f132868e;
                    if (bxxk == null) {
                        bxxk = new bxve(f132867d);
                        f132868e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
