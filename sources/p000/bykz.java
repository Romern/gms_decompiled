package p000;

/* renamed from: bykz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bykz extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bykz f166792l;

    /* renamed from: m */
    private static volatile bxxk f166793m;

    /* renamed from: a */
    public int f166794a;

    /* renamed from: b */
    public int f166795b;

    /* renamed from: c */
    public int f166796c;

    /* renamed from: d */
    public boolean f166797d;

    /* renamed from: e */
    public bxwc f166798e = bxxn.f165040b;

    /* renamed from: f */
    public int f166799f = 3;

    /* renamed from: g */
    public boolean f166800g;

    /* renamed from: h */
    public bykl f166801h;

    /* renamed from: i */
    public byks f166802i;

    /* renamed from: j */
    public int f166803j;

    /* renamed from: k */
    public int f166804k;

    static {
        bykz bykz = new bykz();
        f166792l = bykz;
        bxvk.m124024a(bykz.class, bykz);
    }

    private bykz() {
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
            return bxvk.m124022a(f166792l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004\u001a\u0005ဌ\u0003\u0006ဇ\u0004\u0007ဉ\u0005\bဉ\u0006\tဌ\u0007\nဌ\b", new Object[]{"a", "b", bykv.f166790a, "c", bykt.f166789a, "d", "e", "f", bykx.f166791a, "g", "h", "i", "j", bykv.f166790a, "k", bykt.f166789a});
        } else if (i2 == 3) {
            return new bykz();
        } else {
            if (i2 == 4) {
                return new bxvd(f166792l);
            }
            if (i2 == 5) {
                return f166792l;
            }
            bxxk bxxk = f166793m;
            if (bxxk == null) {
                synchronized (bykz.class) {
                    bxxk = f166793m;
                    if (bxxk == null) {
                        bxxk = new bxve(f166792l);
                        f166793m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
