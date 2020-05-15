package p000;

/* renamed from: bvrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrx extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvrx f157468a;

    /* renamed from: b */
    private static volatile bxxk f157469b;

    static {
        bvrx bvrx = new bvrx();
        f157468a = bvrx;
        GeneratedMessageLite.m124024a(bvrx.class, bvrx);
    }

    private bvrx() {
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
            return GeneratedMessageLite.m124022a(f157468a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrx();
        }
        if (i2 == 4) {
            return new bxvd(f157468a);
        }
        if (i2 == 5) {
            return f157468a;
        }
        bxxk bxxk = f157469b;
        if (bxxk == null) {
            synchronized (bvrx.class) {
                bxxk = f157469b;
                if (bxxk == null) {
                    bxxk = new bxve(f157468a);
                    f157469b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
