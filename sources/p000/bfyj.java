package p000;

/* renamed from: bfyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfyj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bfyj f115690d;

    /* renamed from: e */
    private static volatile bxxk f115691e;

    /* renamed from: a */
    public int f115692a;

    /* renamed from: b */
    public String f115693b = "";

    /* renamed from: c */
    public bxwc f115694c = bxxn.f165040b;

    static {
        bfyj bfyj = new bfyj();
        f115690d = bfyj;
        GeneratedMessageLite.m124024a(bfyj.class, bfyj);
    }

    private bfyj() {
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
            return GeneratedMessageLite.m124022a(f115690d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bfyf.class});
        } else if (i2 == 3) {
            return new bfyj();
        } else {
            if (i2 == 4) {
                return new bfyi();
            }
            if (i2 == 5) {
                return f115690d;
            }
            bxxk bxxk = f115691e;
            if (bxxk == null) {
                synchronized (bfyj.class) {
                    bxxk = f115691e;
                    if (bxxk == null) {
                        bxxk = new bxve(f115690d);
                        f115691e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
