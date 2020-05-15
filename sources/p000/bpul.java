package p000;

/* renamed from: bpul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpul extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpul f139253c;

    /* renamed from: d */
    private static volatile bxxk f139254d;

    /* renamed from: a */
    public int f139255a;

    /* renamed from: b */
    public String f139256b = "";

    static {
        bpul bpul = new bpul();
        f139253c = bpul;
        bxvk.m124024a(bpul.class, bpul);
    }

    private bpul() {
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
            return bxvk.m124022a(f139253c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpul();
        } else {
            if (i2 == 4) {
                return new bxvd(f139253c);
            }
            if (i2 == 5) {
                return f139253c;
            }
            bxxk bxxk = f139254d;
            if (bxxk == null) {
                synchronized (bpul.class) {
                    bxxk = f139254d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139253c);
                        f139254d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
