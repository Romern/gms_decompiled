package p000;

/* renamed from: bmsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmsg f130669d;

    /* renamed from: f */
    private static volatile bxxk f130670f;

    /* renamed from: a */
    public int f130671a;

    /* renamed from: b */
    public ByteString f130672b = ByteString.f164797b;

    /* renamed from: c */
    public bmde f130673c;

    /* renamed from: e */
    private int f130674e;

    static {
        bmsg bmsg = new bmsg();
        f130669d = bmsg;
        GeneratedMessageLite.m124024a(bmsg.class, bmsg);
    }

    private bmsg() {
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
            return GeneratedMessageLite.m124022a(f130669d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001\u0005ဉ\u0002", new Object[]{"e", "a", bmfm.f129127a, "b", "c"});
        } else if (i2 == 3) {
            return new bmsg();
        } else {
            if (i2 == 4) {
                return new bxvd(f130669d);
            }
            if (i2 == 5) {
                return f130669d;
            }
            bxxk bxxk = f130670f;
            if (bxxk == null) {
                synchronized (bmsg.class) {
                    bxxk = f130670f;
                    if (bxxk == null) {
                        bxxk = new bxve(f130669d);
                        f130670f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
