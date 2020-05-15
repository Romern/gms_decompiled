package p000;

/* renamed from: amln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amln extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final amln f75192d;

    /* renamed from: e */
    private static volatile bxxk f75193e;

    /* renamed from: a */
    public int f75194a;

    /* renamed from: b */
    public int f75195b;

    /* renamed from: c */
    public int f75196c;

    static {
        amln amln = new amln();
        f75192d = amln;
        GeneratedMessageLite.m124024a(amln.class, amln);
    }

    private amln() {
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
            return GeneratedMessageLite.m124022a(f75192d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", amll.f75191a, "c"});
        } else if (i2 == 3) {
            return new amln();
        } else {
            if (i2 == 4) {
                return new bxvd(f75192d);
            }
            if (i2 == 5) {
                return f75192d;
            }
            bxxk bxxk = f75193e;
            if (bxxk == null) {
                synchronized (amln.class) {
                    bxxk = f75193e;
                    if (bxxk == null) {
                        bxxk = new bxve(f75192d);
                        f75193e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
