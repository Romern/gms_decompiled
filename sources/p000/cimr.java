package p000;

/* renamed from: cimr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cimr extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final cimr f190766i;

    /* renamed from: j */
    private static volatile bxxk f190767j;

    /* renamed from: a */
    public int f190768a;

    /* renamed from: b */
    public long f190769b;

    /* renamed from: c */
    public long f190770c;

    /* renamed from: d */
    public long f190771d;

    /* renamed from: e */
    public long f190772e;

    /* renamed from: f */
    public long f190773f;

    /* renamed from: g */
    public long f190774g;

    /* renamed from: h */
    public cimn f190775h;

    static {
        cimr cimr = new cimr();
        f190766i = cimr;
        GeneratedMessageLite.m124024a(cimr.class, cimr);
    }

    private cimr() {
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
            return GeneratedMessageLite.m124022a(f190766i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new cimr();
        } else {
            if (i2 == 4) {
                return new bxvd(f190766i);
            }
            if (i2 == 5) {
                return f190766i;
            }
            bxxk bxxk = f190767j;
            if (bxxk == null) {
                synchronized (cimr.class) {
                    bxxk = f190767j;
                    if (bxxk == null) {
                        bxxk = new bxve(f190766i);
                        f190767j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
