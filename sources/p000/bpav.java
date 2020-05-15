package p000;

/* renamed from: bpav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpav extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpav f135548f;

    /* renamed from: g */
    private static volatile bxxk f135549g;

    /* renamed from: a */
    public int f135550a;

    /* renamed from: b */
    public boolean f135551b;

    /* renamed from: c */
    public int f135552c;

    /* renamed from: d */
    public boolean f135553d;

    /* renamed from: e */
    public boolean f135554e;

    static {
        bpav bpav = new bpav();
        f135548f = bpav;
        GeneratedMessageLite.m124024a(bpav.class, bpav);
    }

    private bpav() {
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
            return GeneratedMessageLite.m124022a(f135548f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", bpap.f135524a, "d", "e"});
        } else if (i2 == 3) {
            return new bpav();
        } else {
            if (i2 == 4) {
                return new bxvd(f135548f);
            }
            if (i2 == 5) {
                return f135548f;
            }
            bxxk bxxk = f135549g;
            if (bxxk == null) {
                synchronized (bpav.class) {
                    bxxk = f135549g;
                    if (bxxk == null) {
                        bxxk = new bxve(f135548f);
                        f135549g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
