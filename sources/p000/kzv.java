package p000;

/* renamed from: kzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kzv extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final kzv f25479f;

    /* renamed from: g */
    private static volatile bxxk f25480g;

    /* renamed from: a */
    public int f25481a;

    /* renamed from: b */
    public int f25482b;

    /* renamed from: c */
    public int f25483c;

    /* renamed from: d */
    public kzu f25484d;

    /* renamed from: e */
    public int f25485e;

    static {
        kzv kzv = new kzv();
        f25479f = kzv;
        GeneratedMessageLite.m124024a(kzv.class, kzv);
    }

    private kzv() {
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
            return GeneratedMessageLite.m124022a(f25479f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဆ\u0001\u0003ဉ\u0002\u0004ဆ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new kzv();
        } else {
            if (i2 == 4) {
                return new bxvd(f25479f);
            }
            if (i2 == 5) {
                return f25479f;
            }
            bxxk bxxk = f25480g;
            if (bxxk == null) {
                synchronized (kzv.class) {
                    bxxk = f25480g;
                    if (bxxk == null) {
                        bxxk = new bxve(f25479f);
                        f25480g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
