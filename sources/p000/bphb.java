package p000;

/* renamed from: bphb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bphb extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bphb f137617k;

    /* renamed from: l */
    private static volatile bxxk f137618l;

    /* renamed from: a */
    public int f137619a;

    /* renamed from: b */
    public int f137620b;

    /* renamed from: c */
    public bpfv f137621c;

    /* renamed from: d */
    public int f137622d;

    /* renamed from: e */
    public long f137623e;

    /* renamed from: f */
    public bpfw f137624f;

    /* renamed from: g */
    public bpgw f137625g;

    /* renamed from: h */
    public bpgz f137626h;

    /* renamed from: i */
    public bpgs f137627i;

    /* renamed from: j */
    public bpgr f137628j;

    static {
        bphb bphb = new bphb();
        f137617k = bphb;
        bxvk.m124024a(bphb.class, bphb);
    }

    private bphb() {
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
            return bxvk.m124022a(f137617k, "\u0001\t\u0000\u0001\u0002\u001d\t\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဉ\u0001\u0005ဌ\u0004\u0006ဂ\u0005\nဉ\b\fဉ\n\u000eဉ\r\u0010ဉ\u000f\u001dဉ\u000b", new Object[]{"a", "b", bzzs.f172147a, "c", "d", bzzw.f172236a, "e", "f", "g", "i", "j", "h"});
        } else if (i2 == 3) {
            return new bphb();
        } else {
            if (i2 == 4) {
                return new bxvd(f137617k);
            }
            if (i2 == 5) {
                return f137617k;
            }
            bxxk bxxk = f137618l;
            if (bxxk == null) {
                synchronized (bphb.class) {
                    bxxk = f137618l;
                    if (bxxk == null) {
                        bxxk = new bxve(f137617k);
                        f137618l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
