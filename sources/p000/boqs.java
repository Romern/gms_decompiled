package p000;

/* renamed from: boqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqs extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final boqs f134312e;

    /* renamed from: f */
    private static volatile bxxk f134313f;

    /* renamed from: a */
    public int f134314a;

    /* renamed from: b */
    public long f134315b;

    /* renamed from: c */
    public long f134316c;

    /* renamed from: d */
    public long f134317d;

    static {
        boqs boqs = new boqs();
        f134312e = boqs;
        GeneratedMessageLite.m124024a(boqs.class, boqs);
    }

    private boqs() {
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
            return GeneratedMessageLite.m124022a(f134312e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new boqs();
        } else {
            if (i2 == 4) {
                return new bxvd(f134312e);
            }
            if (i2 == 5) {
                return f134312e;
            }
            bxxk bxxk = f134313f;
            if (bxxk == null) {
                synchronized (boqs.class) {
                    bxxk = f134313f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134312e);
                        f134313f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
