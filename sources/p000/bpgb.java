package p000;

/* renamed from: bpgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgb extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bpgb f137469a;

    /* renamed from: b */
    private static volatile bxxk f137470b;

    static {
        bpgb bpgb = new bpgb();
        f137469a = bpgb;
        GeneratedMessageLite.m124024a(bpgb.class, bpgb);
    }

    private bpgb() {
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
            return GeneratedMessageLite.m124022a(f137469a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpgb();
        }
        if (i2 == 4) {
            return new bxvd(f137469a);
        }
        if (i2 == 5) {
            return f137469a;
        }
        bxxk bxxk = f137470b;
        if (bxxk == null) {
            synchronized (bpgb.class) {
                bxxk = f137470b;
                if (bxxk == null) {
                    bxxk = new bxve(f137469a);
                    f137470b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
