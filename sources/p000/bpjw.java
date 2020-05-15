package p000;

/* renamed from: bpjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpjw extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bpjw f137917j;

    /* renamed from: k */
    private static volatile bxxk f137918k;

    /* renamed from: a */
    public int f137919a;

    /* renamed from: b */
    public int f137920b;

    /* renamed from: c */
    public int f137921c;

    /* renamed from: d */
    public int f137922d;

    /* renamed from: e */
    public String f137923e = "";

    /* renamed from: f */
    public bpjq f137924f;

    /* renamed from: g */
    public bpjv f137925g;

    /* renamed from: h */
    public bpjp f137926h;

    /* renamed from: i */
    public bpjr f137927i;

    static {
        bpjw bpjw = new bpjw();
        f137917j = bpjw;
        bxvk.m124024a(bpjw.class, bpjw);
    }

    private bpjw() {
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
            return bxvk.m124022a(f137917j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0003\u0004ဈ\u0004\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bဉ\t", new Object[]{"a", "b", bpjs.f137911a, "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bpjw();
        } else {
            if (i2 == 4) {
                return new bxvd(f137917j);
            }
            if (i2 == 5) {
                return f137917j;
            }
            bxxk bxxk = f137918k;
            if (bxxk == null) {
                synchronized (bpjw.class) {
                    bxxk = f137918k;
                    if (bxxk == null) {
                        bxxk = new bxve(f137917j);
                        f137918k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
