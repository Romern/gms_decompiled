package p000;

/* renamed from: eir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eir extends bxvk implements bxxd {

    /* renamed from: c */
    public static final eir f15088c;

    /* renamed from: d */
    private static volatile bxxk f15089d;

    /* renamed from: a */
    public int f15090a;

    /* renamed from: b */
    public int f15091b;

    static {
        eir eir = new eir();
        f15088c = eir;
        bxvk.m124024a(eir.class, eir);
    }

    private eir() {
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
            return bxvk.m124022a(f15088c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new eir();
        } else {
            if (i2 == 4) {
                return new bxvd(f15088c);
            }
            if (i2 == 5) {
                return f15088c;
            }
            bxxk bxxk = f15089d;
            if (bxxk == null) {
                synchronized (eir.class) {
                    bxxk = f15089d;
                    if (bxxk == null) {
                        bxxk = new bxve(f15088c);
                        f15089d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
