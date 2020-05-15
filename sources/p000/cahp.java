package p000;

/* renamed from: cahp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cahp extends bxvk implements bxxd {

    /* renamed from: m */
    public static final cahp f174572m;

    /* renamed from: n */
    private static volatile bxxk f174573n;

    /* renamed from: a */
    public int f174574a;

    /* renamed from: b */
    public String f174575b = "";

    /* renamed from: c */
    public int f174576c;

    /* renamed from: d */
    public bxwc f174577d = bxxn.f165040b;

    /* renamed from: e */
    public bxvt f174578e;

    /* renamed from: f */
    public String f174579f;

    /* renamed from: g */
    public String f174580g;

    /* renamed from: h */
    public long f174581h;

    /* renamed from: i */
    public long f174582i;

    /* renamed from: j */
    public int f174583j;

    /* renamed from: k */
    public String f174584k;

    /* renamed from: l */
    public int f174585l;

    static {
        cahp cahp = new cahp();
        f174572m = cahp;
        bxvk.m124024a(cahp.class, cahp);
    }

    private cahp() {
        bxvm bxvm = bxvm.f164965b;
        this.f174578e = bxvm.f164965b;
        this.f174579f = "";
        this.f174580g = "";
        this.f174584k = "";
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
            return bxvk.m124022a(f174572m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001a\u0005\u0016\u0006ဈ\u0002\u0007ဈ\u0003\bဂ\u0004\tင\u0006\nဈ\u0007\u000bင\b\fဂ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "i"});
        } else if (i2 == 3) {
            return new cahp();
        } else {
            if (i2 == 4) {
                return new caho();
            }
            if (i2 == 5) {
                return f174572m;
            }
            bxxk bxxk = f174573n;
            if (bxxk == null) {
                synchronized (cahp.class) {
                    bxxk = f174573n;
                    if (bxxk == null) {
                        bxxk = new bxve(f174572m);
                        f174573n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74648c() {
        if (!this.f174577d.mo73666a()) {
            this.f174577d = bxvk.m124021a(this.f174577d);
        }
    }
}
