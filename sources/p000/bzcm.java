package p000;

/* renamed from: bzcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzcm extends bxvg implements bxvh {

    /* renamed from: d */
    public static final bzcm f169369d;

    /* renamed from: f */
    private static volatile bxxk f169370f;

    /* renamed from: a */
    public int f169371a;

    /* renamed from: b */
    public byzq f169372b;

    /* renamed from: c */
    public byyg f169373c;

    /* renamed from: e */
    private byte f169374e = 2;

    static {
        bzcm bzcm = new bzcm();
        f169369d = bzcm;
        bxvk.m124024a(bzcm.class, bzcm);
    }

    private bzcm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169374e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169374e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169369d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0001\u0003ဉ\u0001\u0004ᐉ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzcm();
        } else {
            if (i2 == 4) {
                return new bxvf(f169369d);
            }
            if (i2 == 5) {
                return f169369d;
            }
            bxxk bxxk = f169370f;
            if (bxxk == null) {
                synchronized (bzcm.class) {
                    bxxk = f169370f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169369d);
                        f169370f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
