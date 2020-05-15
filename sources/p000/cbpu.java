package p000;

/* renamed from: cbpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpu extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbpu f177959c;

    /* renamed from: d */
    private static volatile bxxk f177960d;

    /* renamed from: a */
    public String f177961a = "";

    /* renamed from: b */
    public String f177962b = "";

    static {
        cbpu cbpu = new cbpu();
        f177959c = cbpu;
        GeneratedMessageLite.m124024a(cbpu.class, cbpu);
    }

    private cbpu() {
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
            return GeneratedMessageLite.m124022a(f177959c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbpu();
        } else {
            if (i2 == 4) {
                return new bxvd(f177959c);
            }
            if (i2 == 5) {
                return f177959c;
            }
            bxxk bxxk = f177960d;
            if (bxxk == null) {
                synchronized (cbpu.class) {
                    bxxk = f177960d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177959c);
                        f177960d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
