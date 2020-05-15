package p000;

/* renamed from: mta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mta extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final mta f34617g;

    /* renamed from: i */
    private static volatile bxxk f34618i;

    /* renamed from: a */
    public int f34619a;

    /* renamed from: b */
    public int f34620b;

    /* renamed from: c */
    public long f34621c;

    /* renamed from: d */
    public mtb f34622d;

    /* renamed from: e */
    public mtc f34623e;

    /* renamed from: f */
    public bxwc f34624f = bxxn.f165040b;

    /* renamed from: h */
    private mtk f34625h;

    static {
        mta mta = new mta();
        f34617g = mta;
        GeneratedMessageLite.m124024a(mta.class, mta);
    }

    private mta() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f34617g, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\b\u001b", new Object[]{"a", "b", "c", "h", "d", "e", "f", mtv.class});
        } else if (i2 == 3) {
            return new mta();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f34617g;
            }
            bxxk bxxk = f34618i;
            if (bxxk == null) {
                synchronized (mta.class) {
                    bxxk = f34618i;
                    if (bxxk == null) {
                        bxxk = new bxve(f34617g);
                        f34618i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
