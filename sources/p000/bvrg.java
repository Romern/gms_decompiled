package p000;

/* renamed from: bvrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrg extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvrg f157434a;

    /* renamed from: b */
    private static volatile bxxk f157435b;

    static {
        bvrg bvrg = new bvrg();
        f157434a = bvrg;
        GeneratedMessageLite.m124024a(bvrg.class, bvrg);
    }

    private bvrg() {
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
            return GeneratedMessageLite.m124022a(f157434a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrg();
        }
        if (i2 == 4) {
            return new bxvd(f157434a);
        }
        if (i2 == 5) {
            return f157434a;
        }
        bxxk bxxk = f157435b;
        if (bxxk == null) {
            synchronized (bvrg.class) {
                bxxk = f157435b;
                if (bxxk == null) {
                    bxxk = new bxve(f157434a);
                    f157435b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
