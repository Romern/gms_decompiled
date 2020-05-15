package p000;

/* renamed from: byeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byeh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byeh f165904c;

    /* renamed from: d */
    private static volatile bxxk f165905d;

    /* renamed from: a */
    public int f165906a;

    /* renamed from: b */
    public String f165907b = "";

    static {
        byeh byeh = new byeh();
        f165904c = byeh;
        bxvk.m124024a(byeh.class, byeh);
    }

    private byeh() {
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
            return bxvk.m124022a(f165904c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byeh();
        } else {
            if (i2 == 4) {
                return new bxvd(f165904c);
            }
            if (i2 == 5) {
                return f165904c;
            }
            bxxk bxxk = f165905d;
            if (bxxk == null) {
                synchronized (byeh.class) {
                    bxxk = f165905d;
                    if (bxxk == null) {
                        bxxk = new bxve(f165904c);
                        f165905d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
