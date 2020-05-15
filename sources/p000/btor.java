package p000;

/* renamed from: btor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btor extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btor f149795a;

    /* renamed from: b */
    private static volatile bxxk f149796b;

    static {
        btor btor = new btor();
        f149795a = btor;
        GeneratedMessageLite.m124024a(btor.class, btor);
    }

    private btor() {
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
            return GeneratedMessageLite.m124022a(f149795a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btor();
        }
        if (i2 == 4) {
            return new bxvd(f149795a);
        }
        if (i2 == 5) {
            return f149795a;
        }
        bxxk bxxk = f149796b;
        if (bxxk == null) {
            synchronized (btor.class) {
                bxxk = f149796b;
                if (bxxk == null) {
                    bxxk = new bxve(f149795a);
                    f149796b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
