package p000;

/* renamed from: bugd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bugd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bugd f153768c;

    /* renamed from: d */
    private static volatile bxxk f153769d;

    /* renamed from: a */
    public int f153770a;

    /* renamed from: b */
    public int f153771b;

    static {
        bugd bugd = new bugd();
        f153768c = bugd;
        GeneratedMessageLite.m124024a(bugd.class, bugd);
    }

    private bugd() {
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
            return GeneratedMessageLite.m124022a(f153768c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bugb.f153767a});
        } else if (i2 == 3) {
            return new bugd();
        } else {
            if (i2 == 4) {
                return new bxvd(f153768c);
            }
            if (i2 == 5) {
                return f153768c;
            }
            bxxk bxxk = f153769d;
            if (bxxk == null) {
                synchronized (bugd.class) {
                    bxxk = f153769d;
                    if (bxxk == null) {
                        bxxk = new bxve(f153768c);
                        f153769d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
