package p000;

/* renamed from: bweg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bweg extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bweg f158977a;

    /* renamed from: b */
    private static volatile bxxk f158978b;

    static {
        bweg bweg = new bweg();
        f158977a = bweg;
        GeneratedMessageLite.m124024a(bweg.class, bweg);
    }

    private bweg() {
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
            return GeneratedMessageLite.m124022a(f158977a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bweg();
        }
        if (i2 == 4) {
            return new bxvd(f158977a);
        }
        if (i2 == 5) {
            return f158977a;
        }
        bxxk bxxk = f158978b;
        if (bxxk == null) {
            synchronized (bweg.class) {
                bxxk = f158978b;
                if (bxxk == null) {
                    bxxk = new bxve(f158977a);
                    f158978b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
