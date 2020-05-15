package p000;

/* renamed from: blwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blwm extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final blwm f127956e;

    /* renamed from: f */
    private static volatile bxxk f127957f;

    /* renamed from: a */
    public int f127958a;

    /* renamed from: b */
    public String f127959b = "";

    /* renamed from: c */
    public String f127960c = "";

    /* renamed from: d */
    public bxwc f127961d = bxxn.f165040b;

    static {
        blwm blwm = new blwm();
        f127956e = blwm;
        GeneratedMessageLite.m124024a(blwm.class, blwm);
    }

    private blwm() {
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
            return GeneratedMessageLite.m124022a(f127956e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", blwl.class});
        } else if (i2 == 3) {
            return new blwm();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f127956e;
            }
            bxxk bxxk = f127957f;
            if (bxxk == null) {
                synchronized (blwm.class) {
                    bxxk = f127957f;
                    if (bxxk == null) {
                        bxxk = new bxve(f127956e);
                        f127957f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
