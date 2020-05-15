package p000;

/* renamed from: bzwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzwf f171613c;

    /* renamed from: d */
    private static volatile bxxk f171614d;

    /* renamed from: a */
    public int f171615a;

    /* renamed from: b */
    public String f171616b = "";

    static {
        bzwf bzwf = new bzwf();
        f171613c = bzwf;
        GeneratedMessageLite.m124024a(bzwf.class, bzwf);
    }

    private bzwf() {
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
            return GeneratedMessageLite.m124022a(f171613c, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzwf();
        } else {
            if (i2 == 4) {
                return new bxvd(f171613c);
            }
            if (i2 == 5) {
                return f171613c;
            }
            bxxk bxxk = f171614d;
            if (bxxk == null) {
                synchronized (bzwf.class) {
                    bxxk = f171614d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171613c);
                        f171614d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
