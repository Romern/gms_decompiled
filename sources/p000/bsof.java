package p000;

/* renamed from: bsof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsof extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsof f146365e;

    /* renamed from: f */
    private static volatile bxxk f146366f;

    /* renamed from: a */
    public int f146367a;

    /* renamed from: b */
    public bsoh f146368b;

    /* renamed from: c */
    public bsoi f146369c;

    /* renamed from: d */
    public boolean f146370d;

    static {
        bsof bsof = new bsof();
        f146365e = bsof;
        GeneratedMessageLite.m124024a(bsof.class, bsof);
    }

    private bsof() {
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
            return GeneratedMessageLite.m124022a(f146365e, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\bဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bsof();
        } else {
            if (i2 == 4) {
                return new bxvd(f146365e);
            }
            if (i2 == 5) {
                return f146365e;
            }
            bxxk bxxk = f146366f;
            if (bxxk == null) {
                synchronized (bsof.class) {
                    bxxk = f146366f;
                    if (bxxk == null) {
                        bxxk = new bxve(f146365e);
                        f146366f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
