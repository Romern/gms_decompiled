package p000;

/* renamed from: bito */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bito extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bito f121687a;

    /* renamed from: b */
    private static volatile bxxk f121688b;

    static {
        bito bito = new bito();
        f121687a = bito;
        GeneratedMessageLite.m124024a(bito.class, bito);
    }

    private bito() {
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
            return GeneratedMessageLite.m124022a(f121687a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bito();
        }
        if (i2 == 4) {
            return new bxvd(f121687a);
        }
        if (i2 == 5) {
            return f121687a;
        }
        bxxk bxxk = f121688b;
        if (bxxk == null) {
            synchronized (bito.class) {
                bxxk = f121688b;
                if (bxxk == null) {
                    bxxk = new bxve(f121687a);
                    f121688b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
