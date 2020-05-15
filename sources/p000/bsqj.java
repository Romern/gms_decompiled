package p000;

/* renamed from: bsqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqj extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsqj f146651e;

    /* renamed from: f */
    private static volatile bxxk f146652f;

    /* renamed from: a */
    public int f146653a;

    /* renamed from: b */
    public bsqq f146654b;

    /* renamed from: c */
    public bsqh f146655c;

    /* renamed from: d */
    public bsqh f146656d;

    static {
        bsqj bsqj = new bsqj();
        f146651e = bsqj;
        GeneratedMessageLite.m124024a(bsqj.class, bsqj);
    }

    private bsqj() {
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
            return GeneratedMessageLite.m124022a(f146651e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bsqj();
        } else {
            if (i2 == 4) {
                return new bxvd(f146651e);
            }
            if (i2 == 5) {
                return f146651e;
            }
            bxxk bxxk = f146652f;
            if (bxxk == null) {
                synchronized (bsqj.class) {
                    bxxk = f146652f;
                    if (bxxk == null) {
                        bxxk = new bxve(f146651e);
                        f146652f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
