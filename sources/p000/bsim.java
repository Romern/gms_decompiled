package p000;

/* renamed from: bsim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsim extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsim f144733a;

    /* renamed from: b */
    private static volatile bxxk f144734b;

    static {
        bsim bsim = new bsim();
        f144733a = bsim;
        GeneratedMessageLite.m124024a(bsim.class, bsim);
    }

    private bsim() {
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
            return GeneratedMessageLite.m124022a(f144733a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsim();
        }
        if (i2 == 4) {
            return new bxvd(f144733a);
        }
        if (i2 == 5) {
            return f144733a;
        }
        bxxk bxxk = f144734b;
        if (bxxk == null) {
            synchronized (bsim.class) {
                bxxk = f144734b;
                if (bxxk == null) {
                    bxxk = new bxve(f144733a);
                    f144734b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
