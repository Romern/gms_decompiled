package p000;

/* renamed from: byqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byqm extends bxvk implements bxxd {

    /* renamed from: h */
    public static final byqm f167393h;

    /* renamed from: i */
    private static volatile bxxk f167394i;

    /* renamed from: a */
    public int f167395a;

    /* renamed from: b */
    public int f167396b;

    /* renamed from: c */
    public long f167397c;

    /* renamed from: d */
    public String f167398d = "";

    /* renamed from: e */
    public String f167399e = "";

    /* renamed from: f */
    public long f167400f;

    /* renamed from: g */
    public long f167401g;

    static {
        byqm byqm = new byqm();
        f167393h = byqm;
        bxvk.m124024a(byqm.class, byqm);
    }

    private byqm() {
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
            return bxvk.m124022a(f167393h, "\u0001\u0006\u0000\u0001\u0001\u0010\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002စ\u0001\bဈ\u0003\tဈ\u0004\nဂ\u0005\u0010ဂ\u0006", new Object[]{"a", "b", byqo.f167408a, "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new byqm();
        } else {
            if (i2 == 4) {
                return new bxvd(f167393h);
            }
            if (i2 == 5) {
                return f167393h;
            }
            bxxk bxxk = f167394i;
            if (bxxk == null) {
                synchronized (byqm.class) {
                    bxxk = f167394i;
                    if (bxxk == null) {
                        bxxk = new bxve(f167393h);
                        f167394i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
