package p000;

/* renamed from: btrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btrj extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final btrj f150104g;

    /* renamed from: h */
    private static volatile bxxk f150105h;

    /* renamed from: a */
    public String f150106a = "";

    /* renamed from: b */
    public String f150107b = "";

    /* renamed from: c */
    public btrc f150108c;

    /* renamed from: d */
    public boolean f150109d;

    /* renamed from: e */
    public boolean f150110e;

    /* renamed from: f */
    public int f150111f;

    static {
        btrj btrj = new btrj();
        f150104g = btrj;
        GeneratedMessageLite.m124024a(btrj.class, btrj);
    }

    private btrj() {
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
            return GeneratedMessageLite.m124022a(f150104g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0007\u0004\u0007\u0005\f\u0006Ȉ", new Object[]{"a", "c", "d", "e", "f", "b"});
        } else if (i2 == 3) {
            return new btrj();
        } else {
            if (i2 == 4) {
                return new bxvd(f150104g);
            }
            if (i2 == 5) {
                return f150104g;
            }
            bxxk bxxk = f150105h;
            if (bxxk == null) {
                synchronized (btrj.class) {
                    bxxk = f150105h;
                    if (bxxk == null) {
                        bxxk = new bxve(f150104g);
                        f150105h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
