package p000;

/* renamed from: bytw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bytw extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bytw f167725e;

    /* renamed from: f */
    private static volatile bxxk f167726f;

    /* renamed from: a */
    public int f167727a;

    /* renamed from: b */
    public String f167728b = "";

    /* renamed from: c */
    public bytv f167729c;

    /* renamed from: d */
    public String f167730d = "";

    static {
        bytw bytw = new bytw();
        f167725e = bytw;
        GeneratedMessageLite.m124024a(bytw.class, bytw);
    }

    private bytw() {
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
            return GeneratedMessageLite.m124022a(f167725e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bytw();
        } else {
            if (i2 == 4) {
                return new bxvd(f167725e);
            }
            if (i2 == 5) {
                return f167725e;
            }
            bxxk bxxk = f167726f;
            if (bxxk == null) {
                synchronized (bytw.class) {
                    bxxk = f167726f;
                    if (bxxk == null) {
                        bxxk = new bxve(f167725e);
                        f167726f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
