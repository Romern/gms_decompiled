package p000;

/* renamed from: qhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qhu extends bxvk implements bxxd {

    /* renamed from: i */
    public static final qhu f41418i;

    /* renamed from: j */
    private static volatile bxxk f41419j;

    /* renamed from: a */
    public int f41420a;

    /* renamed from: b */
    public String f41421b = "";

    /* renamed from: c */
    public String f41422c = "";

    /* renamed from: d */
    public String f41423d = "";

    /* renamed from: e */
    public bxvt f41424e = bxvm.f164965b;

    /* renamed from: f */
    public String f41425f = "";

    /* renamed from: g */
    public String f41426g = "";

    /* renamed from: h */
    public bxtx f41427h = bxtx.f164797b;

    static {
        qhu qhu = new qhu();
        f41418i = qhu;
        bxvk.m124024a(qhu.class, qhu);
    }

    private qhu() {
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
            return bxvk.m124022a(f41418i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001e\u0006ဈ\u0004\u0007ဈ\u0005\bည\u0006", new Object[]{"a", "b", "c", "d", "e", qht.m32188b(), "f", "g", "h"});
        } else if (i2 == 3) {
            return new qhu();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f41418i;
            }
            bxxk bxxk = f41419j;
            if (bxxk == null) {
                synchronized (qhu.class) {
                    bxxk = f41419j;
                    if (bxxk == null) {
                        bxxk = new bxve(f41418i);
                        f41419j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
