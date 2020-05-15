package p000;

/* renamed from: cipf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cipf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cipf f191195c;

    /* renamed from: d */
    private static volatile bxxk f191196d;

    /* renamed from: a */
    public int f191197a;

    /* renamed from: b */
    public String f191198b = "";

    static {
        cipf cipf = new cipf();
        f191195c = cipf;
        bxvk.m124024a(cipf.class, cipf);
    }

    private cipf() {
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
            return bxvk.m124022a(f191195c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cipf();
        } else {
            if (i2 == 4) {
                return new bxvd(f191195c);
            }
            if (i2 == 5) {
                return f191195c;
            }
            bxxk bxxk = f191196d;
            if (bxxk == null) {
                synchronized (cipf.class) {
                    bxxk = f191196d;
                    if (bxxk == null) {
                        bxxk = new bxve(f191195c);
                        f191196d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
