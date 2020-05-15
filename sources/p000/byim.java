package p000;

/* renamed from: byim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byim extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final byim f166574f;

    /* renamed from: h */
    private static volatile bxxk f166575h;

    /* renamed from: a */
    public bygz f166576a;

    /* renamed from: b */
    public String f166577b = "";

    /* renamed from: c */
    public ByteString f166578c = ByteString.f164797b;

    /* renamed from: d */
    public boolean f166579d;

    /* renamed from: e */
    public boolean f166580e;

    /* renamed from: g */
    private int f166581g;

    static {
        byim byim = new byim();
        f166574f = byim;
        GeneratedMessageLite.m124024a(byim.class, byim);
    }

    private byim() {
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
            return GeneratedMessageLite.m124022a(f166574f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0002\u0004ည\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new byim();
        } else {
            if (i2 == 4) {
                return new bxvd(f166574f);
            }
            if (i2 == 5) {
                return f166574f;
            }
            bxxk bxxk = f166575h;
            if (bxxk == null) {
                synchronized (byim.class) {
                    bxxk = f166575h;
                    if (bxxk == null) {
                        bxxk = new bxve(f166574f);
                        f166575h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
