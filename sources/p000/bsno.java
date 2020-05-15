package p000;

/* renamed from: bsno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsno extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsno f146308c;

    /* renamed from: d */
    private static volatile bxxk f146309d;

    /* renamed from: a */
    public bxtx f146310a = bxtx.f164797b;

    /* renamed from: b */
    public String f146311b = "";

    static {
        bsno bsno = new bsno();
        f146308c = bsno;
        bxvk.m124024a(bsno.class, bsno);
    }

    private bsno() {
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
            return bxvk.m124022a(f146308c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsno();
        } else {
            if (i2 == 4) {
                return new bxvd(f146308c);
            }
            if (i2 == 5) {
                return f146308c;
            }
            bxxk bxxk = f146309d;
            if (bxxk == null) {
                synchronized (bsno.class) {
                    bxxk = f146309d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146308c);
                        f146309d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
