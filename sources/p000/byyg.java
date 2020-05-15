package p000;

/* renamed from: byyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyg extends bxvg implements bxvh {

    /* renamed from: p */
    public static final byyg f168916p;

    /* renamed from: r */
    private static volatile bxxk f168917r;

    /* renamed from: a */
    public int f168918a;

    /* renamed from: b */
    public String f168919b = "";

    /* renamed from: c */
    public byyh f168920c;

    /* renamed from: d */
    public byyl f168921d;

    /* renamed from: e */
    public byyc f168922e;

    /* renamed from: f */
    public byxv f168923f;

    /* renamed from: g */
    public byyb f168924g;

    /* renamed from: h */
    public byya f168925h;

    /* renamed from: i */
    public byym f168926i;

    /* renamed from: j */
    public byyk f168927j;

    /* renamed from: k */
    public byyd f168928k;

    /* renamed from: l */
    public byxx f168929l;

    /* renamed from: n */
    public byyf f168930n;

    /* renamed from: o */
    public byyj f168931o;

    /* renamed from: q */
    private byte f168932q = 2;

    static {
        byyg byyg = new byyg();
        f168916p = byyg;
        GeneratedMessageLite.m124024a(byyg.class, byyg);
    }

    private byyg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168932q);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168932q = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f168916p, "\u0001\r\u0000\u0001\u0003\u0011\r\u0000\u0000\u0006\u0003ဈ\u0000\u0004ᐉ\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ဉ\u0004\bᐉ\u0005\tᐉ\u0006\u000bဉ\u0007\rဉ\b\u000eᐉ\t\u000fဉ\n\u0010ဉ\u000b\u0011ဉ\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "n", "o"});
        } else if (i2 == 3) {
            return new byyg();
        } else {
            if (i2 == 4) {
                return new bxvf(f168916p);
            }
            if (i2 == 5) {
                return f168916p;
            }
            bxxk bxxk = f168917r;
            if (bxxk == null) {
                synchronized (byyg.class) {
                    bxxk = f168917r;
                    if (bxxk == null) {
                        bxxk = new bxve(f168916p);
                        f168917r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
