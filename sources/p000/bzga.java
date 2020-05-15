package p000;

/* renamed from: bzga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzga extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzga f169897d;

    /* renamed from: e */
    private static volatile bxxk f169898e;

    /* renamed from: a */
    public int f169899a;

    /* renamed from: b */
    public String f169900b = "";

    /* renamed from: c */
    public bzfw f169901c;

    static {
        bzga bzga = new bzga();
        f169897d = bzga;
        GeneratedMessageLite.m124024a(bzga.class, bzga);
    }

    private bzga() {
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
            return GeneratedMessageLite.m124022a(f169897d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzga();
        } else {
            if (i2 == 4) {
                return new bxvd(f169897d);
            }
            if (i2 == 5) {
                return f169897d;
            }
            bxxk bxxk = f169898e;
            if (bxxk == null) {
                synchronized (bzga.class) {
                    bxxk = f169898e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169897d);
                        f169898e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
