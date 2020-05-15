package p000;

/* renamed from: dmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final dmq f13586e;

    /* renamed from: f */
    private static volatile bxxk f13587f;

    /* renamed from: a */
    public int f13588a;

    /* renamed from: b */
    public String f13589b = "";

    /* renamed from: c */
    public String f13590c = "";

    /* renamed from: d */
    public int f13591d;

    static {
        dmq dmq = new dmq();
        f13586e = dmq;
        bxvk.m124024a(dmq.class, dmq);
    }

    private dmq() {
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
            return bxvk.m124022a(f13586e, "\u0001\u0003\u0000\u0001\u0001d\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001dင\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new dmq();
        } else {
            if (i2 == 4) {
                return new bxvd(f13586e);
            }
            if (i2 == 5) {
                return f13586e;
            }
            bxxk bxxk = f13587f;
            if (bxxk == null) {
                synchronized (dmq.class) {
                    bxxk = f13587f;
                    if (bxxk == null) {
                        bxxk = new bxve(f13586e);
                        f13587f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
