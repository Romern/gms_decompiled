package p000;

/* renamed from: bvps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvps extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvps f157341a;

    /* renamed from: b */
    private static volatile bxxk f157342b;

    static {
        bvps bvps = new bvps();
        f157341a = bvps;
        GeneratedMessageLite.m124024a(bvps.class, bvps);
    }

    private bvps() {
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
            return GeneratedMessageLite.m124022a(f157341a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvps();
        }
        if (i2 == 4) {
            return new bxvd(f157341a);
        }
        if (i2 == 5) {
            return f157341a;
        }
        bxxk bxxk = f157342b;
        if (bxxk == null) {
            synchronized (bvps.class) {
                bxxk = f157342b;
                if (bxxk == null) {
                    bxxk = new bxve(f157341a);
                    f157342b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
