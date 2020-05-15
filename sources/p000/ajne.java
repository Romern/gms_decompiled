package p000;

/* renamed from: ajne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajne extends bxvk implements bxxd {

    /* renamed from: c */
    public static final ajne f70960c;

    /* renamed from: d */
    private static volatile bxxk f70961d;

    /* renamed from: a */
    public int f70962a;

    /* renamed from: b */
    public int f70963b;

    static {
        ajne ajne = new ajne();
        f70960c = ajne;
        bxvk.m124024a(ajne.class, ajne);
    }

    private ajne() {
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
            return bxvk.m124022a(f70960c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", ajnc.f70959a});
        } else if (i2 == 3) {
            return new ajne();
        } else {
            if (i2 == 4) {
                return new bxvd(f70960c);
            }
            if (i2 == 5) {
                return f70960c;
            }
            bxxk bxxk = f70961d;
            if (bxxk == null) {
                synchronized (ajne.class) {
                    bxxk = f70961d;
                    if (bxxk == null) {
                        bxxk = new bxve(f70960c);
                        f70961d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
