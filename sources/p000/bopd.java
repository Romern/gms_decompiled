package p000;

/* renamed from: bopd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bopd extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bopd f134098i;

    /* renamed from: j */
    private static volatile bxxk f134099j;

    /* renamed from: a */
    public long f134100a;

    /* renamed from: b */
    public String f134101b = "";

    /* renamed from: c */
    public String f134102c = "";

    /* renamed from: d */
    public String f134103d = "";

    /* renamed from: e */
    public boolean f134104e;

    /* renamed from: f */
    public int f134105f;

    /* renamed from: g */
    public long f134106g;

    /* renamed from: h */
    public bxwc f134107h = bxxn.f165040b;

    static {
        bopd bopd = new bopd();
        f134098i = bopd;
        bxvk.m124024a(bopd.class, bopd);
    }

    private bopd() {
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
            return bxvk.m124022a(f134098i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006\f\u0007\u0002\b\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", boow.class});
        } else if (i2 == 3) {
            return new bopd();
        } else {
            if (i2 == 4) {
                return new bopc();
            }
            if (i2 == 5) {
                return f134098i;
            }
            bxxk bxxk = f134099j;
            if (bxxk == null) {
                synchronized (bopd.class) {
                    bxxk = f134099j;
                    if (bxxk == null) {
                        bxxk = new bxve(f134098i);
                        f134099j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
