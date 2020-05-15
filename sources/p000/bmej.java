package p000;

/* renamed from: bmej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmej extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmej f128946e;

    /* renamed from: f */
    private static volatile bxxk f128947f;

    /* renamed from: a */
    public int f128948a;

    /* renamed from: b */
    public String f128949b = "";

    /* renamed from: c */
    public String f128950c = "";

    /* renamed from: d */
    public bmno f128951d;

    static {
        bmej bmej = new bmej();
        f128946e = bmej;
        GeneratedMessageLite.m124024a(bmej.class, bmej);
    }

    private bmej() {
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
            return GeneratedMessageLite.m124022a(f128946e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0003ဉ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmej();
        } else {
            if (i2 == 4) {
                return new bxvd(f128946e);
            }
            if (i2 == 5) {
                return f128946e;
            }
            bxxk bxxk = f128947f;
            if (bxxk == null) {
                synchronized (bmej.class) {
                    bxxk = f128947f;
                    if (bxxk == null) {
                        bxxk = new bxve(f128946e);
                        f128947f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
