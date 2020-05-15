package p000;

/* renamed from: adic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adic extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final adic f61771c;

    /* renamed from: d */
    private static volatile bxxk f61772d;

    /* renamed from: a */
    public String f61773a = "";

    /* renamed from: b */
    public String f61774b = "";

    static {
        adic adic = new adic();
        f61771c = adic;
        GeneratedMessageLite.m124024a(adic.class, adic);
    }

    private adic() {
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
            return GeneratedMessageLite.m124022a(f61771c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new adic();
        } else {
            if (i2 == 4) {
                return new bxvd(f61771c);
            }
            if (i2 == 5) {
                return f61771c;
            }
            bxxk bxxk = f61772d;
            if (bxxk == null) {
                synchronized (adic.class) {
                    bxxk = f61772d;
                    if (bxxk == null) {
                        bxxk = new bxve(f61771c);
                        f61772d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
