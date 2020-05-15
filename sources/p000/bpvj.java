package p000;

/* renamed from: bpvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpvj extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bpvj f139363g;

    /* renamed from: h */
    private static volatile bxxk f139364h;

    /* renamed from: a */
    public int f139365a;

    /* renamed from: b */
    public String f139366b = "";

    /* renamed from: c */
    public long f139367c;

    /* renamed from: d */
    public long f139368d;

    /* renamed from: e */
    public long f139369e;

    /* renamed from: f */
    public String f139370f = "";

    static {
        bpvj bpvj = new bpvj();
        f139363g = bpvj;
        bxvk.m124024a(bpvj.class, bpvj);
    }

    private bpvj() {
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
            return bxvk.m124022a(f139363g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0002\u0003ဂ\u0003\u0004ဂ\u0004\u0007ဈ\u0007", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpvj();
        } else {
            if (i2 == 4) {
                return new bxvd(f139363g);
            }
            if (i2 == 5) {
                return f139363g;
            }
            bxxk bxxk = f139364h;
            if (bxxk == null) {
                synchronized (bpvj.class) {
                    bxxk = f139364h;
                    if (bxxk == null) {
                        bxxk = new bxve(f139363g);
                        f139364h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
