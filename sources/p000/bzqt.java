package p000;

/* renamed from: bzqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqt extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzqt f171068c;

    /* renamed from: d */
    private static volatile bxxk f171069d;

    /* renamed from: a */
    public int f171070a;

    /* renamed from: b */
    public String f171071b = "";

    static {
        bzqt bzqt = new bzqt();
        f171068c = bzqt;
        bxvk.m124024a(bzqt.class, bzqt);
    }

    private bzqt() {
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
            return bxvk.m124022a(f171068c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzqt();
        } else {
            if (i2 == 4) {
                return new bxvd(f171068c);
            }
            if (i2 == 5) {
                return f171068c;
            }
            bxxk bxxk = f171069d;
            if (bxxk == null) {
                synchronized (bzqt.class) {
                    bxxk = f171069d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171068c);
                        f171069d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
