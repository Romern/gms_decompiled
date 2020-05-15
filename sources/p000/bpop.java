package p000;

/* renamed from: bpop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpop extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bpop f138552h;

    /* renamed from: i */
    private static volatile bxxk f138553i;

    /* renamed from: a */
    public int f138554a;

    /* renamed from: b */
    public int f138555b;

    /* renamed from: c */
    public bpom f138556c;

    /* renamed from: d */
    public bpom f138557d;

    /* renamed from: e */
    public int f138558e;

    /* renamed from: f */
    public bpoq f138559f;

    /* renamed from: g */
    public bpny f138560g;

    static {
        bpop bpop = new bpop();
        f138552h = bpop;
        bxvk.m124024a(bpop.class, bpop);
    }

    private bpop() {
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
            return bxvk.m124022a(f138552h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", bpon.f138550a, "c", "d", "e", bpoo.f138551a, "f", "g"});
        } else if (i2 == 3) {
            return new bpop();
        } else {
            if (i2 == 4) {
                return new bxvd(f138552h);
            }
            if (i2 == 5) {
                return f138552h;
            }
            bxxk bxxk = f138553i;
            if (bxxk == null) {
                synchronized (bpop.class) {
                    bxxk = f138553i;
                    if (bxxk == null) {
                        bxxk = new bxve(f138552h);
                        f138553i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
