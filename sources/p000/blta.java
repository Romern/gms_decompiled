package p000;

/* renamed from: blta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blta extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blta f127655d;

    /* renamed from: e */
    private static volatile bxxk f127656e;

    /* renamed from: a */
    public int f127657a;

    /* renamed from: b */
    public int f127658b;

    /* renamed from: c */
    public long f127659c;

    static {
        blta blta = new blta();
        f127655d = blta;
        GeneratedMessageLite.m124024a(blta.class, blta);
    }

    private blta() {
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
            return GeneratedMessageLite.m124022a(f127655d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", blsz.f127654a, "c"});
        } else if (i2 == 3) {
            return new blta();
        } else {
            if (i2 == 4) {
                return new bxvd(f127655d);
            }
            if (i2 == 5) {
                return f127655d;
            }
            bxxk bxxk = f127656e;
            if (bxxk == null) {
                synchronized (blta.class) {
                    bxxk = f127656e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127655d);
                        f127656e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
