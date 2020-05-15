package p000;

/* renamed from: bpna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpna extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bpna f138380a;

    /* renamed from: b */
    private static volatile bxxk f138381b;

    static {
        bpna bpna = new bpna();
        f138380a = bpna;
        GeneratedMessageLite.m124024a(bpna.class, bpna);
    }

    private bpna() {
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
            return GeneratedMessageLite.m124022a(f138380a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpna();
        }
        if (i2 == 4) {
            return new bxvd(f138380a);
        }
        if (i2 == 5) {
            return f138380a;
        }
        bxxk bxxk = f138381b;
        if (bxxk == null) {
            synchronized (bpna.class) {
                bxxk = f138381b;
                if (bxxk == null) {
                    bxxk = new bxve(f138380a);
                    f138381b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
