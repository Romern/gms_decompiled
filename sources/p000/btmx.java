package p000;

/* renamed from: btmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmx extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btmx f149574b;

    /* renamed from: c */
    private static volatile bxxk f149575c;

    /* renamed from: a */
    public String f149576a = "";

    static {
        btmx btmx = new btmx();
        f149574b = btmx;
        GeneratedMessageLite.m124024a(btmx.class, btmx);
    }

    private btmx() {
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
            return GeneratedMessageLite.m124022a(f149574b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btmx();
        } else {
            if (i2 == 4) {
                return new bxvd(f149574b);
            }
            if (i2 == 5) {
                return f149574b;
            }
            bxxk bxxk = f149575c;
            if (bxxk == null) {
                synchronized (btmx.class) {
                    bxxk = f149575c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149574b);
                        f149575c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
