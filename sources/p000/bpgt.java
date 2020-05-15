package p000;

/* renamed from: bpgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpgt f137561e;

    /* renamed from: f */
    private static volatile bxxk f137562f;

    /* renamed from: a */
    public int f137563a;

    /* renamed from: b */
    public int f137564b;

    /* renamed from: c */
    public int f137565c;

    /* renamed from: d */
    public int f137566d;

    static {
        bpgt bpgt = new bpgt();
        f137561e = bpgt;
        bxvk.m124024a(bpgt.class, bpgt);
    }

    private bpgt() {
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
            return bxvk.m124022a(f137561e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", bzzv.m126374b(), "c", "d"});
        } else if (i2 == 3) {
            return new bpgt();
        } else {
            if (i2 == 4) {
                return new bxvd(f137561e);
            }
            if (i2 == 5) {
                return f137561e;
            }
            bxxk bxxk = f137562f;
            if (bxxk == null) {
                synchronized (bpgt.class) {
                    bxxk = f137562f;
                    if (bxxk == null) {
                        bxxk = new bxve(f137561e);
                        f137562f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
