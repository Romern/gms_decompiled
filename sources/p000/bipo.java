package p000;

/* renamed from: bipo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipo extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bipo f121192a;

    /* renamed from: b */
    private static volatile bxxk f121193b;

    static {
        bipo bipo = new bipo();
        f121192a = bipo;
        GeneratedMessageLite.m124024a(bipo.class, bipo);
    }

    private bipo() {
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
            return GeneratedMessageLite.m124022a(f121192a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bipo();
        }
        if (i2 == 4) {
            return new bxvd(f121192a);
        }
        if (i2 == 5) {
            return f121192a;
        }
        bxxk bxxk = f121193b;
        if (bxxk == null) {
            synchronized (bipo.class) {
                bxxk = f121193b;
                if (bxxk == null) {
                    bxxk = new bxve(f121192a);
                    f121193b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
