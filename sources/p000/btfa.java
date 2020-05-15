package p000;

/* renamed from: btfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btfa extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btfa f148603c;

    /* renamed from: d */
    private static volatile bxxk f148604d;

    /* renamed from: a */
    public String f148605a = "";

    /* renamed from: b */
    public String f148606b = "";

    static {
        btfa btfa = new btfa();
        f148603c = btfa;
        GeneratedMessageLite.m124024a(btfa.class, btfa);
    }

    private btfa() {
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
            return GeneratedMessageLite.m124022a(f148603c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btfa();
        } else {
            if (i2 == 4) {
                return new bxvd(f148603c);
            }
            if (i2 == 5) {
                return f148603c;
            }
            bxxk bxxk = f148604d;
            if (bxxk == null) {
                synchronized (btfa.class) {
                    bxxk = f148604d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148603c);
                        f148604d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
