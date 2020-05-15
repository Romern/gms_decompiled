package p000;

/* renamed from: bqbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqbk extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bqbk f140380b;

    /* renamed from: d */
    private static volatile bxxk f140381d;

    /* renamed from: a */
    public int f140382a;

    /* renamed from: c */
    private int f140383c;

    static {
        bqbk bqbk = new bqbk();
        f140380b = bqbk;
        bxvk.m124024a(bqbk.class, bqbk);
    }

    private bqbk() {
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
            return bxvk.m124022a(f140380b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bqbi.f140379a});
        } else if (i2 == 3) {
            return new bqbk();
        } else {
            if (i2 == 4) {
                return new bxvd(f140380b);
            }
            if (i2 == 5) {
                return f140380b;
            }
            bxxk bxxk = f140381d;
            if (bxxk == null) {
                synchronized (bqbk.class) {
                    bxxk = f140381d;
                    if (bxxk == null) {
                        bxxk = new bxve(f140380b);
                        f140381d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
