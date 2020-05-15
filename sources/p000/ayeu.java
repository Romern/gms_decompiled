package p000;

/* renamed from: ayeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayeu extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final ayeu f97374a;

    /* renamed from: b */
    private static volatile bxxk f97375b;

    static {
        ayeu ayeu = new ayeu();
        f97374a = ayeu;
        GeneratedMessageLite.m124024a(ayeu.class, ayeu);
    }

    private ayeu() {
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
            return GeneratedMessageLite.m124022a(f97374a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new ayeu();
        }
        if (i2 == 4) {
            return new bxvd(f97374a);
        }
        if (i2 == 5) {
            return f97374a;
        }
        bxxk bxxk = f97375b;
        if (bxxk == null) {
            synchronized (ayeu.class) {
                bxxk = f97375b;
                if (bxxk == null) {
                    bxxk = new bxve(f97374a);
                    f97375b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
