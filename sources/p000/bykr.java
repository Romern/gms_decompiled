package p000;

/* renamed from: bykr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bykr extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bykr f166780c;

    /* renamed from: d */
    public static final bxvx f166781d = bxwb.m124074a(bykp.f166776f, bykp.RESULT_UNKNOWN);

    /* renamed from: f */
    private static volatile bxxk f166782f;

    /* renamed from: a */
    public int f166783a;

    /* renamed from: b */
    public bxww f166784b = bxww.f165013b;

    /* renamed from: e */
    private int f166785e;

    static {
        bykr bykr = new bykr();
        f166780c = bykr;
        GeneratedMessageLite.m124024a(bykr.class, bykr);
    }

    private bykr() {
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
            return GeneratedMessageLite.m124022a(f166780c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဌ\u0000\u0002࠲", new Object[]{"e", "a", bykp.m124909b(), "b", bykq.f166779a, bykp.m124909b()});
        } else if (i2 == 3) {
            return new bykr();
        } else {
            if (i2 == 4) {
                return new bxvd(f166780c);
            }
            if (i2 == 5) {
                return f166780c;
            }
            bxxk bxxk = f166782f;
            if (bxxk == null) {
                synchronized (bykr.class) {
                    bxxk = f166782f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166780c);
                        f166782f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
