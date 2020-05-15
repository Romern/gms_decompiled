package p000;

/* renamed from: btau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btau extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final btau f148048f;

    /* renamed from: g */
    private static volatile bxxk f148049g;

    /* renamed from: a */
    public String f148050a = "";

    /* renamed from: b */
    public String f148051b = "";

    /* renamed from: c */
    public String f148052c = "";

    /* renamed from: d */
    public String f148053d = "";

    /* renamed from: e */
    public String f148054e = "";

    static {
        btau btau = new btau();
        f148048f = btau;
        GeneratedMessageLite.m124024a(btau.class, btau);
    }

    private btau() {
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
            return GeneratedMessageLite.m124022a(f148048f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btau();
        } else {
            if (i2 == 4) {
                return new bxvd(f148048f);
            }
            if (i2 == 5) {
                return f148048f;
            }
            bxxk bxxk = f148049g;
            if (bxxk == null) {
                synchronized (btau.class) {
                    bxxk = f148049g;
                    if (bxxk == null) {
                        bxxk = new bxve(f148048f);
                        f148049g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
