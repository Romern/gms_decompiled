package p000;

/* renamed from: bpfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpfz extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bpfz f137465a;

    /* renamed from: b */
    private static volatile bxxk f137466b;

    static {
        bpfz bpfz = new bpfz();
        f137465a = bpfz;
        GeneratedMessageLite.m124024a(bpfz.class, bpfz);
    }

    private bpfz() {
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
            return GeneratedMessageLite.m124022a(f137465a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpfz();
        }
        if (i2 == 4) {
            return new bxvd(f137465a);
        }
        if (i2 == 5) {
            return f137465a;
        }
        bxxk bxxk = f137466b;
        if (bxxk == null) {
            synchronized (bpfz.class) {
                bxxk = f137466b;
                if (bxxk == null) {
                    bxxk = new bxve(f137465a);
                    f137466b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
