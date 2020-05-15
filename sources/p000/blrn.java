package p000;

/* renamed from: blrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blrn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blrn f127488c;

    /* renamed from: d */
    private static volatile bxxk f127489d;

    /* renamed from: a */
    public int f127490a;

    /* renamed from: b */
    public int f127491b = 16;

    static {
        blrn blrn = new blrn();
        f127488c = blrn;
        GeneratedMessageLite.m124024a(blrn.class, blrn);
    }

    private blrn() {
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
            return GeneratedMessageLite.m124022a(f127488c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", blrl.f127487a});
        } else if (i2 == 3) {
            return new blrn();
        } else {
            if (i2 == 4) {
                return new bxvd(f127488c);
            }
            if (i2 == 5) {
                return f127488c;
            }
            bxxk bxxk = f127489d;
            if (bxxk == null) {
                synchronized (blrn.class) {
                    bxxk = f127489d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127488c);
                        f127489d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
