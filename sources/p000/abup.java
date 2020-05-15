package p000;

/* renamed from: abup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abup extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final abup f58444f;

    /* renamed from: g */
    private static volatile bxxk f58445g;

    /* renamed from: a */
    public int f58446a;

    /* renamed from: b */
    public int f58447b;

    /* renamed from: c */
    public int f58448c;

    /* renamed from: d */
    public boolean f58449d;

    /* renamed from: e */
    public String f58450e = "";

    static {
        abup abup = new abup();
        f58444f = abup;
        GeneratedMessageLite.m124024a(abup.class, abup);
    }

    private abup() {
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
            return GeneratedMessageLite.m124022a(f58444f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new abup();
        } else {
            if (i2 == 4) {
                return new bxvd(f58444f);
            }
            if (i2 == 5) {
                return f58444f;
            }
            bxxk bxxk = f58445g;
            if (bxxk == null) {
                synchronized (abup.class) {
                    bxxk = f58445g;
                    if (bxxk == null) {
                        bxxk = new bxve(f58444f);
                        f58445g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
