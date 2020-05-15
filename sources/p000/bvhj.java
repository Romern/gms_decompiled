package p000;

/* renamed from: bvhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvhj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvhj f156075d;

    /* renamed from: e */
    private static volatile bxxk f156076e;

    /* renamed from: a */
    public int f156077a;

    /* renamed from: b */
    public String f156078b = "";

    /* renamed from: c */
    public String f156079c = "";

    static {
        bvhj bvhj = new bvhj();
        f156075d = bvhj;
        GeneratedMessageLite.m124024a(bvhj.class, bvhj);
    }

    private bvhj() {
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
            return GeneratedMessageLite.m124022a(f156075d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvhj();
        } else {
            if (i2 == 4) {
                return new bxvd(f156075d);
            }
            if (i2 == 5) {
                return f156075d;
            }
            bxxk bxxk = f156076e;
            if (bxxk == null) {
                synchronized (bvhj.class) {
                    bxxk = f156076e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156075d);
                        f156076e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
