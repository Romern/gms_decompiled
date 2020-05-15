package p000;

/* renamed from: bygc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bygc extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bygc f166107e;

    /* renamed from: f */
    private static volatile bxxk f166108f;

    /* renamed from: a */
    public long f166109a;

    /* renamed from: b */
    public String f166110b = "";

    /* renamed from: c */
    public String f166111c = "";

    /* renamed from: d */
    public String f166112d = "";

    static {
        bygc bygc = new bygc();
        f166107e = bygc;
        GeneratedMessageLite.m124024a(bygc.class, bygc);
    }

    private bygc() {
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
            return GeneratedMessageLite.m124022a(f166107e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bygc();
        } else {
            if (i2 == 4) {
                return new bxvd(f166107e);
            }
            if (i2 == 5) {
                return f166107e;
            }
            bxxk bxxk = f166108f;
            if (bxxk == null) {
                synchronized (bygc.class) {
                    bxxk = f166108f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166107e);
                        f166108f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
