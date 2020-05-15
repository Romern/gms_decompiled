package p000;

/* renamed from: bybj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybj extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bybj f165504e;

    /* renamed from: f */
    private static volatile bxxk f165505f;

    /* renamed from: a */
    public int f165506a;

    /* renamed from: b */
    public String f165507b = "";

    /* renamed from: c */
    public String f165508c = "";

    /* renamed from: d */
    public int f165509d;

    static {
        bybj bybj = new bybj();
        f165504e = bybj;
        bxvk.m124024a(bybj.class, bybj);
    }

    private bybj() {
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
            return bxvk.m124022a(f165504e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bybj();
        } else {
            if (i2 == 4) {
                return new bxvd(f165504e);
            }
            if (i2 == 5) {
                return f165504e;
            }
            bxxk bxxk = f165505f;
            if (bxxk == null) {
                synchronized (bybj.class) {
                    bxxk = f165505f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165504e);
                        f165505f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
