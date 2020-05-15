package p000;

/* renamed from: buon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buon extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final buon f154553e;

    /* renamed from: f */
    private static volatile bxxk f154554f;

    /* renamed from: a */
    public long f154555a;

    /* renamed from: b */
    public ByteString f154556b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f154557c = ByteString.f164797b;

    /* renamed from: d */
    public String f154558d = "";

    static {
        buon buon = new buon();
        f154553e = buon;
        GeneratedMessageLite.m124024a(buon.class, buon);
    }

    private buon() {
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
            return GeneratedMessageLite.m124022a(f154553e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\n\u0003\n\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new buon();
        } else {
            if (i2 == 4) {
                return new bxvd(f154553e);
            }
            if (i2 == 5) {
                return f154553e;
            }
            bxxk bxxk = f154554f;
            if (bxxk == null) {
                synchronized (buon.class) {
                    bxxk = f154554f;
                    if (bxxk == null) {
                        bxxk = new bxve(f154553e);
                        f154554f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
