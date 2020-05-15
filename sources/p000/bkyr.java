package p000;

/* renamed from: bkyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkyr extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bkyr f125477i;

    /* renamed from: j */
    private static volatile bxxk f125478j;

    /* renamed from: a */
    public int f125479a;

    /* renamed from: b */
    public int f125480b;

    /* renamed from: c */
    public int f125481c;

    /* renamed from: d */
    public int f125482d;

    /* renamed from: e */
    public int f125483e;

    /* renamed from: f */
    public int f125484f;

    /* renamed from: g */
    public int f125485g;

    /* renamed from: h */
    public int f125486h;

    static {
        bkyr bkyr = new bkyr();
        f125477i = bkyr;
        GeneratedMessageLite.m124024a(bkyr.class, bkyr);
    }

    private bkyr() {
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
            return GeneratedMessageLite.m124022a(f125477i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဌ\u0003\u0005ဋ\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"a", "b", bkye.f125457a, "c", "d", "e", bkzu.f125702a, "f", "g", blap.f125780a, "h", blan.f125779a});
        } else if (i2 == 3) {
            return new bkyr();
        } else {
            if (i2 == 4) {
                return new bxvd(f125477i);
            }
            if (i2 == 5) {
                return f125477i;
            }
            bxxk bxxk = f125478j;
            if (bxxk == null) {
                synchronized (bkyr.class) {
                    bxxk = f125478j;
                    if (bxxk == null) {
                        bxxk = new bxve(f125477i);
                        f125478j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
