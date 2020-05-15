package p000;

/* renamed from: bpgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgp extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bpgp f137522a;

    /* renamed from: b */
    private static volatile bxxk f137523b;

    static {
        bpgp bpgp = new bpgp();
        f137522a = bpgp;
        GeneratedMessageLite.m124024a(bpgp.class, bpgp);
    }

    private bpgp() {
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
            return GeneratedMessageLite.m124022a(f137522a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpgp();
        }
        if (i2 == 4) {
            return new bxvd(f137522a);
        }
        if (i2 == 5) {
            return f137522a;
        }
        bxxk bxxk = f137523b;
        if (bxxk == null) {
            synchronized (bpgp.class) {
                bxxk = f137523b;
                if (bxxk == null) {
                    bxxk = new bxve(f137522a);
                    f137523b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
