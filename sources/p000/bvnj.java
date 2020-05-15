package p000;

/* renamed from: bvnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvnj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvnj f156867d;

    /* renamed from: e */
    private static volatile bxxk f156868e;

    /* renamed from: a */
    public int f156869a;

    /* renamed from: b */
    public int f156870b;

    /* renamed from: c */
    public int f156871c;

    static {
        bvnj bvnj = new bvnj();
        f156867d = bvnj;
        GeneratedMessageLite.m124024a(bvnj.class, bvnj);
    }

    private bvnj() {
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
            return GeneratedMessageLite.m124022a(f156867d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvnj();
        } else {
            if (i2 == 4) {
                return new bxvd(f156867d);
            }
            if (i2 == 5) {
                return f156867d;
            }
            bxxk bxxk = f156868e;
            if (bxxk == null) {
                synchronized (bvnj.class) {
                    bxxk = f156868e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156867d);
                        f156868e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
