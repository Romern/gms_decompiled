package p000;

/* renamed from: bxgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxgc extends bxvk implements bxxd {

    /* renamed from: o */
    public static final bxgc f163222o;

    /* renamed from: p */
    private static volatile bxxk f163223p;

    /* renamed from: a */
    public int f163224a;

    /* renamed from: b */
    public bxhm f163225b;

    /* renamed from: c */
    public int f163226c;

    /* renamed from: d */
    public int f163227d;

    /* renamed from: e */
    public bxgq f163228e;

    /* renamed from: f */
    public bxhb f163229f;

    /* renamed from: g */
    public bxgi f163230g;

    /* renamed from: h */
    public bxgj f163231h;

    /* renamed from: i */
    public bxgr f163232i;

    /* renamed from: j */
    public bxgs f163233j;

    /* renamed from: k */
    public bxgw f163234k;

    /* renamed from: l */
    public bxgp f163235l;

    /* renamed from: m */
    public bxgg f163236m;

    /* renamed from: n */
    public bxha f163237n;

    static {
        bxgc bxgc = new bxgc();
        f163222o = bxgc;
        bxvk.m124024a(bxgc.class, bxgc);
    }

    private bxgc() {
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
            return bxvk.m124022a(f163222o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f", new Object[]{"a", "b", "c", bxgb.f163221a, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        } else if (i2 == 3) {
            return new bxgc();
        } else {
            if (i2 == 4) {
                return new bxvd(f163222o);
            }
            if (i2 == 5) {
                return f163222o;
            }
            bxxk bxxk = f163223p;
            if (bxxk == null) {
                synchronized (bxgc.class) {
                    bxxk = f163223p;
                    if (bxxk == null) {
                        bxxk = new bxve(f163222o);
                        f163223p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
