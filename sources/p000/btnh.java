package p000;

/* renamed from: btnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btnh extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btnh f149618e;

    /* renamed from: f */
    private static volatile bxxk f149619f;

    /* renamed from: a */
    public String f149620a = "";

    /* renamed from: b */
    public String f149621b = "";

    /* renamed from: c */
    public String f149622c = "";

    /* renamed from: d */
    public String f149623d = "";

    static {
        btnh btnh = new btnh();
        f149618e = btnh;
        GeneratedMessageLite.m124024a(btnh.class, btnh);
    }

    private btnh() {
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
            return GeneratedMessageLite.m124022a(f149618e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btnh();
        } else {
            if (i2 == 4) {
                return new bxvd(f149618e);
            }
            if (i2 == 5) {
                return f149618e;
            }
            bxxk bxxk = f149619f;
            if (bxxk == null) {
                synchronized (btnh.class) {
                    bxxk = f149619f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149618e);
                        f149619f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
