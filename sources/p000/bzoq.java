package p000;

/* renamed from: bzoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzoq extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzoq f170857b;

    /* renamed from: c */
    private static volatile bxxk f170858c;

    /* renamed from: a */
    public String f170859a = "";

    static {
        bzoq bzoq = new bzoq();
        f170857b = bzoq;
        bxvk.m124024a(bzoq.class, bzoq);
    }

    private bzoq() {
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
            return bxvk.m124022a(f170857b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bzoq();
        } else {
            if (i2 == 4) {
                return new bxvd(f170857b);
            }
            if (i2 == 5) {
                return f170857b;
            }
            bxxk bxxk = f170858c;
            if (bxxk == null) {
                synchronized (bzoq.class) {
                    bxxk = f170858c;
                    if (bxxk == null) {
                        bxxk = new bxve(f170857b);
                        f170858c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
