package p000;

/* renamed from: bvrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrw extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvrw f157466a;

    /* renamed from: b */
    private static volatile bxxk f157467b;

    static {
        bvrw bvrw = new bvrw();
        f157466a = bvrw;
        GeneratedMessageLite.m124024a(bvrw.class, bvrw);
    }

    private bvrw() {
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
            return GeneratedMessageLite.m124022a(f157466a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrw();
        }
        if (i2 == 4) {
            return new bxvd(f157466a);
        }
        if (i2 == 5) {
            return f157466a;
        }
        bxxk bxxk = f157467b;
        if (bxxk == null) {
            synchronized (bvrw.class) {
                bxxk = f157467b;
                if (bxxk == null) {
                    bxxk = new bxve(f157466a);
                    f157467b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
