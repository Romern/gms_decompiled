package p000;

/* renamed from: qgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qgy extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final qgy f41275e;

    /* renamed from: f */
    private static volatile bxxk f41276f;

    /* renamed from: a */
    public int f41277a;

    /* renamed from: b */
    public String f41278b = "";

    /* renamed from: c */
    public ByteString f41279c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f41280d = ByteString.f164797b;

    static {
        qgy qgy = new qgy();
        f41275e = qgy;
        GeneratedMessageLite.m124024a(qgy.class, qgy);
    }

    private qgy() {
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
            return GeneratedMessageLite.m124022a(f41275e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0005ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new qgy();
        } else {
            if (i2 == 4) {
                return new bxvd(f41275e);
            }
            if (i2 == 5) {
                return f41275e;
            }
            bxxk bxxk = f41276f;
            if (bxxk == null) {
                synchronized (qgy.class) {
                    bxxk = f41276f;
                    if (bxxk == null) {
                        bxxk = new bxve(f41275e);
                        f41276f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
