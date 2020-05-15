package p000;

/* renamed from: bymq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymq extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bymq f167050h;

    /* renamed from: i */
    private static volatile bxxk f167051i;

    /* renamed from: a */
    public int f167052a;

    /* renamed from: b */
    public boolean f167053b;

    /* renamed from: c */
    public boolean f167054c;

    /* renamed from: d */
    public boolean f167055d;

    /* renamed from: e */
    public boolean f167056e;

    /* renamed from: f */
    public int f167057f;

    /* renamed from: g */
    public bymp f167058g;

    static {
        bymq bymq = new bymq();
        f167050h = bymq;
        bxvk.m124024a(bymq.class, bymq);
    }

    private bymq() {
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
            return bxvk.m124022a(f167050h, "\u0001\u0006\u0000\u0001\u0002d\u0006\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005dဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bymq();
        } else {
            if (i2 == 4) {
                return new bxvd(f167050h);
            }
            if (i2 == 5) {
                return f167050h;
            }
            bxxk bxxk = f167051i;
            if (bxxk == null) {
                synchronized (bymq.class) {
                    bxxk = f167051i;
                    if (bxxk == null) {
                        bxxk = new bxve(f167050h);
                        f167051i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
