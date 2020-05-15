package p000;

/* renamed from: bbii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbii extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bbii f102728c;

    /* renamed from: d */
    private static volatile bxxk f102729d;

    /* renamed from: a */
    public int f102730a;

    /* renamed from: b */
    public bbih f102731b;

    static {
        bbii bbii = new bbii();
        f102728c = bbii;
        bxvk.m124024a(bbii.class, bbii);
    }

    private bbii() {
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
            return bxvk.m124022a(f102728c, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bbii();
        } else {
            if (i2 == 4) {
                return new bxvd(f102728c);
            }
            if (i2 == 5) {
                return f102728c;
            }
            bxxk bxxk = f102729d;
            if (bxxk == null) {
                synchronized (bbii.class) {
                    bxxk = f102729d;
                    if (bxxk == null) {
                        bxxk = new bxve(f102728c);
                        f102729d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
