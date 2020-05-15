package p000;

/* renamed from: bpyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyv extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bpyv f139942f;

    /* renamed from: g */
    private static volatile bxxk f139943g;

    /* renamed from: a */
    public int f139944a;

    /* renamed from: b */
    public int f139945b;

    /* renamed from: c */
    public int f139946c;

    /* renamed from: d */
    public int f139947d;

    /* renamed from: e */
    public int f139948e;

    static {
        bpyv bpyv = new bpyv();
        f139942f = bpyv;
        bxvk.m124024a(bpyv.class, bpyv);
    }

    private bpyv() {
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
            return bxvk.m124022a(f139942f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpyv();
        } else {
            if (i2 == 4) {
                return new bxvd(f139942f);
            }
            if (i2 == 5) {
                return f139942f;
            }
            bxxk bxxk = f139943g;
            if (bxxk == null) {
                synchronized (bpyv.class) {
                    bxxk = f139943g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139942f);
                        f139943g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
