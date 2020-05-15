package p000;

/* renamed from: ajnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajnx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final ajnx f71031d;

    /* renamed from: e */
    private static volatile bxxk f71032e;

    /* renamed from: a */
    public int f71033a;

    /* renamed from: b */
    public String f71034b = "";

    /* renamed from: c */
    public boolean f71035c;

    static {
        ajnx ajnx = new ajnx();
        f71031d = ajnx;
        GeneratedMessageLite.m124024a(ajnx.class, ajnx);
    }

    private ajnx() {
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
            return GeneratedMessageLite.m124022a(f71031d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ajnx();
        } else {
            if (i2 == 4) {
                return new bxvd(f71031d);
            }
            if (i2 == 5) {
                return f71031d;
            }
            bxxk bxxk = f71032e;
            if (bxxk == null) {
                synchronized (ajnx.class) {
                    bxxk = f71032e;
                    if (bxxk == null) {
                        bxxk = new bxve(f71031d);
                        f71032e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
