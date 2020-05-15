package p000;

/* renamed from: bovh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bovh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bovh f135021c;

    /* renamed from: d */
    private static volatile bxxk f135022d;

    /* renamed from: a */
    public int f135023a;

    /* renamed from: b */
    public int f135024b;

    static {
        bovh bovh = new bovh();
        f135021c = bovh;
        bxvk.m124024a(bovh.class, bovh);
    }

    private bovh() {
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
            return bxvk.m124022a(f135021c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bovg.f135020a});
        } else if (i2 == 3) {
            return new bovh();
        } else {
            if (i2 == 4) {
                return new bxvd(f135021c);
            }
            if (i2 == 5) {
                return f135021c;
            }
            bxxk bxxk = f135022d;
            if (bxxk == null) {
                synchronized (bovh.class) {
                    bxxk = f135022d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135021c);
                        f135022d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
