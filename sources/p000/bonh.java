package p000;

/* renamed from: bonh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bonh extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bonh f133801e;

    /* renamed from: f */
    private static volatile bxxk f133802f;

    /* renamed from: a */
    public int f133803a;

    /* renamed from: b */
    public int f133804b;

    /* renamed from: c */
    public long f133805c;

    /* renamed from: d */
    public long f133806d;

    static {
        bonh bonh = new bonh();
        f133801e = bonh;
        GeneratedMessageLite.m124024a(bonh.class, bonh);
    }

    private bonh() {
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
            return GeneratedMessageLite.m124022a(f133801e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", adbk.f61320a, "c", "d"});
        } else if (i2 == 3) {
            return new bonh();
        } else {
            if (i2 == 4) {
                return new bxvd(f133801e);
            }
            if (i2 == 5) {
                return f133801e;
            }
            bxxk bxxk = f133802f;
            if (bxxk == null) {
                synchronized (bonh.class) {
                    bxxk = f133802f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133801e);
                        f133802f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
