package p000;

/* renamed from: brby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brby extends bxvk implements bxxd {

    /* renamed from: d */
    public static final brby f142336d;

    /* renamed from: f */
    private static volatile bxxk f142337f;

    /* renamed from: a */
    public bral f142338a;

    /* renamed from: b */
    public bxwc f142339b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f142340c = bxxn.f165040b;

    /* renamed from: e */
    private int f142341e;

    static {
        brby brby = new brby();
        f142336d = brby;
        bxvk.m124024a(brby.class, brby);
    }

    private brby() {
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
            return bxvk.m124022a(f142336d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"e", "a", "b", brbv.class, "c", brbz.class});
        } else if (i2 == 3) {
            return new brby();
        } else {
            if (i2 == 4) {
                return new bxvd(f142336d);
            }
            if (i2 == 5) {
                return f142336d;
            }
            bxxk bxxk = f142337f;
            if (bxxk == null) {
                synchronized (brby.class) {
                    bxxk = f142337f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142336d);
                        f142337f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
