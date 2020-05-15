package p000;

/* renamed from: bvsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsv extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvsv f157531a;

    /* renamed from: b */
    private static volatile bxxk f157532b;

    static {
        bvsv bvsv = new bvsv();
        f157531a = bvsv;
        GeneratedMessageLite.m124024a(bvsv.class, bvsv);
    }

    private bvsv() {
        bxwq bxwq = bxwq.f165002b;
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
            return GeneratedMessageLite.m124022a(f157531a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsv();
        }
        if (i2 == 4) {
            return new bxvd(f157531a);
        }
        if (i2 == 5) {
            return f157531a;
        }
        bxxk bxxk = f157532b;
        if (bxxk == null) {
            synchronized (bvsv.class) {
                bxxk = f157532b;
                if (bxxk == null) {
                    bxxk = new bxve(f157531a);
                    f157532b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
