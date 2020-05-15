package p000;

/* renamed from: cabo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabo extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cabo f172459e;

    /* renamed from: f */
    private static volatile bxxk f172460f;

    /* renamed from: a */
    public int f172461a;

    /* renamed from: b */
    public String f172462b = "";

    /* renamed from: c */
    public String f172463c = "";

    /* renamed from: d */
    public caae f172464d;

    static {
        cabo cabo = new cabo();
        f172459e = cabo;
        GeneratedMessageLite.m124024a(cabo.class, cabo);
    }

    private cabo() {
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
            return GeneratedMessageLite.m124022a(f172459e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0002\u0004ဈ\u0001", new Object[]{"a", "b", "d", "c"});
        } else if (i2 == 3) {
            return new cabo();
        } else {
            if (i2 == 4) {
                return new bxvd(f172459e);
            }
            if (i2 == 5) {
                return f172459e;
            }
            bxxk bxxk = f172460f;
            if (bxxk == null) {
                synchronized (cabo.class) {
                    bxxk = f172460f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172459e);
                        f172460f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
