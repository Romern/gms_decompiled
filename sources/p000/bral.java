package p000;

/* renamed from: bral */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bral extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bral f142158c;

    /* renamed from: d */
    private static volatile bxxk f142159d;

    /* renamed from: a */
    public int f142160a;

    /* renamed from: b */
    public blbt f142161b;

    static {
        bral bral = new bral();
        f142158c = bral;
        GeneratedMessageLite.m124024a(bral.class, bral);
    }

    private bral() {
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
            return GeneratedMessageLite.m124022a(f142158c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bral();
        } else {
            if (i2 == 4) {
                return new bxvd(f142158c);
            }
            if (i2 == 5) {
                return f142158c;
            }
            bxxk bxxk = f142159d;
            if (bxxk == null) {
                synchronized (bral.class) {
                    bxxk = f142159d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142158c);
                        f142159d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
