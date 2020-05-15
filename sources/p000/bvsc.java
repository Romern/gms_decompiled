package p000;

/* renamed from: bvsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsc extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvsc f157478a;

    /* renamed from: b */
    private static volatile bxxk f157479b;

    static {
        bvsc bvsc = new bvsc();
        f157478a = bvsc;
        GeneratedMessageLite.m124024a(bvsc.class, bvsc);
    }

    private bvsc() {
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
            return GeneratedMessageLite.m124022a(f157478a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsc();
        }
        if (i2 == 4) {
            return new bxvd(f157478a);
        }
        if (i2 == 5) {
            return f157478a;
        }
        bxxk bxxk = f157479b;
        if (bxxk == null) {
            synchronized (bvsc.class) {
                bxxk = f157479b;
                if (bxxk == null) {
                    bxxk = new bxve(f157478a);
                    f157479b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
