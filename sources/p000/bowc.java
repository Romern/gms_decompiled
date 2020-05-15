package p000;

/* renamed from: bowc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bowc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bowc f135092c;

    /* renamed from: d */
    private static volatile bxxk f135093d;

    /* renamed from: a */
    public int f135094a;

    /* renamed from: b */
    public int f135095b;

    static {
        bowc bowc = new bowc();
        f135092c = bowc;
        GeneratedMessageLite.m124024a(bowc.class, bowc);
    }

    private bowc() {
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
            return GeneratedMessageLite.m124022a(f135092c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bowc();
        } else {
            if (i2 == 4) {
                return new bxvd(f135092c);
            }
            if (i2 == 5) {
                return f135092c;
            }
            bxxk bxxk = f135093d;
            if (bxxk == null) {
                synchronized (bowc.class) {
                    bxxk = f135093d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135092c);
                        f135093d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
