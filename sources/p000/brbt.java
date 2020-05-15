package p000;

/* renamed from: brbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbt extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final brbt f142314c;

    /* renamed from: d */
    private static volatile bxxk f142315d;

    /* renamed from: a */
    public int f142316a;

    /* renamed from: b */
    public int f142317b;

    static {
        brbt brbt = new brbt();
        f142314c = brbt;
        GeneratedMessageLite.m124024a(brbt.class, brbt);
    }

    private brbt() {
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
            return GeneratedMessageLite.m124022a(f142314c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", brbs.f142313a});
        } else if (i2 == 3) {
            return new brbt();
        } else {
            if (i2 == 4) {
                return new bxvd(f142314c);
            }
            if (i2 == 5) {
                return f142314c;
            }
            bxxk bxxk = f142315d;
            if (bxxk == null) {
                synchronized (brbt.class) {
                    bxxk = f142315d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142314c);
                        f142315d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
