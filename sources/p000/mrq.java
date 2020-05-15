package p000;

/* renamed from: mrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mrq extends bxvk implements bxxd {

    /* renamed from: h */
    public static final mrq f34472h;

    /* renamed from: i */
    private static volatile bxxk f34473i;

    /* renamed from: a */
    public int f34474a;

    /* renamed from: b */
    public boolean f34475b;

    /* renamed from: c */
    public boolean f34476c;

    /* renamed from: d */
    public boolean f34477d;

    /* renamed from: e */
    public boolean f34478e;

    /* renamed from: f */
    public long f34479f;

    /* renamed from: g */
    public boolean f34480g;

    static {
        mrq mrq = new mrq();
        f34472h = mrq;
        bxvk.m124024a(mrq.class, mrq);
    }

    private mrq() {
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
            return bxvk.m124022a(f34472h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new mrq();
        } else {
            if (i2 == 4) {
                return new bxvd(f34472h);
            }
            if (i2 == 5) {
                return f34472h;
            }
            bxxk bxxk = f34473i;
            if (bxxk == null) {
                synchronized (mrq.class) {
                    bxxk = f34473i;
                    if (bxxk == null) {
                        bxxk = new bxve(f34472h);
                        f34473i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
