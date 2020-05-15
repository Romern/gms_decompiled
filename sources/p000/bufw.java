package p000;

/* renamed from: bufw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bufw extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bufw f153755a;

    /* renamed from: b */
    private static volatile bxxk f153756b;

    static {
        bufw bufw = new bufw();
        f153755a = bufw;
        GeneratedMessageLite.m124024a(bufw.class, bufw);
    }

    private bufw() {
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
            return GeneratedMessageLite.m124022a(f153755a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bufw();
        }
        if (i2 == 4) {
            return new bxvd(f153755a);
        }
        if (i2 == 5) {
            return f153755a;
        }
        bxxk bxxk = f153756b;
        if (bxxk == null) {
            synchronized (bufw.class) {
                bxxk = f153756b;
                if (bxxk == null) {
                    bxxk = new bxve(f153755a);
                    f153756b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
