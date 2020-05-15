package p000;

/* renamed from: atef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atef extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final atef f90180d;

    /* renamed from: e */
    private static volatile bxxk f90181e;

    /* renamed from: a */
    public bxvt f90182a = bxvm.f164965b;

    /* renamed from: b */
    public int f90183b;

    /* renamed from: c */
    public String f90184c = "";

    static {
        atef atef = new atef();
        f90180d = atef;
        GeneratedMessageLite.m124024a(atef.class, atef);
    }

    private atef() {
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
            return GeneratedMessageLite.m124022a(f90180d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001,\u0002\f\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new atef();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f90180d;
            }
            bxxk bxxk = f90181e;
            if (bxxk == null) {
                synchronized (atef.class) {
                    bxxk = f90181e;
                    if (bxxk == null) {
                        bxxk = new bxve(f90180d);
                        f90181e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
