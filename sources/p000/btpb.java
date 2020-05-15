package p000;

/* renamed from: btpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btpb f149825c;

    /* renamed from: d */
    private static volatile bxxk f149826d;

    /* renamed from: a */
    public String f149827a = "";

    /* renamed from: b */
    public btiw f149828b;

    static {
        btpb btpb = new btpb();
        f149825c = btpb;
        GeneratedMessageLite.m124024a(btpb.class, btpb);
    }

    private btpb() {
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
            return GeneratedMessageLite.m124022a(f149825c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001Ȉ\u0003\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btpb();
        } else {
            if (i2 == 4) {
                return new bxvd(f149825c);
            }
            if (i2 == 5) {
                return f149825c;
            }
            bxxk bxxk = f149826d;
            if (bxxk == null) {
                synchronized (btpb.class) {
                    bxxk = f149826d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149825c);
                        f149826d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
