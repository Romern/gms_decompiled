package p000;

/* renamed from: biwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biwb extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final biwb f122066a;

    /* renamed from: b */
    private static volatile bxxk f122067b;

    static {
        biwb biwb = new biwb();
        f122066a = biwb;
        GeneratedMessageLite.m124024a(biwb.class, biwb);
    }

    private biwb() {
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
            return GeneratedMessageLite.m124022a(f122066a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new biwb();
        }
        if (i2 == 4) {
            return new bxvd(f122066a);
        }
        if (i2 == 5) {
            return f122066a;
        }
        bxxk bxxk = f122067b;
        if (bxxk == null) {
            synchronized (biwb.class) {
                bxxk = f122067b;
                if (bxxk == null) {
                    bxxk = new bxve(f122066a);
                    f122067b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
