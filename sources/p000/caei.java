package p000;

/* renamed from: caei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caei extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final caei f172825d;

    /* renamed from: e */
    private static volatile bxxk f172826e;

    /* renamed from: a */
    public String f172827a = "";

    /* renamed from: b */
    public int f172828b;

    /* renamed from: c */
    public ByteString f172829c = ByteString.f164797b;

    static {
        caei caei = new caei();
        f172825d = caei;
        GeneratedMessageLite.m124024a(caei.class, caei);
    }

    private caei() {
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
            return GeneratedMessageLite.m124022a(f172825d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new caei();
        } else {
            if (i2 == 4) {
                return new bxvd(f172825d);
            }
            if (i2 == 5) {
                return f172825d;
            }
            bxxk bxxk = f172826e;
            if (bxxk == null) {
                synchronized (caei.class) {
                    bxxk = f172826e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172825d);
                        f172826e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
