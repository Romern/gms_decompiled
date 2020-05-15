package p000;

/* renamed from: cals */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cals extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cals f175174a;

    /* renamed from: b */
    private static volatile bxxk f175175b;

    static {
        cals cals = new cals();
        f175174a = cals;
        GeneratedMessageLite.m124024a(cals.class, cals);
    }

    private cals() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f175174a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cals();
        }
        if (i2 == 4) {
            return new bxvd(f175174a);
        }
        if (i2 == 5) {
            return f175174a;
        }
        bxxk bxxk = f175175b;
        if (bxxk == null) {
            synchronized (cals.class) {
                bxxk = f175175b;
                if (bxxk == null) {
                    bxxk = new bxve(f175174a);
                    f175175b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
