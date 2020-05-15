package p000;

/* renamed from: bldt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bldt f126126d;

    /* renamed from: e */
    private static volatile bxxk f126127e;

    /* renamed from: a */
    public int f126128a;

    /* renamed from: b */
    public int f126129b;

    /* renamed from: c */
    public blfg f126130c;

    static {
        bldt bldt = new bldt();
        f126126d = bldt;
        GeneratedMessageLite.m124024a(bldt.class, bldt);
    }

    private bldt() {
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
            return GeneratedMessageLite.m124022a(f126126d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0004ဉ\u0003", new Object[]{"a", "b", bldm.f126106a, "c"});
        } else if (i2 == 3) {
            return new bldt();
        } else {
            if (i2 == 4) {
                return new bxvd(f126126d);
            }
            if (i2 == 5) {
                return f126126d;
            }
            bxxk bxxk = f126127e;
            if (bxxk == null) {
                synchronized (bldt.class) {
                    bxxk = f126127e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126126d);
                        f126127e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
