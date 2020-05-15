package p000;

/* renamed from: bxhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhj extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bxhj f163405f;

    /* renamed from: g */
    private static volatile bxxk f163406g;

    /* renamed from: a */
    public int f163407a;

    /* renamed from: b */
    public bxwc f163408b = bxxn.f165040b;

    /* renamed from: c */
    public bxhl f163409c;

    /* renamed from: d */
    public int f163410d;

    /* renamed from: e */
    public int f163411e;

    static {
        bxhj bxhj = new bxhj();
        f163405f = bxhj;
        bxvk.m124024a(bxhj.class, bxhj);
    }

    private bxhj() {
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
            return bxvk.m124022a(f163405f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"a", "b", bxhc.class, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bxhj();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f163405f;
            }
            bxxk bxxk = f163406g;
            if (bxxk == null) {
                synchronized (bxhj.class) {
                    bxxk = f163406g;
                    if (bxxk == null) {
                        bxxk = new bxve(f163405f);
                        f163406g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
