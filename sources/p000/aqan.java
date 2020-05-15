package p000;

/* renamed from: aqan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqan extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final aqan f85413d;

    /* renamed from: e */
    private static volatile bxxk f85414e;

    /* renamed from: a */
    public int f85415a;

    /* renamed from: b */
    public String f85416b = "";

    /* renamed from: c */
    public ByteString f85417c = ByteString.f164797b;

    static {
        aqan aqan = new aqan();
        f85413d = aqan;
        GeneratedMessageLite.m124024a(aqan.class, aqan);
    }

    private aqan() {
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
            return GeneratedMessageLite.m124022a(f85413d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aqan();
        } else {
            if (i2 == 4) {
                return new bxvd(f85413d);
            }
            if (i2 == 5) {
                return f85413d;
            }
            bxxk bxxk = f85414e;
            if (bxxk == null) {
                synchronized (aqan.class) {
                    bxxk = f85414e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85413d);
                        f85414e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
