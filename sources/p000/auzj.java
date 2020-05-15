package p000;

/* renamed from: auzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auzj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final auzj f92827d;

    /* renamed from: e */
    private static volatile bxxk f92828e;

    /* renamed from: a */
    public int f92829a;

    /* renamed from: b */
    public bxpe f92830b;

    /* renamed from: c */
    public long f92831c;

    static {
        auzj auzj = new auzj();
        f92827d = auzj;
        bxvk.m124024a(auzj.class, auzj);
    }

    private auzj() {
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
            return bxvk.m124022a(f92827d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new auzj();
        } else {
            if (i2 == 4) {
                return new bxvd(f92827d);
            }
            if (i2 == 5) {
                return f92827d;
            }
            bxxk bxxk = f92828e;
            if (bxxk == null) {
                synchronized (auzj.class) {
                    bxxk = f92828e;
                    if (bxxk == null) {
                        bxxk = new bxve(f92827d);
                        f92828e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
