package p000;

/* renamed from: btyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btyn extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final btyn f152946g;

    /* renamed from: h */
    private static volatile bxxk f152947h;

    /* renamed from: a */
    public int f152948a;

    /* renamed from: b */
    public int f152949b;

    /* renamed from: c */
    public btyl f152950c;

    /* renamed from: d */
    public int f152951d;

    /* renamed from: e */
    public boolean f152952e;

    /* renamed from: f */
    public boolean f152953f;

    static {
        btyn btyn = new btyn();
        f152946g = btyn;
        GeneratedMessageLite.m124024a(btyn.class, btyn);
    }

    private btyn() {
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
            return GeneratedMessageLite.m124022a(f152946g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဋ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", btym.f152945a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new btyn();
        } else {
            if (i2 == 4) {
                return new bxvd(f152946g);
            }
            if (i2 == 5) {
                return f152946g;
            }
            bxxk bxxk = f152947h;
            if (bxxk == null) {
                synchronized (btyn.class) {
                    bxxk = f152947h;
                    if (bxxk == null) {
                        bxxk = new bxve(f152946g);
                        f152947h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
