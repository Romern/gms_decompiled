package p000;

/* renamed from: bpgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgq extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bpgq f137524a;

    /* renamed from: b */
    private static volatile bxxk f137525b;

    static {
        bpgq bpgq = new bpgq();
        f137524a = bpgq;
        GeneratedMessageLite.m124024a(bpgq.class, bpgq);
    }

    private bpgq() {
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
            return GeneratedMessageLite.m124022a(f137524a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpgq();
        }
        if (i2 == 4) {
            return new bxvd(f137524a);
        }
        if (i2 == 5) {
            return f137524a;
        }
        bxxk bxxk = f137525b;
        if (bxxk == null) {
            synchronized (bpgq.class) {
                bxxk = f137525b;
                if (bxxk == null) {
                    bxxk = new bxve(f137524a);
                    f137525b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
