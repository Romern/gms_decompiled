package p000;

/* renamed from: btiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btiq extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btiq f149014e;

    /* renamed from: f */
    private static volatile bxxk f149015f;

    /* renamed from: a */
    public String f149016a = "";

    /* renamed from: b */
    public String f149017b = "";

    /* renamed from: c */
    public int f149018c;

    /* renamed from: d */
    public int f149019d;

    static {
        btiq btiq = new btiq();
        f149014e = btiq;
        GeneratedMessageLite.m124024a(btiq.class, btiq);
    }

    private btiq() {
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
            return GeneratedMessageLite.m124022a(f149014e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btiq();
        } else {
            if (i2 == 4) {
                return new bxvd(f149014e);
            }
            if (i2 == 5) {
                return f149014e;
            }
            bxxk bxxk = f149015f;
            if (bxxk == null) {
                synchronized (btiq.class) {
                    bxxk = f149015f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149014e);
                        f149015f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
