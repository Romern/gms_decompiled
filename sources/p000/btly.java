package p000;

/* renamed from: btly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btly extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btly f149454b;

    /* renamed from: c */
    private static volatile bxxk f149455c;

    /* renamed from: a */
    public String f149456a = "";

    static {
        btly btly = new btly();
        f149454b = btly;
        GeneratedMessageLite.m124024a(btly.class, btly);
    }

    private btly() {
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
            return GeneratedMessageLite.m124022a(f149454b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btly();
        } else {
            if (i2 == 4) {
                return new bxvd(f149454b);
            }
            if (i2 == 5) {
                return f149454b;
            }
            bxxk bxxk = f149455c;
            if (bxxk == null) {
                synchronized (btly.class) {
                    bxxk = f149455c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149454b);
                        f149455c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
