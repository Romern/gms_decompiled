package p000;

/* renamed from: bspp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bspp extends bxvg implements bxvh {

    /* renamed from: l */
    public static final bspp f146553l;

    /* renamed from: o */
    private static volatile bxxk f146554o;

    /* renamed from: a */
    public int f146555a;

    /* renamed from: b */
    public int f146556b;

    /* renamed from: c */
    public int f146557c;

    /* renamed from: d */
    public String f146558d = "";

    /* renamed from: e */
    public int f146559e;

    /* renamed from: f */
    public boolean f146560f;

    /* renamed from: g */
    public bsow f146561g;

    /* renamed from: h */
    public bsof f146562h;

    /* renamed from: i */
    public bsov f146563i;

    /* renamed from: j */
    public bsph f146564j;

    /* renamed from: k */
    public bsog f146565k;

    /* renamed from: n */
    private byte f146566n = 2;

    static {
        bspp bspp = new bspp();
        f146553l = bspp;
        GeneratedMessageLite.m124024a(bspp.class, bspp);
    }

    private bspp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f146566n);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f146566n = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f146553l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\tဉ\b\u000bဉ\n\fဉ\u000b", new Object[]{"a", "b", bsmt.m115988b(), "c", bsmq.f145054a, "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new bspp();
        } else {
            if (i2 == 4) {
                return new bxvf(f146553l);
            }
            if (i2 == 5) {
                return f146553l;
            }
            bxxk bxxk = f146554o;
            if (bxxk == null) {
                synchronized (bspp.class) {
                    bxxk = f146554o;
                    if (bxxk == null) {
                        bxxk = new bxve(f146553l);
                        f146554o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
