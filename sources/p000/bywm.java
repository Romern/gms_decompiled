package p000;

/* renamed from: bywm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywm extends GeneratedMessageLite implements bxxd {

    /* renamed from: n */
    public static final bywm f168613n;

    /* renamed from: o */
    private static volatile bxxk f168614o;

    /* renamed from: a */
    public int f168615a;

    /* renamed from: b */
    public int f168616b;

    /* renamed from: c */
    public int f168617c;

    /* renamed from: d */
    public bywa f168618d;

    /* renamed from: e */
    public bywb f168619e;

    /* renamed from: f */
    public bywg f168620f;

    /* renamed from: g */
    public bywh f168621g;

    /* renamed from: h */
    public bywe f168622h;

    /* renamed from: i */
    public bywf f168623i;

    /* renamed from: j */
    public bywi f168624j;

    /* renamed from: k */
    public bywj f168625k;

    /* renamed from: l */
    public bywd f168626l;

    /* renamed from: m */
    public byvz f168627m;

    static {
        bywm bywm = new bywm();
        f168613n = bywm;
        GeneratedMessageLite.m124024a(bywm.class, bywm);
    }

    private bywm() {
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
            return GeneratedMessageLite.m124022a(f168613n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"a", "b", bzbe.f169245a, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        } else if (i2 == 3) {
            return new bywm();
        } else {
            if (i2 == 4) {
                return new bxvd(f168613n);
            }
            if (i2 == 5) {
                return f168613n;
            }
            bxxk bxxk = f168614o;
            if (bxxk == null) {
                synchronized (bywm.class) {
                    bxxk = f168614o;
                    if (bxxk == null) {
                        bxxk = new bxve(f168613n);
                        f168614o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
