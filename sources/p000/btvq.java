package p000;

/* renamed from: btvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvq extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btvq f152634a;

    /* renamed from: b */
    private static volatile bxxk f152635b;

    static {
        btvq btvq = new btvq();
        f152634a = btvq;
        GeneratedMessageLite.m124024a(btvq.class, btvq);
    }

    private btvq() {
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
            return GeneratedMessageLite.m124022a(f152634a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btvq();
        }
        if (i2 == 4) {
            return new bxvd(f152634a);
        }
        if (i2 == 5) {
            return f152634a;
        }
        bxxk bxxk = f152635b;
        if (bxxk == null) {
            synchronized (btvq.class) {
                bxxk = f152635b;
                if (bxxk == null) {
                    bxxk = new bxve(f152634a);
                    f152635b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
