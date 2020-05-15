package p000;

/* renamed from: bsra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsra extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsra f146725c;

    /* renamed from: d */
    private static volatile bxxk f146726d;

    /* renamed from: a */
    public int f146727a;

    /* renamed from: b */
    public String f146728b = "";

    static {
        bsra bsra = new bsra();
        f146725c = bsra;
        bxvk.m124024a(bsra.class, bsra);
    }

    private bsra() {
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
            return bxvk.m124022a(f146725c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsra();
        } else {
            if (i2 == 4) {
                return new bxvd(f146725c);
            }
            if (i2 == 5) {
                return f146725c;
            }
            bxxk bxxk = f146726d;
            if (bxxk == null) {
                synchronized (bsra.class) {
                    bxxk = f146726d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146725c);
                        f146726d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
