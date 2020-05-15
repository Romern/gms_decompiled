package p000;

/* renamed from: bpyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyj extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpyj f139868f;

    /* renamed from: g */
    private static volatile bxxk f139869g;

    /* renamed from: a */
    public int f139870a;

    /* renamed from: b */
    public String f139871b = "";

    /* renamed from: c */
    public int f139872c;

    /* renamed from: d */
    public int f139873d;

    /* renamed from: e */
    public long f139874e;

    static {
        bpyj bpyj = new bpyj();
        f139868f = bpyj;
        GeneratedMessageLite.m124024a(bpyj.class, bpyj);
    }

    private bpyj() {
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
            return GeneratedMessageLite.m124022a(f139868f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", bqat.f140177a, "d", bqar.f140176a, "e"});
        } else if (i2 == 3) {
            return new bpyj();
        } else {
            if (i2 == 4) {
                return new bxvd(f139868f);
            }
            if (i2 == 5) {
                return f139868f;
            }
            bxxk bxxk = f139869g;
            if (bxxk == null) {
                synchronized (bpyj.class) {
                    bxxk = f139869g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139868f);
                        f139869g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
