package p000;

/* renamed from: bxru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxru extends bxvk implements bxxd {

    /* renamed from: n */
    public static final bxru f164610n;

    /* renamed from: o */
    private static volatile bxxk f164611o;

    /* renamed from: a */
    public int f164612a;

    /* renamed from: b */
    public bxrf f164613b;

    /* renamed from: c */
    public bxtx f164614c = bxtx.f164797b;

    /* renamed from: d */
    public bxsc f164615d;

    /* renamed from: e */
    public bxsk f164616e;

    /* renamed from: f */
    public bxsk f164617f;

    /* renamed from: g */
    public bxsk f164618g;

    /* renamed from: h */
    public bxsk f164619h;

    /* renamed from: i */
    public bxwc f164620i = bxxn.f165040b;

    /* renamed from: j */
    public bxwc f164621j = bxxn.f165040b;

    /* renamed from: k */
    public bxsk f164622k;

    /* renamed from: l */
    public bxrg f164623l;

    /* renamed from: m */
    public bxrg f164624m;

    static {
        bxru bxru = new bxru();
        f164610n = bxru;
        bxvk.m124024a(bxru.class, bxru);
    }

    private bxru() {
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
            return bxvk.m124022a(f164610n, "\u0001\f\u0000\u0001\u0001\u0011\f\u0000\u0002\u0000\u0001ည\u0001\u0004ဉ\u0004\u0005ဉ\u0007\u0006ဉ\b\u0007ဉ\t\b\u001b\t\u001b\nဉ\n\u000bဉ\u000b\fဉ\f\u000fဉ\u0000\u0011ဉ\u0006", new Object[]{"a", "c", "d", "f", "g", "h", "i", bxsj.class, "j", bxsk.class, "k", "l", "m", "b", "e"});
        } else if (i2 == 3) {
            return new bxru();
        } else {
            if (i2 == 4) {
                return new bxvd(f164610n);
            }
            if (i2 == 5) {
                return f164610n;
            }
            bxxk bxxk = f164611o;
            if (bxxk == null) {
                synchronized (bxru.class) {
                    bxxk = f164611o;
                    if (bxxk == null) {
                        bxxk = new bxve(f164610n);
                        f164611o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
