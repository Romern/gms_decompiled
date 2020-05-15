package p000;

/* renamed from: bmix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmix extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmix f129647e;

    /* renamed from: g */
    private static volatile bxxk f129648g;

    /* renamed from: a */
    public int f129649a;

    /* renamed from: b */
    public String f129650b = "";

    /* renamed from: c */
    public int f129651c;

    /* renamed from: d */
    public bmiw f129652d;

    /* renamed from: f */
    private int f129653f;

    static {
        bmix bmix = new bmix();
        f129647e = bmix;
        GeneratedMessageLite.m124024a(bmix.class, bmix);
    }

    private bmix() {
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
            return GeneratedMessageLite.m124022a(f129647e, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003ဌ\u0002\u0004ဉ\u0003\u0005င\u0000\u0006ဈ\u0001", new Object[]{"f", "c", bmiu.f129641a, "d", "a", "b"});
        } else if (i2 == 3) {
            return new bmix();
        } else {
            if (i2 == 4) {
                return new bxvd(f129647e);
            }
            if (i2 == 5) {
                return f129647e;
            }
            bxxk bxxk = f129648g;
            if (bxxk == null) {
                synchronized (bmix.class) {
                    bxxk = f129648g;
                    if (bxxk == null) {
                        bxxk = new bxve(f129647e);
                        f129648g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
