package p000;

/* renamed from: blui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blui extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final blui f127810b;

    /* renamed from: c */
    private static volatile bxxk f127811c;

    /* renamed from: a */
    public bxwc f127812a = bxxn.f165040b;

    static {
        blui blui = new blui();
        f127810b = blui;
        GeneratedMessageLite.m124024a(blui.class, blui);
    }

    private blui() {
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
            return GeneratedMessageLite.m124022a(f127810b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", brzn.class});
        } else if (i2 == 3) {
            return new blui();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f127810b;
            }
            bxxk bxxk = f127811c;
            if (bxxk == null) {
                synchronized (blui.class) {
                    bxxk = f127811c;
                    if (bxxk == null) {
                        bxxk = new bxve(f127810b);
                        f127811c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
