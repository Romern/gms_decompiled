package p000;

/* renamed from: bzfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzfk f169822c;

    /* renamed from: d */
    private static volatile bxxk f169823d;

    /* renamed from: a */
    public int f169824a;

    /* renamed from: b */
    public bzfo f169825b;

    static {
        bzfk bzfk = new bzfk();
        f169822c = bzfk;
        GeneratedMessageLite.m124024a(bzfk.class, bzfk);
    }

    private bzfk() {
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
            return GeneratedMessageLite.m124022a(f169822c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzfk();
        } else {
            if (i2 == 4) {
                return new bxvd(f169822c);
            }
            if (i2 == 5) {
                return f169822c;
            }
            bxxk bxxk = f169823d;
            if (bxxk == null) {
                synchronized (bzfk.class) {
                    bxxk = f169823d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169822c);
                        f169823d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
