package p000;

/* renamed from: bwzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwzx extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwzx f161658b;

    /* renamed from: c */
    private static volatile bxxk f161659c;

    /* renamed from: a */
    public bxvw f161660a = bxwq.f165002b;

    static {
        bwzx bwzx = new bwzx();
        f161658b = bwzx;
        GeneratedMessageLite.m124024a(bwzx.class, bwzx);
    }

    private bwzx() {
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
            return GeneratedMessageLite.m124022a(f161658b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bwzx();
        } else {
            if (i2 == 4) {
                return new bxvd(f161658b);
            }
            if (i2 == 5) {
                return f161658b;
            }
            bxxk bxxk = f161659c;
            if (bxxk == null) {
                synchronized (bwzx.class) {
                    bxxk = f161659c;
                    if (bxxk == null) {
                        bxxk = new bxve(f161658b);
                        f161659c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
