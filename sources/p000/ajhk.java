package p000;

/* renamed from: ajhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajhk extends bxvk implements bxxd {

    /* renamed from: b */
    public static final ajhk f70653b;

    /* renamed from: c */
    private static volatile bxxk f70654c;

    /* renamed from: a */
    public bxwc f70655a = bxxn.f165040b;

    static {
        ajhk ajhk = new ajhk();
        f70653b = ajhk;
        bxvk.m124024a(ajhk.class, ajhk);
    }

    private ajhk() {
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
            return bxvk.m124022a(f70653b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ajhj.class});
        } else if (i2 == 3) {
            return new ajhk();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f70653b;
            }
            bxxk bxxk = f70654c;
            if (bxxk == null) {
                synchronized (ajhk.class) {
                    bxxk = f70654c;
                    if (bxxk == null) {
                        bxxk = new bxve(f70653b);
                        f70654c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
