package p000;

/* renamed from: aaqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaqp extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final aaqp f28931a;

    /* renamed from: f */
    private static volatile bxxk f28932f;

    /* renamed from: b */
    private int f28933b;

    /* renamed from: c */
    private long f28934c;

    /* renamed from: d */
    private boolean f28935d;

    /* renamed from: e */
    private byte f28936e = 2;

    static {
        aaqp aaqp = new aaqp();
        f28931a = aaqp;
        GeneratedMessageLite.m124024a(aaqp.class, aaqp);
    }

    private aaqp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f28936e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f28936e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f28931a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔂ\u0000\u0002ᔇ\u0001", new Object[]{"b", "c", "d"});
        } else if (i2 == 3) {
            return new aaqp();
        } else {
            if (i2 == 4) {
                return new bxvd(f28931a);
            }
            if (i2 == 5) {
                return f28931a;
            }
            bxxk bxxk = f28932f;
            if (bxxk == null) {
                synchronized (aaqp.class) {
                    bxxk = f28932f;
                    if (bxxk == null) {
                        bxxk = new bxve(f28931a);
                        f28932f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
