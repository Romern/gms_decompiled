package p000;

/* renamed from: kwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final kwl f25280c;

    /* renamed from: d */
    private static volatile bxxk f25281d;

    /* renamed from: a */
    public String f25282a = "";

    /* renamed from: b */
    public int f25283b;

    static {
        kwl kwl = new kwl();
        f25280c = kwl;
        GeneratedMessageLite.m124024a(kwl.class, kwl);
    }

    private kwl() {
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
            return GeneratedMessageLite.m124022a(f25280c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new kwl();
        } else {
            if (i2 == 4) {
                return new bxvd(f25280c);
            }
            if (i2 == 5) {
                return f25280c;
            }
            bxxk bxxk = f25281d;
            if (bxxk == null) {
                synchronized (kwl.class) {
                    bxxk = f25281d;
                    if (bxxk == null) {
                        bxxk = new bxve(f25280c);
                        f25281d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
