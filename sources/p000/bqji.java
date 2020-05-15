package p000;

/* renamed from: bqji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqji extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bqji f140954j;

    /* renamed from: k */
    private static volatile bxxk f140955k;

    /* renamed from: a */
    public int f140956a;

    /* renamed from: b */
    public bqjh f140957b;

    /* renamed from: c */
    public int f140958c;

    /* renamed from: d */
    public int f140959d;

    /* renamed from: e */
    public int f140960e;

    /* renamed from: f */
    public String f140961f = "";

    /* renamed from: g */
    public String f140962g = "";

    /* renamed from: h */
    public String f140963h = "";

    /* renamed from: i */
    public String f140964i = "";

    static {
        bqji bqji = new bqji();
        f140954j = bqji;
        bxvk.m124024a(bqji.class, bqji);
    }

    private bqji() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f140954j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0007\tဈ\t", new Object[]{"a", "b", "c", bqkd.f140976a, "d", bqkb.f140975a, "e", bqjs.f140970a, "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bqji();
        } else {
            if (i2 == 4) {
                return new bxvd(f140954j);
            }
            if (i2 == 5) {
                return f140954j;
            }
            bxxk bxxk = f140955k;
            if (bxxk == null) {
                synchronized (bqji.class) {
                    bxxk = f140955k;
                    if (bxxk == null) {
                        bxxk = new bxve(f140954j);
                        f140955k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
