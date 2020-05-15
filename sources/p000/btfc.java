package p000;

/* renamed from: btfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btfc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btfc f148610b;

    /* renamed from: c */
    private static volatile bxxk f148611c;

    /* renamed from: a */
    public int f148612a;

    static {
        btfc btfc = new btfc();
        f148610b = btfc;
        GeneratedMessageLite.m124024a(btfc.class, btfc);
    }

    private btfc() {
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
            return GeneratedMessageLite.m124022a(f148610b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btfc();
        } else {
            if (i2 == 4) {
                return new bxvd(f148610b);
            }
            if (i2 == 5) {
                return f148610b;
            }
            bxxk bxxk = f148611c;
            if (bxxk == null) {
                synchronized (btfc.class) {
                    bxxk = f148611c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148610b);
                        f148611c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
