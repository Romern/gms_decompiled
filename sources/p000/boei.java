package p000;

/* renamed from: boei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boei extends bxvk implements bxxd {

    /* renamed from: k */
    public static final boei f132795k;

    /* renamed from: l */
    private static volatile bxxk f132796l;

    /* renamed from: a */
    public int f132797a;

    /* renamed from: b */
    public int f132798b;

    /* renamed from: c */
    public int f132799c;

    /* renamed from: d */
    public int f132800d;

    /* renamed from: e */
    public bofp f132801e;

    /* renamed from: f */
    public long f132802f;

    /* renamed from: g */
    public int f132803g;

    /* renamed from: h */
    public int f132804h;

    /* renamed from: i */
    public int f132805i;

    /* renamed from: j */
    public int f132806j;

    static {
        boei boei = new boei();
        f132795k = boei;
        bxvk.m124024a(boei.class, boei);
    }

    private boei() {
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
            return bxvk.m124022a(f132795k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဌ\u0006\bဌ\u0007\tဌ\b", new Object[]{"a", "b", "c", boef.f132792a, "d", "e", "f", "g", "h", boeg.f132793a, "i", boeh.f132794a, "j", boee.f132791a});
        } else if (i2 == 3) {
            return new boei();
        } else {
            if (i2 == 4) {
                return new bxvd(f132795k);
            }
            if (i2 == 5) {
                return f132795k;
            }
            bxxk bxxk = f132796l;
            if (bxxk == null) {
                synchronized (boei.class) {
                    bxxk = f132796l;
                    if (bxxk == null) {
                        bxxk = new bxve(f132795k);
                        f132796l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
