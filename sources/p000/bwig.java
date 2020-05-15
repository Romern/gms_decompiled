package p000;

/* renamed from: bwig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwig extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bwig f159625i;

    /* renamed from: k */
    private static volatile bxxk f159626k;

    /* renamed from: a */
    public int f159627a;

    /* renamed from: b */
    public bxwc f159628b = bxxn.f165040b;

    /* renamed from: c */
    public bmeb f159629c;

    /* renamed from: d */
    public bxwc f159630d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f159631e = bxxn.f165040b;

    /* renamed from: f */
    public int f159632f;

    /* renamed from: g */
    public int f159633g;

    /* renamed from: h */
    public int f159634h;

    /* renamed from: j */
    private byte f159635j = 2;

    static {
        bwig bwig = new bwig();
        f159625i = bwig;
        bxvk.m124024a(bwig.class, bwig);
    }

    private bwig() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159635j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159635j = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f159625i, "\u0001\u0007\u0000\u0001\u0005\u000f\u0007\u0000\u0003\u0001\u0005င\u0002\u0007\u001b\t\u001b\u000b\u001b\rဌ\u0003\u000eင\u0004\u000fᐉ\u0001", new Object[]{"a", "f", "d", bmdb.class, "e", bmde.class, "b", bmnr.class, "g", bwie.f159624a, "h", "c"});
        } else if (i2 == 3) {
            return new bwig();
        } else {
            if (i2 == 4) {
                return new bxvd(f159625i);
            }
            if (i2 == 5) {
                return f159625i;
            }
            bxxk bxxk = f159626k;
            if (bxxk == null) {
                synchronized (bwig.class) {
                    bxxk = f159626k;
                    if (bxxk == null) {
                        bxxk = new bxve(f159625i);
                        f159626k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
