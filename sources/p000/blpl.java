package p000;

/* renamed from: blpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpl extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blpl f127242a;

    /* renamed from: b */
    private static volatile bxxk f127243b;

    static {
        blpl blpl = new blpl();
        f127242a = blpl;
        GeneratedMessageLite.m124024a(blpl.class, blpl);
    }

    private blpl() {
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
            return GeneratedMessageLite.m124022a(f127242a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new blpl();
        }
        if (i2 == 4) {
            return new bxvd(f127242a);
        }
        if (i2 == 5) {
            return f127242a;
        }
        bxxk bxxk = f127243b;
        if (bxxk == null) {
            synchronized (blpl.class) {
                bxxk = f127243b;
                if (bxxk == null) {
                    bxxk = new bxve(f127242a);
                    f127243b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
