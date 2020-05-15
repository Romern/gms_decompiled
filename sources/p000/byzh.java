package p000;

/* renamed from: byzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byzh f169078d;

    /* renamed from: e */
    private static volatile bxxk f169079e;

    /* renamed from: a */
    public int f169080a;

    /* renamed from: b */
    public String f169081b = "";

    /* renamed from: c */
    public String f169082c = "";

    static {
        byzh byzh = new byzh();
        f169078d = byzh;
        GeneratedMessageLite.m124024a(byzh.class, byzh);
    }

    private byzh() {
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
            return GeneratedMessageLite.m124022a(f169078d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byzh();
        } else {
            if (i2 == 4) {
                return new bxvd(f169078d);
            }
            if (i2 == 5) {
                return f169078d;
            }
            bxxk bxxk = f169079e;
            if (bxxk == null) {
                synchronized (byzh.class) {
                    bxxk = f169079e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169078d);
                        f169079e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
