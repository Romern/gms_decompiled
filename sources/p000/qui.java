package p000;

/* renamed from: qui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qui extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final qui f42142d;

    /* renamed from: e */
    private static volatile bxxk f42143e;

    /* renamed from: a */
    public int f42144a;

    /* renamed from: b */
    public String f42145b = "";

    /* renamed from: c */
    public ByteString f42146c = ByteString.f164797b;

    static {
        qui qui = new qui();
        f42142d = qui;
        GeneratedMessageLite.m124024a(qui.class, qui);
    }

    private qui() {
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
            return GeneratedMessageLite.m124022a(f42142d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new qui();
        } else {
            if (i2 == 4) {
                return new bxvd(f42142d);
            }
            if (i2 == 5) {
                return f42142d;
            }
            bxxk bxxk = f42143e;
            if (bxxk == null) {
                synchronized (qui.class) {
                    bxxk = f42143e;
                    if (bxxk == null) {
                        bxxk = new bxve(f42142d);
                        f42143e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
