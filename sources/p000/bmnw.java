package p000;

/* renamed from: bmnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmnw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmnw f130182d;

    /* renamed from: f */
    private static volatile bxxk f130183f;

    /* renamed from: a */
    public String f130184a = "";

    /* renamed from: b */
    public bxvw f130185b = bxwq.f165002b;

    /* renamed from: c */
    public boolean f130186c;

    /* renamed from: e */
    private int f130187e;

    static {
        bmnw bmnw = new bmnw();
        f130182d = bmnw;
        GeneratedMessageLite.m124024a(bmnw.class, bmnw);
    }

    private bmnw() {
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
            return GeneratedMessageLite.m124022a(f130182d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002%\u0003ဇ\u0001", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bmnw();
        } else {
            if (i2 == 4) {
                return new bxvd(f130182d);
            }
            if (i2 == 5) {
                return f130182d;
            }
            bxxk bxxk = f130183f;
            if (bxxk == null) {
                synchronized (bmnw.class) {
                    bxxk = f130183f;
                    if (bxxk == null) {
                        bxxk = new bxve(f130182d);
                        f130183f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
