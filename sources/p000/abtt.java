package p000;

/* renamed from: abtt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abtt extends bxvk implements bxxd {

    /* renamed from: c */
    public static final abtt f58306c;

    /* renamed from: d */
    private static volatile bxxk f58307d;

    /* renamed from: a */
    public int f58308a = 0;

    /* renamed from: b */
    public Object f58309b;

    static {
        abtt abtt = new abtt();
        f58306c = abtt;
        bxvk.m124024a(abtt.class, abtt);
    }

    private abtt() {
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
            return bxvk.m124022a(f58306c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", abtq.class, abtr.class, abts.class});
        } else if (i2 == 3) {
            return new abtt();
        } else {
            if (i2 == 4) {
                return new bxvd(f58306c);
            }
            if (i2 == 5) {
                return f58306c;
            }
            bxxk bxxk = f58307d;
            if (bxxk == null) {
                synchronized (abtt.class) {
                    bxxk = f58307d;
                    if (bxxk == null) {
                        bxxk = new bxve(f58306c);
                        f58307d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
