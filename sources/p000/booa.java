package p000;

/* renamed from: booa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class booa extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final booa f133882e;

    /* renamed from: f */
    private static volatile bxxk f133883f;

    /* renamed from: a */
    public boolean f133884a;

    /* renamed from: b */
    public boolean f133885b;

    /* renamed from: c */
    public boolean f133886c;

    /* renamed from: d */
    public boolean f133887d;

    static {
        booa booa = new booa();
        f133882e = booa;
        GeneratedMessageLite.m124024a(booa.class, booa);
    }

    private booa() {
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
            return GeneratedMessageLite.m124022a(f133882e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new booa();
        } else {
            if (i2 == 4) {
                return new bxvd(f133882e);
            }
            if (i2 == 5) {
                return f133882e;
            }
            bxxk bxxk = f133883f;
            if (bxxk == null) {
                synchronized (booa.class) {
                    bxxk = f133883f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133882e);
                        f133883f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
