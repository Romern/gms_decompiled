package p000;

/* renamed from: bubq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bubq extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bubq f153257h;

    /* renamed from: i */
    private static volatile bxxk f153258i;

    /* renamed from: a */
    public int f153259a;

    /* renamed from: b */
    public bxvt f153260b = bxvm.f164965b;

    /* renamed from: c */
    public boolean f153261c;

    /* renamed from: d */
    public int f153262d = 1;

    /* renamed from: e */
    public buck f153263e;

    /* renamed from: f */
    public long f153264f;

    /* renamed from: g */
    public int f153265g = 10;

    static {
        bubq bubq = new bubq();
        f153257h = bubq;
        GeneratedMessageLite.m124024a(bubq.class, bubq);
    }

    private bubq() {
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
            return GeneratedMessageLite.m124022a(f153257h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001e\u0002ဇ\u0000\u0003ဌ\u0001\u0004ဉ\u0002\u0005ဃ\u0003\u0006ဋ\u0004", new Object[]{"a", "b", bucq.m119333b(), "c", "d", bubp.f153256a, "e", "f", "g"});
        } else if (i2 == 3) {
            return new bubq();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f153257h;
            }
            bxxk bxxk = f153258i;
            if (bxxk == null) {
                synchronized (bubq.class) {
                    bxxk = f153258i;
                    if (bxxk == null) {
                        bxxk = new bxve(f153257h);
                        f153258i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
