package p000;

/* renamed from: bitx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bitx extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bitx f121733g;

    /* renamed from: j */
    private static volatile bxxk f121734j;

    /* renamed from: a */
    public boolean f121735a;

    /* renamed from: b */
    public boolean f121736b;

    /* renamed from: c */
    public int f121737c;

    /* renamed from: d */
    public bity f121738d;

    /* renamed from: e */
    public bxwc f121739e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f121740f = bxxn.f165040b;

    /* renamed from: h */
    private int f121741h;

    /* renamed from: i */
    private byte f121742i = 2;

    static {
        bitx bitx = new bitx();
        f121733g = bitx;
        bxvk.m124024a(bitx.class, bitx);
    }

    private bitx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121742i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121742i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121733g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0005\u0001ᔇ\u0000\u0002ဇ\u0001\u0003ᔄ\u0002\u0004ᔉ\u0003\u0005Л\u0006Л", new Object[]{"h", "a", "b", "c", "d", "e", bity.class, "f", bivj.class});
        } else if (i2 == 3) {
            return new bitx();
        } else {
            if (i2 == 4) {
                return new bxvd(f121733g);
            }
            if (i2 == 5) {
                return f121733g;
            }
            bxxk bxxk = f121734j;
            if (bxxk == null) {
                synchronized (bitx.class) {
                    bxxk = f121734j;
                    if (bxxk == null) {
                        bxxk = new bxve(f121733g);
                        f121734j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
