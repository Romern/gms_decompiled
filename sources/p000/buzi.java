package p000;

/* renamed from: buzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buzi extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final buzi f155382d;

    /* renamed from: e */
    private static volatile bxxk f155383e;

    /* renamed from: a */
    public int f155384a;

    /* renamed from: b */
    public String f155385b = "";

    /* renamed from: c */
    public int f155386c;

    static {
        buzi buzi = new buzi();
        f155382d = buzi;
        GeneratedMessageLite.m124024a(buzi.class, buzi);
    }

    private buzi() {
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
            return GeneratedMessageLite.m124022a(f155382d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new buzi();
        } else {
            if (i2 == 4) {
                return new bxvd(f155382d);
            }
            if (i2 == 5) {
                return f155382d;
            }
            bxxk bxxk = f155383e;
            if (bxxk == null) {
                synchronized (buzi.class) {
                    bxxk = f155383e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155382d);
                        f155383e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
