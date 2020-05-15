package p000;

/* renamed from: bovf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bovf extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bovf f135010i;

    /* renamed from: j */
    private static volatile bxxk f135011j;

    /* renamed from: a */
    public int f135012a;

    /* renamed from: b */
    public boul f135013b;

    /* renamed from: c */
    public bouk f135014c;

    /* renamed from: d */
    public bovb f135015d;

    /* renamed from: e */
    public bouw f135016e;

    /* renamed from: f */
    public boup f135017f;

    /* renamed from: g */
    public bove f135018g;

    /* renamed from: h */
    public bxwc f135019h = bxxn.f165040b;

    static {
        bovf bovf = new bovf();
        f135010i = bovf;
        GeneratedMessageLite.m124024a(bovf.class, bovf);
    }

    private bovf() {
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
            return GeneratedMessageLite.m124022a(f135010i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", boub.class});
        } else if (i2 == 3) {
            return new bovf();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f135010i;
            }
            bxxk bxxk = f135011j;
            if (bxxk == null) {
                synchronized (bovf.class) {
                    bxxk = f135011j;
                    if (bxxk == null) {
                        bxxk = new bxve(f135010i);
                        f135011j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
