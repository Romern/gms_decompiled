package p000;

/* renamed from: aqaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqaj extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final aqaj f85391i;

    /* renamed from: j */
    private static volatile bxxk f85392j;

    /* renamed from: a */
    public int f85393a;

    /* renamed from: b */
    public boolean f85394b;

    /* renamed from: c */
    public boolean f85395c;

    /* renamed from: d */
    public long f85396d;

    /* renamed from: e */
    public int f85397e;

    /* renamed from: f */
    public boolean f85398f;

    /* renamed from: g */
    public String f85399g = "";

    /* renamed from: h */
    public long f85400h;

    static {
        aqaj aqaj = new aqaj();
        f85391i = aqaj;
        GeneratedMessageLite.m124024a(aqaj.class, aqaj);
    }

    private aqaj() {
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
            return GeneratedMessageLite.m124022a(f85391i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဂ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new aqaj();
        } else {
            if (i2 == 4) {
                return new bxvd(f85391i);
            }
            if (i2 == 5) {
                return f85391i;
            }
            bxxk bxxk = f85392j;
            if (bxxk == null) {
                synchronized (aqaj.class) {
                    bxxk = f85392j;
                    if (bxxk == null) {
                        bxxk = new bxve(f85391i);
                        f85392j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
