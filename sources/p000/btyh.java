package p000;

/* renamed from: btyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btyh extends bxvk implements bxxd {

    /* renamed from: t */
    public static final btyh f152908t;

    /* renamed from: u */
    private static volatile bxxk f152909u;

    /* renamed from: a */
    public int f152910a;

    /* renamed from: b */
    public float f152911b;

    /* renamed from: c */
    public long f152912c;

    /* renamed from: d */
    public bxwc f152913d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f152914e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f152915f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f152916g = bxxn.f165040b;

    /* renamed from: h */
    public float f152917h;

    /* renamed from: i */
    public float f152918i;

    /* renamed from: j */
    public bxwc f152919j = bxxn.f165040b;

    /* renamed from: k */
    public bxwc f152920k = bxxn.f165040b;

    /* renamed from: l */
    public float f152921l;

    /* renamed from: m */
    public boolean f152922m;

    /* renamed from: n */
    public int f152923n;

    /* renamed from: o */
    public bxwc f152924o = bxxn.f165040b;

    /* renamed from: p */
    public boolean f152925p;

    /* renamed from: q */
    public long f152926q;

    /* renamed from: r */
    public boolean f152927r;

    /* renamed from: s */
    public boolean f152928s;

    static {
        btyh btyh = new btyh();
        f152908t = btyh;
        bxvk.m124024a(btyh.class, btyh);
    }

    private btyh() {
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
            return bxvk.m124022a(f152908t, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0007\u0000\u0001ခ\u0000\u0002ဃ\u0001\u0003\u001b\u0004\u001b\u0005ခ\u0002\u0006ခ\u0003\u0007\u001b\b\u001b\tခ\u0004\nဇ\u0005\u000bင\u0006\f\u001b\rဇ\u0007\u000eဃ\b\u000f\u001b\u0010\u001b\u0011ဇ\t\u0012ဇ\n", new Object[]{"a", "b", "c", "d", btyq.class, "g", btyo.class, "h", "i", "j", btyf.class, "k", btyf.class, "l", "m", "n", "o", btyg.class, "p", "q", "e", btyq.class, "f", btyq.class, "r", "s"});
        } else if (i2 == 3) {
            return new btyh();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f152908t;
            }
            bxxk bxxk = f152909u;
            if (bxxk == null) {
                synchronized (btyh.class) {
                    bxxk = f152909u;
                    if (bxxk == null) {
                        bxxk = new bxve(f152908t);
                        f152909u = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
