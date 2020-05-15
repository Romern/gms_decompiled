package p000;

/* renamed from: btol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btol extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btol f149768e;

    /* renamed from: f */
    private static volatile bxxk f149769f;

    /* renamed from: a */
    public btnn f149770a;

    /* renamed from: b */
    public String f149771b = "";

    /* renamed from: c */
    public String f149772c = "";

    /* renamed from: d */
    public String f149773d = "";

    static {
        btol btol = new btol();
        f149768e = btol;
        GeneratedMessageLite.m124024a(btol.class, btol);
    }

    private btol() {
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
            return GeneratedMessageLite.m124022a(f149768e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btol();
        } else {
            if (i2 == 4) {
                return new bxvd(f149768e);
            }
            if (i2 == 5) {
                return f149768e;
            }
            bxxk bxxk = f149769f;
            if (bxxk == null) {
                synchronized (btol.class) {
                    bxxk = f149769f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149768e);
                        f149769f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
