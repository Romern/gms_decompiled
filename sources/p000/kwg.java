package p000;

/* renamed from: kwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwg extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final kwg f25257c;

    /* renamed from: d */
    private static volatile bxxk f25258d;

    /* renamed from: a */
    public String f25259a = "";

    /* renamed from: b */
    public int f25260b;

    static {
        kwg kwg = new kwg();
        f25257c = kwg;
        GeneratedMessageLite.m124024a(kwg.class, kwg);
    }

    private kwg() {
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
            return GeneratedMessageLite.m124022a(f25257c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new kwg();
        } else {
            if (i2 == 4) {
                return new bxvd(f25257c);
            }
            if (i2 == 5) {
                return f25257c;
            }
            bxxk bxxk = f25258d;
            if (bxxk == null) {
                synchronized (kwg.class) {
                    bxxk = f25258d;
                    if (bxxk == null) {
                        bxxk = new bxve(f25257c);
                        f25258d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
