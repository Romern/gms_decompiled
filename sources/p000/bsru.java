package p000;

/* renamed from: bsru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsru extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsru f146799c;

    /* renamed from: d */
    private static volatile bxxk f146800d;

    /* renamed from: a */
    public int f146801a = 0;

    /* renamed from: b */
    public Object f146802b;

    static {
        bsru bsru = new bsru();
        f146799c = bsru;
        GeneratedMessageLite.m124024a(bsru.class, bsru);
    }

    private bsru() {
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
            return GeneratedMessageLite.m124022a(f146799c, "\u0001\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000", new Object[]{"b", "a", bsrq.class, bsrm.class, bsro.class, bsrj.class, bsrr.class, bsrl.class, bsrn.class, bsrl.class, bsrl.class, bsrt.class, bsrp.class, bsrs.class, bsrk.class});
        } else if (i2 == 3) {
            return new bsru();
        } else {
            if (i2 == 4) {
                return new bxvd(f146799c);
            }
            if (i2 == 5) {
                return f146799c;
            }
            bxxk bxxk = f146800d;
            if (bxxk == null) {
                synchronized (bsru.class) {
                    bxxk = f146800d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146799c);
                        f146800d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
