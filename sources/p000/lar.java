package p000;

/* renamed from: lar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lar extends bxvk implements bxxd {

    /* renamed from: c */
    public static final lar f25601c;

    /* renamed from: d */
    private static volatile bxxk f25602d;

    /* renamed from: a */
    public String f25603a = "";

    /* renamed from: b */
    public String f25604b = "";

    static {
        lar lar = new lar();
        f25601c = lar;
        bxvk.m124024a(lar.class, lar);
    }

    private lar() {
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
            return bxvk.m124022a(f25601c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new lar();
        } else {
            if (i2 == 4) {
                return new bxvd(f25601c);
            }
            if (i2 == 5) {
                return f25601c;
            }
            bxxk bxxk = f25602d;
            if (bxxk == null) {
                synchronized (lar.class) {
                    bxxk = f25602d;
                    if (bxxk == null) {
                        bxxk = new bxve(f25601c);
                        f25602d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
