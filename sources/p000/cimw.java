package p000;

/* renamed from: cimw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cimw extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final cimw f190855i;

    /* renamed from: j */
    private static volatile bxxk f190856j;

    /* renamed from: a */
    public int f190857a;

    /* renamed from: b */
    public ByteString f190858b = ByteString.f164797b;

    /* renamed from: c */
    public cimx f190859c;

    /* renamed from: d */
    public double f190860d;

    /* renamed from: e */
    public int f190861e;

    /* renamed from: f */
    public int f190862f;

    /* renamed from: g */
    public int f190863g;

    /* renamed from: h */
    public int f190864h;

    static {
        cimw cimw = new cimw();
        f190855i = cimw;
        GeneratedMessageLite.m124024a(cimw.class, cimw);
    }

    private cimw() {
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
            return GeneratedMessageLite.m124022a(f190855i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003က\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new cimw();
        } else {
            if (i2 == 4) {
                return new bxvd(f190855i);
            }
            if (i2 == 5) {
                return f190855i;
            }
            bxxk bxxk = f190856j;
            if (bxxk == null) {
                synchronized (cimw.class) {
                    bxxk = f190856j;
                    if (bxxk == null) {
                        bxxk = new bxve(f190855i);
                        f190856j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
