package p000;

/* renamed from: byjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byjb extends bxvk implements bxxd {

    /* renamed from: h */
    public static final byjb f166629h;

    /* renamed from: i */
    private static volatile bxxk f166630i;

    /* renamed from: a */
    public int f166631a;

    /* renamed from: b */
    public byjh f166632b;

    /* renamed from: c */
    public bygx f166633c;

    /* renamed from: d */
    public bygz f166634d;

    /* renamed from: e */
    public long f166635e = -1;

    /* renamed from: f */
    public int f166636f = -1;

    /* renamed from: g */
    public long f166637g = -1;

    static {
        byjb byjb = new byjb();
        f166629h = byjb;
        bxvk.m124024a(byjb.class, byjb);
    }

    private byjb() {
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
            return bxvk.m124022a(f166629h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဂ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new byjb();
        } else {
            if (i2 == 4) {
                return new bxvd(f166629h);
            }
            if (i2 == 5) {
                return f166629h;
            }
            bxxk bxxk = f166630i;
            if (bxxk == null) {
                synchronized (byjb.class) {
                    bxxk = f166630i;
                    if (bxxk == null) {
                        bxxk = new bxve(f166629h);
                        f166630i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
