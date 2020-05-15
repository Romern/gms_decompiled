package p000;

/* renamed from: blbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blbt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blbt f125862d;

    /* renamed from: e */
    private static volatile bxxk f125863e;

    /* renamed from: a */
    public int f125864a;

    /* renamed from: b */
    public String f125865b = "";

    /* renamed from: c */
    public int f125866c;

    static {
        blbt blbt = new blbt();
        f125862d = blbt;
        GeneratedMessageLite.m124024a(blbt.class, blbt);
    }

    private blbt() {
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
            return GeneratedMessageLite.m124022a(f125862d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blbt();
        } else {
            if (i2 == 4) {
                return new bxvd(f125862d);
            }
            if (i2 == 5) {
                return f125862d;
            }
            bxxk bxxk = f125863e;
            if (bxxk == null) {
                synchronized (blbt.class) {
                    bxxk = f125863e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125862d);
                        f125863e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
