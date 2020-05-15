package p000;

/* renamed from: bqie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqie extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bqie f140790a;

    /* renamed from: b */
    private static volatile bxxk f140791b;

    static {
        bqie bqie = new bqie();
        f140790a = bqie;
        GeneratedMessageLite.m124024a(bqie.class, bqie);
    }

    private bqie() {
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
            return GeneratedMessageLite.m124022a(f140790a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bqie();
        }
        if (i2 == 4) {
            return new bxvd(f140790a);
        }
        if (i2 == 5) {
            return f140790a;
        }
        bxxk bxxk = f140791b;
        if (bxxk == null) {
            synchronized (bqie.class) {
                bxxk = f140791b;
                if (bxxk == null) {
                    bxxk = new bxve(f140790a);
                    f140791b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
