package p000;

/* renamed from: bmlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmlh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmlh f129935d;

    /* renamed from: e */
    private static volatile bxxk f129936e;

    /* renamed from: a */
    public int f129937a;

    /* renamed from: b */
    public bmnv f129938b;

    /* renamed from: c */
    public boolean f129939c;

    static {
        bmlh bmlh = new bmlh();
        f129935d = bmlh;
        bxvk.m124024a(bmlh.class, bmlh);
    }

    private bmlh() {
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
            return bxvk.m124022a(f129935d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmlh();
        } else {
            if (i2 == 4) {
                return new bxvd(f129935d);
            }
            if (i2 == 5) {
                return f129935d;
            }
            bxxk bxxk = f129936e;
            if (bxxk == null) {
                synchronized (bmlh.class) {
                    bxxk = f129936e;
                    if (bxxk == null) {
                        bxxk = new bxve(f129935d);
                        f129936e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
