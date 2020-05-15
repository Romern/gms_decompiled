package p000;

/* renamed from: biwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biwj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final biwj f122103c;

    /* renamed from: e */
    private static volatile bxxk f122104e;

    /* renamed from: a */
    public int f122105a = 1;

    /* renamed from: b */
    public boolean f122106b;

    /* renamed from: d */
    private int f122107d;

    static {
        biwj biwj = new biwj();
        f122103c = biwj;
        GeneratedMessageLite.m124024a(biwj.class, biwj);
    }

    private biwj() {
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
            return GeneratedMessageLite.m124022a(f122103c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", biwh.f122102a, "b"});
        } else if (i2 == 3) {
            return new biwj();
        } else {
            if (i2 == 4) {
                return new bxvd(f122103c);
            }
            if (i2 == 5) {
                return f122103c;
            }
            bxxk bxxk = f122104e;
            if (bxxk == null) {
                synchronized (biwj.class) {
                    bxxk = f122104e;
                    if (bxxk == null) {
                        bxxk = new bxve(f122103c);
                        f122104e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
