package p000;

/* renamed from: apzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apzj extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final apzj f85255f;

    /* renamed from: g */
    private static volatile bxxk f85256g;

    /* renamed from: a */
    public int f85257a;

    /* renamed from: b */
    public boolean f85258b;

    /* renamed from: c */
    public boolean f85259c;

    /* renamed from: d */
    public int f85260d;

    /* renamed from: e */
    public bxwc f85261e = bxxn.f165040b;

    static {
        apzj apzj = new apzj();
        f85255f = apzj;
        GeneratedMessageLite.m124024a(apzj.class, apzj);
    }

    private apzj() {
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
            return GeneratedMessageLite.m124022a(f85255f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", apzi.f85254a, "e", apzg.class});
        } else if (i2 == 3) {
            return new apzj();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f85255f;
            }
            bxxk bxxk = f85256g;
            if (bxxk == null) {
                synchronized (apzj.class) {
                    bxxk = f85256g;
                    if (bxxk == null) {
                        bxxk = new bxve(f85255f);
                        f85256g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
