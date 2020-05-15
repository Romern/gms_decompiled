package p000;

/* renamed from: bmhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmhq extends GeneratedMessageLite implements bxxd {

    /* renamed from: n */
    public static final bxvu f129457n = new bmhn();

    /* renamed from: o */
    public static final bmhq f129458o;

    /* renamed from: p */
    private static volatile bxxk f129459p;

    /* renamed from: a */
    public int f129460a;

    /* renamed from: b */
    public String f129461b = "";

    /* renamed from: c */
    public bxwc f129462c = bxxn.f165040b;

    /* renamed from: d */
    public ByteString f129463d = ByteString.f164797b;

    /* renamed from: e */
    public bmnn f129464e;

    /* renamed from: f */
    public int f129465f = -1;

    /* renamed from: g */
    public int f129466g;

    /* renamed from: h */
    public int f129467h;

    /* renamed from: i */
    public int f129468i;

    /* renamed from: j */
    public bxvt f129469j = bxvm.f164965b;

    /* renamed from: k */
    public bxwc f129470k = bxxn.f165040b;

    /* renamed from: l */
    public bmnw f129471l;

    /* renamed from: m */
    public bxvt f129472m = bxvm.f164965b;

    static {
        bmhq bmhq = new bmhq();
        f129458o = bmhq;
        GeneratedMessageLite.m124024a(bmhq.class, bmhq);
    }

    private bmhq() {
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
            return GeneratedMessageLite.m124022a(f129458o, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0004\u0000\u0001\u001b\u0002ည\u0001\u0003ဉ\u0002\u0004င\u0006\u0005'\u0006ဌ\u0005\u0007င\u0004\bင\u0003\t\u001b\n,\u000bဈ\u0000\fဉ\u0007", new Object[]{"a", "c", bmhr.class, "d", "e", "i", "j", "h", bmho.f129456a, "g", "f", "k", bmlv.class, "m", bmfk.m107977b(), "b", "l"});
        } else if (i2 == 3) {
            return new bmhq();
        } else {
            if (i2 == 4) {
                return new bxvd(f129458o);
            }
            if (i2 == 5) {
                return f129458o;
            }
            bxxk bxxk = f129459p;
            if (bxxk == null) {
                synchronized (bmhq.class) {
                    bxxk = f129459p;
                    if (bxxk == null) {
                        bxxk = new bxve(f129458o);
                        f129459p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
