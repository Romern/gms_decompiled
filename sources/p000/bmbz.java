package p000;

/* renamed from: bmbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmbz extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bmbz f128634i;

    /* renamed from: j */
    private static volatile bxxk f128635j;

    /* renamed from: a */
    public int f128636a;

    /* renamed from: b */
    public long f128637b;

    /* renamed from: c */
    public bmbs f128638c;

    /* renamed from: d */
    public int f128639d;

    /* renamed from: e */
    public String f128640e = "";

    /* renamed from: f */
    public int f128641f;

    /* renamed from: g */
    public bmno f128642g;

    /* renamed from: h */
    public bwdm f128643h;

    static {
        bmbz bmbz = new bmbz();
        f128634i = bmbz;
        GeneratedMessageLite.m124024a(bmbz.class, bmbz);
    }

    private bmbz() {
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
            return GeneratedMessageLite.m124022a(f128634i, "\u0001\u0007\u0000\u0001\u0004\n\u0007\u0000\u0000\u0000\u0004ဉ\u0001\u0005ဂ\u0000\u0006ဌ\u0002\u0007ဌ\u0004\bဈ\u0003\tဉ\u0005\nဉ\u0006", new Object[]{"a", "c", "b", "d", bmbx.f128633a, "f", bmbv.f128632a, "e", "g", "h"});
        } else if (i2 == 3) {
            return new bmbz();
        } else {
            if (i2 == 4) {
                return new bxvd(f128634i);
            }
            if (i2 == 5) {
                return f128634i;
            }
            bxxk bxxk = f128635j;
            if (bxxk == null) {
                synchronized (bmbz.class) {
                    bxxk = f128635j;
                    if (bxxk == null) {
                        bxxk = new bxve(f128634i);
                        f128635j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
