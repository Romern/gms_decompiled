package p000;

/* renamed from: bwsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsg extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bwsg f160856a;

    /* renamed from: b */
    private static volatile bxxk f160857b;

    static {
        bwsg bwsg = new bwsg();
        f160856a = bwsg;
        bxvk.m124024a(bwsg.class, bwsg);
    }

    private bwsg() {
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
            return bxvk.m124022a(f160856a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwsg();
        }
        if (i2 == 4) {
            return new bxvd(f160856a);
        }
        if (i2 == 5) {
            return f160856a;
        }
        bxxk bxxk = f160857b;
        if (bxxk == null) {
            synchronized (bwsg.class) {
                bxxk = f160857b;
                if (bxxk == null) {
                    bxxk = new bxve(f160856a);
                    f160857b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
