package p000;

/* renamed from: diq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class diq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final diq f13260d;

    /* renamed from: e */
    private static volatile bxxk f13261e;

    /* renamed from: a */
    public int f13262a;

    /* renamed from: b */
    public int f13263b = -1;

    /* renamed from: c */
    public bxvt f13264c = bxvm.f164965b;

    static {
        diq diq = new diq();
        f13260d = diq;
        GeneratedMessageLite.m124024a(diq.class, diq);
    }

    private diq() {
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
            return GeneratedMessageLite.m124022a(f13260d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0016", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new diq();
        } else {
            if (i2 == 4) {
                return new bxvd(f13260d);
            }
            if (i2 == 5) {
                return f13260d;
            }
            bxxk bxxk = f13261e;
            if (bxxk == null) {
                synchronized (diq.class) {
                    bxxk = f13261e;
                    if (bxxk == null) {
                        bxxk = new bxve(f13260d);
                        f13261e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
