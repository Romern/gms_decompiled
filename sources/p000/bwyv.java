package p000;

/* renamed from: bwyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwyv extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bwyv f161533i;

    /* renamed from: k */
    private static volatile bxxk f161534k;

    /* renamed from: a */
    public int f161535a;

    /* renamed from: b */
    public int f161536b;

    /* renamed from: c */
    public long f161537c;

    /* renamed from: d */
    public bwny f161538d;

    /* renamed from: e */
    public long f161539e;

    /* renamed from: f */
    public bwny f161540f;

    /* renamed from: g */
    public long f161541g;

    /* renamed from: h */
    public bwny f161542h;

    /* renamed from: j */
    private byte f161543j = 2;

    static {
        bwyv bwyv = new bwyv();
        f161533i = bwyv;
        GeneratedMessageLite.m124024a(bwyv.class, bwyv);
    }

    private bwyv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161543j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161543j = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f161533i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0003\u0001င\u0000\u0002ဂ\u0001\u0003ᐉ\u0002\u0004ဂ\u0003\u0005ᐉ\u0004\u0006ဂ\u0005\u0007ᐉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bwyv();
        } else {
            if (i2 == 4) {
                return new bxvd(f161533i);
            }
            if (i2 == 5) {
                return f161533i;
            }
            bxxk bxxk = f161534k;
            if (bxxk == null) {
                synchronized (bwyv.class) {
                    bxxk = f161534k;
                    if (bxxk == null) {
                        bxxk = new bxve(f161533i);
                        f161534k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
