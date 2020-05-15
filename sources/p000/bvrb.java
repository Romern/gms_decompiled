package p000;

/* renamed from: bvrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrb extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvrb f157424a;

    /* renamed from: b */
    private static volatile bxxk f157425b;

    static {
        bvrb bvrb = new bvrb();
        f157424a = bvrb;
        GeneratedMessageLite.m124024a(bvrb.class, bvrb);
    }

    private bvrb() {
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
            return GeneratedMessageLite.m124022a(f157424a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrb();
        }
        if (i2 == 4) {
            return new bxvd(f157424a);
        }
        if (i2 == 5) {
            return f157424a;
        }
        bxxk bxxk = f157425b;
        if (bxxk == null) {
            synchronized (bvrb.class) {
                bxxk = f157425b;
                if (bxxk == null) {
                    bxxk = new bxve(f157424a);
                    f157425b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
