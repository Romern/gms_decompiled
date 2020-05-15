package p000;

/* renamed from: bpgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgn extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bpgn f137516a;

    /* renamed from: b */
    private static volatile bxxk f137517b;

    static {
        bpgn bpgn = new bpgn();
        f137516a = bpgn;
        bxvk.m124024a(bpgn.class, bpgn);
    }

    private bpgn() {
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
            return bxvk.m124022a(f137516a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpgn();
        }
        if (i2 == 4) {
            return new bxvd(f137516a);
        }
        if (i2 == 5) {
            return f137516a;
        }
        bxxk bxxk = f137517b;
        if (bxxk == null) {
            synchronized (bpgn.class) {
                bxxk = f137517b;
                if (bxxk == null) {
                    bxxk = new bxve(f137516a);
                    f137517b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
