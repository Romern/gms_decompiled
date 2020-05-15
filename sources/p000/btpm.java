package p000;

/* renamed from: btpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpm extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btpm f149860e;

    /* renamed from: f */
    private static volatile bxxk f149861f;

    /* renamed from: a */
    public String f149862a = "";

    /* renamed from: b */
    public int f149863b;

    /* renamed from: c */
    public String f149864c = "";

    /* renamed from: d */
    public String f149865d = "";

    static {
        btpm btpm = new btpm();
        f149860e = btpm;
        GeneratedMessageLite.m124024a(btpm.class, btpm);
    }

    private btpm() {
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
            return GeneratedMessageLite.m124022a(f149860e, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001Ȉ\u0005\u0004\u0006Ȉ\u0007Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btpm();
        } else {
            if (i2 == 4) {
                return new bxvd(f149860e);
            }
            if (i2 == 5) {
                return f149860e;
            }
            bxxk bxxk = f149861f;
            if (bxxk == null) {
                synchronized (btpm.class) {
                    bxxk = f149861f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149860e);
                        f149861f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
