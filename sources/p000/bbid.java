package p000;

/* renamed from: bbid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbid extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bbid f102703c;

    /* renamed from: d */
    private static volatile bxxk f102704d;

    /* renamed from: a */
    public int f102705a;

    /* renamed from: b */
    public bpwx f102706b;

    static {
        bbid bbid = new bbid();
        f102703c = bbid;
        bxvk.m124024a(bbid.class, bbid);
    }

    private bbid() {
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
            return bxvk.m124022a(f102703c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bbid();
        } else {
            if (i2 == 4) {
                return new bxvd(f102703c);
            }
            if (i2 == 5) {
                return f102703c;
            }
            bxxk bxxk = f102704d;
            if (bxxk == null) {
                synchronized (bbid.class) {
                    bxxk = f102704d;
                    if (bxxk == null) {
                        bxxk = new bxve(f102703c);
                        f102704d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
