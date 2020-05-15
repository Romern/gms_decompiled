package p000;

/* renamed from: aqal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqal extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final aqal f85408d;

    /* renamed from: e */
    private static volatile bxxk f85409e;

    /* renamed from: a */
    public int f85410a;

    /* renamed from: b */
    public String f85411b = "";

    /* renamed from: c */
    public String f85412c = "";

    static {
        aqal aqal = new aqal();
        f85408d = aqal;
        GeneratedMessageLite.m124024a(aqal.class, aqal);
    }

    private aqal() {
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
            return GeneratedMessageLite.m124022a(f85408d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aqal();
        } else {
            if (i2 == 4) {
                return new bxvd(f85408d);
            }
            if (i2 == 5) {
                return f85408d;
            }
            bxxk bxxk = f85409e;
            if (bxxk == null) {
                synchronized (aqal.class) {
                    bxxk = f85409e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85408d);
                        f85409e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
