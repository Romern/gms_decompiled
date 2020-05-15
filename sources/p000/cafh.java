package p000;

/* renamed from: cafh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cafh f172902d;

    /* renamed from: e */
    private static volatile bxxk f172903e;

    /* renamed from: a */
    public int f172904a;

    /* renamed from: b */
    public String f172905b = "";

    /* renamed from: c */
    public String f172906c = "";

    static {
        cafh cafh = new cafh();
        f172902d = cafh;
        GeneratedMessageLite.m124024a(cafh.class, cafh);
    }

    private cafh() {
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
            return GeneratedMessageLite.m124022a(f172902d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cafh();
        } else {
            if (i2 == 4) {
                return new bxvd(f172902d);
            }
            if (i2 == 5) {
                return f172902d;
            }
            bxxk bxxk = f172903e;
            if (bxxk == null) {
                synchronized (cafh.class) {
                    bxxk = f172903e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172902d);
                        f172903e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
