package p000;

/* renamed from: bvte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvte extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvte f157560a;

    /* renamed from: b */
    private static volatile bxxk f157561b;

    static {
        bvte bvte = new bvte();
        f157560a = bvte;
        GeneratedMessageLite.m124024a(bvte.class, bvte);
    }

    private bvte() {
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
            return GeneratedMessageLite.m124022a(f157560a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvte();
        }
        if (i2 == 4) {
            return new bxvd(f157560a);
        }
        if (i2 == 5) {
            return f157560a;
        }
        bxxk bxxk = f157561b;
        if (bxxk == null) {
            synchronized (bvte.class) {
                bxxk = f157561b;
                if (bxxk == null) {
                    bxxk = new bxve(f157560a);
                    f157561b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
