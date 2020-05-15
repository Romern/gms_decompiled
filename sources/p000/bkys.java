package p000;

/* renamed from: bkys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkys extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bkys f125487g;

    /* renamed from: h */
    private static volatile bxxk f125488h;

    /* renamed from: a */
    public int f125489a;

    /* renamed from: b */
    public int f125490b;

    /* renamed from: c */
    public int f125491c;

    /* renamed from: d */
    public bxvt f125492d = bxvm.f164965b;

    /* renamed from: e */
    public int f125493e;

    /* renamed from: f */
    public int f125494f;

    static {
        bkys bkys = new bkys();
        f125487g = bkys;
        GeneratedMessageLite.m124024a(bkys.class, bkys);
    }

    private bkys() {
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
            return GeneratedMessageLite.m124022a(f125487g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003\u001e\u0004ဌ\u0002\u0005ဋ\u0003", new Object[]{"a", "b", bkyi.f125461a, "c", "d", bkyc.m106888b(), "e", bkyh.f125460a, "f"});
        } else if (i2 == 3) {
            return new bkys();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f125487g;
            }
            bxxk bxxk = f125488h;
            if (bxxk == null) {
                synchronized (bkys.class) {
                    bxxk = f125488h;
                    if (bxxk == null) {
                        bxxk = new bxve(f125487g);
                        f125488h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
