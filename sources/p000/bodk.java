package p000;

/* renamed from: bodk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bodk extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bodk f132702h;

    /* renamed from: i */
    private static volatile bxxk f132703i;

    /* renamed from: a */
    public int f132704a;

    /* renamed from: b */
    public int f132705b;

    /* renamed from: c */
    public long f132706c;

    /* renamed from: d */
    public int f132707d;

    /* renamed from: e */
    public int f132708e;

    /* renamed from: f */
    public boolean f132709f;

    /* renamed from: g */
    public String f132710g = "";

    static {
        bodk bodk = new bodk();
        f132702h = bodk;
        GeneratedMessageLite.m124024a(bodk.class, bodk);
    }

    private bodk() {
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
            return GeneratedMessageLite.m124022a(f132702h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", bodj.f132701a, "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bodk();
        } else {
            if (i2 == 4) {
                return new bxvd(f132702h);
            }
            if (i2 == 5) {
                return f132702h;
            }
            bxxk bxxk = f132703i;
            if (bxxk == null) {
                synchronized (bodk.class) {
                    bxxk = f132703i;
                    if (bxxk == null) {
                        bxxk = new bxve(f132702h);
                        f132703i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
