package p000;

/* renamed from: btuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btuz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btuz f150650c;

    /* renamed from: e */
    private static volatile bxxk f150651e;

    /* renamed from: a */
    public bxwc f150652a = bxxn.f165040b;

    /* renamed from: b */
    public float f150653b;

    /* renamed from: d */
    private int f150654d;

    static {
        btuz btuz = new btuz();
        f150650c = btuz;
        bxvk.m124024a(btuz.class, btuz);
    }

    private btuz() {
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
            return bxvk.m124022a(f150650c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ခ\u0000", new Object[]{"d", "a", btuu.class, "b"});
        } else if (i2 == 3) {
            return new btuz();
        } else {
            if (i2 == 4) {
                return new bxvd(f150650c);
            }
            if (i2 == 5) {
                return f150650c;
            }
            bxxk bxxk = f150651e;
            if (bxxk == null) {
                synchronized (btuz.class) {
                    bxxk = f150651e;
                    if (bxxk == null) {
                        bxxk = new bxve(f150650c);
                        f150651e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
