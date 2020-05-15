package p000;

/* renamed from: bvsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsw extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvsw f157533a;

    /* renamed from: b */
    private static volatile bxxk f157534b;

    static {
        bvsw bvsw = new bvsw();
        f157533a = bvsw;
        GeneratedMessageLite.m124024a(bvsw.class, bvsw);
    }

    private bvsw() {
        bxwq bxwq = bxwq.f165002b;
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
            return GeneratedMessageLite.m124022a(f157533a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsw();
        }
        if (i2 == 4) {
            return new bxvd(f157533a);
        }
        if (i2 == 5) {
            return f157533a;
        }
        bxxk bxxk = f157534b;
        if (bxxk == null) {
            synchronized (bvsw.class) {
                bxxk = f157534b;
                if (bxxk == null) {
                    bxxk = new bxve(f157533a);
                    f157534b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
