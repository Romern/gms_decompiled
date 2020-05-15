package p000;

/* renamed from: bxht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxht extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxht f163469c;

    /* renamed from: d */
    private static volatile bxxk f163470d;

    /* renamed from: a */
    public int f163471a;

    /* renamed from: b */
    public bxtx f163472b = bxtx.f164797b;

    static {
        bxht bxht = new bxht();
        f163469c = bxht;
        bxvk.m124024a(bxht.class, bxht);
    }

    private bxht() {
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
            return bxvk.m124022a(f163469c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxht();
        } else {
            if (i2 == 4) {
                return new bxvd(f163469c);
            }
            if (i2 == 5) {
                return f163469c;
            }
            bxxk bxxk = f163470d;
            if (bxxk == null) {
                synchronized (bxht.class) {
                    bxxk = f163470d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163469c);
                        f163470d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
