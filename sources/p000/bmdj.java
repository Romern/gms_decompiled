package p000;

/* renamed from: bmdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmdj extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bmdj f128803l;

    /* renamed from: n */
    private static volatile bxxk f128804n;

    /* renamed from: a */
    public int f128805a;

    /* renamed from: b */
    public int f128806b = 0;

    /* renamed from: c */
    public Object f128807c;

    /* renamed from: d */
    public bmdn f128808d;

    /* renamed from: e */
    public int f128809e;

    /* renamed from: f */
    public bxwc f128810f = bxxn.f165040b;

    /* renamed from: g */
    public bwio f128811g;

    /* renamed from: h */
    public bwio f128812h;

    /* renamed from: i */
    public bmdi f128813i;

    /* renamed from: j */
    public bmdf f128814j;

    /* renamed from: k */
    public boolean f128815k;

    /* renamed from: m */
    private byte f128816m = 2;

    static {
        bmdj bmdj = new bmdj();
        f128803l = bmdj;
        bxvk.m124024a(bmdj.class, bmdj);
    }

    private bmdj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128816m);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128816m = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f128803l, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဌ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဉ\u0003\u0006ᐼ\u0000\bဉ\u0006\tဉ\u0007\nဇ\b\u000bြ\u0000", new Object[]{"c", "b", "a", "d", "e", bmdg.f128797a, "f", bmnw.class, "g", "h", bmeb.class, "i", "j", "k", bmdp.class});
        } else if (i2 == 3) {
            return new bmdj();
        } else {
            if (i2 == 4) {
                return new bxvd(f128803l);
            }
            if (i2 == 5) {
                return f128803l;
            }
            bxxk bxxk = f128804n;
            if (bxxk == null) {
                synchronized (bmdj.class) {
                    bxxk = f128804n;
                    if (bxxk == null) {
                        bxxk = new bxve(f128803l);
                        f128804n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
