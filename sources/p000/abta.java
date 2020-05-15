package p000;

/* renamed from: abta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abta extends bxvk implements bxxd {

    /* renamed from: d */
    public static final abta f58189d;

    /* renamed from: f */
    private static volatile bxxk f58190f;

    /* renamed from: a */
    public long f58191a;

    /* renamed from: b */
    public bxwc f58192b = bxxn.f165040b;

    /* renamed from: c */
    public int f58193c;

    /* renamed from: e */
    private int f58194e;

    static {
        abta abta = new abta();
        f58189d = abta;
        bxvk.m124024a(abta.class, abta);
    }

    private abta() {
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
            return bxvk.m124022a(f58189d, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0000\u0002ဃ\u0000\u0003\u001b\u0005ဋ\u0002", new Object[]{"e", "a", "b", absz.class, "c"});
        } else if (i2 == 3) {
            return new abta();
        } else {
            if (i2 == 4) {
                return new bxvd(f58189d);
            }
            if (i2 == 5) {
                return f58189d;
            }
            bxxk bxxk = f58190f;
            if (bxxk == null) {
                synchronized (abta.class) {
                    bxxk = f58190f;
                    if (bxxk == null) {
                        bxxk = new bxve(f58189d);
                        f58190f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
