package p000;

/* renamed from: btbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbt extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btbt f148212b;

    /* renamed from: c */
    private static volatile bxxk f148213c;

    /* renamed from: a */
    public int f148214a;

    static {
        btbt btbt = new btbt();
        f148212b = btbt;
        GeneratedMessageLite.m124024a(btbt.class, btbt);
    }

    private btbt() {
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
            return GeneratedMessageLite.m124022a(f148212b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btbt();
        } else {
            if (i2 == 4) {
                return new bxvd(f148212b);
            }
            if (i2 == 5) {
                return f148212b;
            }
            bxxk bxxk = f148213c;
            if (bxxk == null) {
                synchronized (btbt.class) {
                    bxxk = f148213c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148212b);
                        f148213c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
