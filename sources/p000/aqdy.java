package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: aqdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqdy extends bxvk implements bxxd {

    /* renamed from: k */
    public static final aqdy f85813k;

    /* renamed from: m */
    private static volatile bxxk f85814m;

    /* renamed from: a */
    public int f85815a;

    /* renamed from: b */
    public String f85816b = "";

    /* renamed from: c */
    public bxtx f85817c = bxtx.f164797b;

    /* renamed from: d */
    public int f85818d;

    /* renamed from: e */
    public String f85819e = "";

    /* renamed from: f */
    public String f85820f = "";

    /* renamed from: g */
    public boolean f85821g;

    /* renamed from: h */
    public boolean f85822h;

    /* renamed from: i */
    public boolean f85823i;

    /* renamed from: j */
    public boolean f85824j;

    /* renamed from: l */
    private boolean f85825l;

    static {
        aqdy aqdy = new aqdy();
        f85813k = aqdy;
        bxvk.m124024a(aqdy.class, aqdy);
    }

    private aqdy() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m71415a(aqdy aqdy) {
        aqdy.f85815a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        aqdy.f85825l = true;
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
            return bxvk.m124022a(f85813k, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t", new Object[]{"a", "b", "c", "d", aqdx.f85812a, "e", "f", "g", "h", "i", "l", "j"});
        } else if (i2 == 3) {
            return new aqdy();
        } else {
            if (i2 == 4) {
                return new bxvd(f85813k);
            }
            if (i2 == 5) {
                return f85813k;
            }
            bxxk bxxk = f85814m;
            if (bxxk == null) {
                synchronized (aqdy.class) {
                    bxxk = f85814m;
                    if (bxxk == null) {
                        bxxk = new bxve(f85813k);
                        f85814m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
