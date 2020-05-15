package p000;

/* renamed from: bybs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybs extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bybs f165588e;

    /* renamed from: f */
    private static volatile bxxk f165589f;

    /* renamed from: a */
    public String f165590a = "";

    /* renamed from: b */
    public String f165591b = "";

    /* renamed from: c */
    public String f165592c = "";

    /* renamed from: d */
    public String f165593d = "";

    static {
        bybs bybs = new bybs();
        f165588e = bybs;
        GeneratedMessageLite.m124024a(bybs.class, bybs);
    }

    private bybs() {
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
            return GeneratedMessageLite.m124022a(f165588e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bybs();
        } else {
            if (i2 == 4) {
                return new bxvd(f165588e);
            }
            if (i2 == 5) {
                return f165588e;
            }
            bxxk bxxk = f165589f;
            if (bxxk == null) {
                synchronized (bybs.class) {
                    bxxk = f165589f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165588e);
                        f165589f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
