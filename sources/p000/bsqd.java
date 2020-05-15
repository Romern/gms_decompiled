package p000;

/* renamed from: bsqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqd extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsqd f146621e;

    /* renamed from: f */
    private static volatile bxxk f146622f;

    /* renamed from: a */
    public int f146623a;

    /* renamed from: b */
    public int f146624b;

    /* renamed from: c */
    public int f146625c;

    /* renamed from: d */
    public bxwc f146626d = bxxn.f165040b;

    static {
        bsqd bsqd = new bsqd();
        f146621e = bsqd;
        GeneratedMessageLite.m124024a(bsqd.class, bsqd);
    }

    private bsqd() {
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
            return GeneratedMessageLite.m124022a(f146621e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b", new Object[]{"a", "b", bsqc.f146620a, "c", bsqa.f146614a, "d", bsqb.class});
        } else if (i2 == 3) {
            return new bsqd();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f146621e;
            }
            bxxk bxxk = f146622f;
            if (bxxk == null) {
                synchronized (bsqd.class) {
                    bxxk = f146622f;
                    if (bxxk == null) {
                        bxxk = new bxve(f146621e);
                        f146622f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
