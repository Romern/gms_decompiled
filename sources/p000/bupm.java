package p000;

/* renamed from: bupm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupm extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bupm f154651d;

    /* renamed from: e */
    private static volatile bxxk f154652e;

    /* renamed from: a */
    public String f154653a = "";

    /* renamed from: b */
    public String f154654b = "";

    /* renamed from: c */
    public String f154655c = "";

    static {
        bupm bupm = new bupm();
        f154651d = bupm;
        GeneratedMessageLite.m124024a(bupm.class, bupm);
    }

    private bupm() {
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
            return GeneratedMessageLite.m124022a(f154651d, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bupm();
        } else {
            if (i2 == 4) {
                return new bxvd(f154651d);
            }
            if (i2 == 5) {
                return f154651d;
            }
            bxxk bxxk = f154652e;
            if (bxxk == null) {
                synchronized (bupm.class) {
                    bxxk = f154652e;
                    if (bxxk == null) {
                        bxxk = new bxve(f154651d);
                        f154652e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
