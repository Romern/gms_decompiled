package p000;

/* renamed from: bzyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzyj f171880d;

    /* renamed from: e */
    private static volatile bxxk f171881e;

    /* renamed from: a */
    public long f171882a;

    /* renamed from: b */
    public String f171883b = "";

    /* renamed from: c */
    public String f171884c = "";

    static {
        bzyj bzyj = new bzyj();
        f171880d = bzyj;
        bxvk.m124024a(bzyj.class, bzyj);
    }

    private bzyj() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f171880d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzyj();
        } else {
            if (i2 == 4) {
                return new bxvd(f171880d);
            }
            if (i2 == 5) {
                return f171880d;
            }
            bxxk bxxk = f171881e;
            if (bxxk == null) {
                synchronized (bzyj.class) {
                    bxxk = f171881e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171880d);
                        f171881e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
