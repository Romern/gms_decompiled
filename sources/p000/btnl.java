package p000;

/* renamed from: btnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btnl extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btnl f149646e;

    /* renamed from: f */
    private static volatile bxxk f149647f;

    /* renamed from: a */
    public String f149648a = "";

    /* renamed from: b */
    public String f149649b = "";

    /* renamed from: c */
    public String f149650c = "";

    /* renamed from: d */
    public String f149651d = "";

    static {
        btnl btnl = new btnl();
        f149646e = btnl;
        GeneratedMessageLite.m124024a(btnl.class, btnl);
    }

    private btnl() {
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
            return GeneratedMessageLite.m124022a(f149646e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btnl();
        } else {
            if (i2 == 4) {
                return new bxvd(f149646e);
            }
            if (i2 == 5) {
                return f149646e;
            }
            bxxk bxxk = f149647f;
            if (bxxk == null) {
                synchronized (btnl.class) {
                    bxxk = f149647f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149646e);
                        f149647f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
