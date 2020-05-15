package p000;

/* renamed from: bmdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmdp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmdp f128846c;

    /* renamed from: e */
    private static volatile bxxk f128847e;

    /* renamed from: a */
    public long f128848a;

    /* renamed from: b */
    public bwio f128849b;

    /* renamed from: d */
    private int f128850d;

    static {
        bmdp bmdp = new bmdp();
        f128846c = bmdp;
        GeneratedMessageLite.m124024a(bmdp.class, bmdp);
    }

    private bmdp() {
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
            return GeneratedMessageLite.m124022a(f128846c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bmdp();
        } else {
            if (i2 == 4) {
                return new bxvd(f128846c);
            }
            if (i2 == 5) {
                return f128846c;
            }
            bxxk bxxk = f128847e;
            if (bxxk == null) {
                synchronized (bmdp.class) {
                    bxxk = f128847e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128846c);
                        f128847e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
