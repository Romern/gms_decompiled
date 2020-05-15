package p000;

/* renamed from: bzxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxy extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bzxy f171821e;

    /* renamed from: f */
    private static volatile bxxk f171822f;

    /* renamed from: a */
    public String f171823a = "";

    /* renamed from: b */
    public long f171824b;

    /* renamed from: c */
    public String f171825c = "";

    /* renamed from: d */
    public String f171826d = "";

    static {
        bzxy bzxy = new bzxy();
        f171821e = bzxy;
        GeneratedMessageLite.m124024a(bzxy.class, bzxy);
    }

    private bzxy() {
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
            return GeneratedMessageLite.m124022a(f171821e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzxy();
        } else {
            if (i2 == 4) {
                return new bxvd(f171821e);
            }
            if (i2 == 5) {
                return f171821e;
            }
            bxxk bxxk = f171822f;
            if (bxxk == null) {
                synchronized (bzxy.class) {
                    bxxk = f171822f;
                    if (bxxk == null) {
                        bxxk = new bxve(f171821e);
                        f171822f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
