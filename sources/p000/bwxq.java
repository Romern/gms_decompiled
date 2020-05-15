package p000;

/* renamed from: bwxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwxq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxvu f161400d = new bwxp();

    /* renamed from: f */
    public static final bwxq f161401f;

    /* renamed from: g */
    private static volatile bxxk f161402g;

    /* renamed from: a */
    public int f161403a;

    /* renamed from: b */
    public bxwc f161404b = bxxn.f165040b;

    /* renamed from: c */
    public bxvt f161405c = bxvm.f164965b;

    /* renamed from: e */
    public bwxv f161406e;

    static {
        bwxq bwxq = new bwxq();
        f161401f = bwxq;
        bxvk.m124024a(bwxq.class, bwxq);
    }

    private bwxq() {
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
            return bxvk.m124022a(f161401f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002,\u0003ဉ\u0000", new Object[]{"a", "b", bwww.class, "c", bwxu.m122414b(), "e"});
        } else if (i2 == 3) {
            return new bwxq();
        } else {
            if (i2 == 4) {
                return new bxvd(f161401f);
            }
            if (i2 == 5) {
                return f161401f;
            }
            bxxk bxxk = f161402g;
            if (bxxk == null) {
                synchronized (bwxq.class) {
                    bxxk = f161402g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161401f);
                        f161402g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
