package p000;

/* renamed from: calw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class calw extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final calw f175191i;

    /* renamed from: j */
    private static volatile bxxk f175192j;

    /* renamed from: a */
    public int f175193a;

    /* renamed from: b */
    public String f175194b = "";

    /* renamed from: c */
    public int f175195c;

    /* renamed from: d */
    public String f175196d = "";

    /* renamed from: e */
    public long f175197e;

    /* renamed from: f */
    public String f175198f = "";

    /* renamed from: g */
    public long f175199g;

    /* renamed from: h */
    public long f175200h;

    static {
        calw calw = new calw();
        f175191i = calw;
        GeneratedMessageLite.m124024a(calw.class, calw);
    }

    private calw() {
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
            return GeneratedMessageLite.m124022a(f175191i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new calw();
        } else {
            if (i2 == 4) {
                return new bxvd(f175191i);
            }
            if (i2 == 5) {
                return f175191i;
            }
            bxxk bxxk = f175192j;
            if (bxxk == null) {
                synchronized (calw.class) {
                    bxxk = f175192j;
                    if (bxxk == null) {
                        bxxk = new bxve(f175191i);
                        f175192j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
