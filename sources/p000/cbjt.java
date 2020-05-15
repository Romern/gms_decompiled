package p000;

/* renamed from: cbjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjt extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbjt f177365c;

    /* renamed from: d */
    private static volatile bxxk f177366d;

    /* renamed from: a */
    public int f177367a = 0;

    /* renamed from: b */
    public Object f177368b;

    static {
        cbjt cbjt = new cbjt();
        f177365c = cbjt;
        bxvk.m124024a(cbjt.class, cbjt);
    }

    private cbjt() {
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
            return bxvk.m124022a(f177365c, "\u0000\u0005\u0001\u0000\u0004\b\u0005\u0000\u0000\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"b", "a", cbjq.class, cbjr.class, cbjs.class, cbjo.class, cbjn.class});
        } else if (i2 == 3) {
            return new cbjt();
        } else {
            if (i2 == 4) {
                return new bxvd(f177365c);
            }
            if (i2 == 5) {
                return f177365c;
            }
            bxxk bxxk = f177366d;
            if (bxxk == null) {
                synchronized (cbjt.class) {
                    bxxk = f177366d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177365c);
                        f177366d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
