package p000;

@Deprecated
/* renamed from: bvsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsm extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvsm f157500a;

    /* renamed from: b */
    private static volatile bxxk f157501b;

    static {
        bvsm bvsm = new bvsm();
        f157500a = bvsm;
        GeneratedMessageLite.m124024a(bvsm.class, bvsm);
    }

    private bvsm() {
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
            return GeneratedMessageLite.m124022a(f157500a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsm();
        }
        if (i2 == 4) {
            return new bxvd(f157500a);
        }
        if (i2 == 5) {
            return f157500a;
        }
        bxxk bxxk = f157501b;
        if (bxxk == null) {
            synchronized (bvsm.class) {
                bxxk = f157501b;
                if (bxxk == null) {
                    bxxk = new bxve(f157500a);
                    f157501b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
