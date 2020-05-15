package p000;

/* renamed from: btmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btmq f149524c;

    /* renamed from: d */
    private static volatile bxxk f149525d;

    /* renamed from: a */
    public String f149526a = "";

    /* renamed from: b */
    public String f149527b = "";

    static {
        btmq btmq = new btmq();
        f149524c = btmq;
        GeneratedMessageLite.m124024a(btmq.class, btmq);
    }

    private btmq() {
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
            return GeneratedMessageLite.m124022a(f149524c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btmq();
        } else {
            if (i2 == 4) {
                return new bxvd(f149524c);
            }
            if (i2 == 5) {
                return f149524c;
            }
            bxxk bxxk = f149525d;
            if (bxxk == null) {
                synchronized (btmq.class) {
                    bxxk = f149525d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149524c);
                        f149525d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
