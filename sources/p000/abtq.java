package p000;

/* renamed from: abtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abtq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final abtq f58291d;

    /* renamed from: e */
    private static volatile bxxk f58292e;

    /* renamed from: a */
    public int f58293a;

    /* renamed from: b */
    public ByteString f58294b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f58295c = ByteString.f164797b;

    static {
        abtq abtq = new abtq();
        f58291d = abtq;
        GeneratedMessageLite.m124024a(abtq.class, abtq);
    }

    private abtq() {
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
            return GeneratedMessageLite.m124022a(f58291d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new abtq();
        } else {
            if (i2 == 4) {
                return new bxvd(f58291d);
            }
            if (i2 == 5) {
                return f58291d;
            }
            bxxk bxxk = f58292e;
            if (bxxk == null) {
                synchronized (abtq.class) {
                    bxxk = f58292e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58291d);
                        f58292e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
