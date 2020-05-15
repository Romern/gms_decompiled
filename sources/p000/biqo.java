package p000;

/* renamed from: biqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biqo extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final biqo f121310a;

    /* renamed from: b */
    private static volatile bxxk f121311b;

    static {
        biqo biqo = new biqo();
        f121310a = biqo;
        GeneratedMessageLite.m124024a(biqo.class, biqo);
    }

    private biqo() {
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
            return GeneratedMessageLite.m124022a(f121310a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new biqo();
        }
        if (i2 == 4) {
            return new bxvd(f121310a);
        }
        if (i2 == 5) {
            return f121310a;
        }
        bxxk bxxk = f121311b;
        if (bxxk == null) {
            synchronized (biqo.class) {
                bxxk = f121311b;
                if (bxxk == null) {
                    bxxk = new bxve(f121310a);
                    f121311b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
