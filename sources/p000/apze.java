package p000;

/* renamed from: apze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apze extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final apze f85221e;

    /* renamed from: f */
    private static volatile bxxk f85222f;

    /* renamed from: a */
    public int f85223a;

    /* renamed from: b */
    public ByteString f85224b = ByteString.f164797b;

    /* renamed from: c */
    public bxwc f85225c = bxxn.f165040b;

    /* renamed from: d */
    public int f85226d;

    static {
        apze apze = new apze();
        f85221e = apze;
        GeneratedMessageLite.m124024a(apze.class, apze);
    }

    private apze() {
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
            return GeneratedMessageLite.m124022a(f85221e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u001b\u0003ည\u0000\u0004ဌ\u0001", new Object[]{"a", "c", apzh.class, "b", "d", apzd.f85220a});
        } else if (i2 == 3) {
            return new apze();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f85221e;
            }
            bxxk bxxk = f85222f;
            if (bxxk == null) {
                synchronized (apze.class) {
                    bxxk = f85222f;
                    if (bxxk == null) {
                        bxxk = new bxve(f85221e);
                        f85222f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
