package p000;

/* renamed from: bzid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzid extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzid f170156d;

    /* renamed from: e */
    public static final bxvj f170157e;

    /* renamed from: f */
    private static volatile bxxk f170158f;

    /* renamed from: a */
    public int f170159a;

    /* renamed from: b */
    public bxwc f170160b = bxxn.f165040b;

    /* renamed from: c */
    public bziz f170161c;

    static {
        bzid bzid = new bzid();
        f170156d = bzid;
        GeneratedMessageLite.m124024a(bzid.class, bzid);
        blbz blbz = blbz.f125890a;
        bzid bzid2 = f170156d;
        f170157e = GeneratedMessageLite.m124006a(blbz, bzid2, bzid2, 64399324, bxzf.MESSAGE);
    }

    private bzid() {
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
            return GeneratedMessageLite.m124022a(f170156d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0000\u0003\u001b\u0004ဉ\u0002", new Object[]{"a", "b", bzhl.class, "c"});
        } else if (i2 == 3) {
            return new bzid();
        } else {
            if (i2 == 4) {
                return new bzic();
            }
            if (i2 == 5) {
                return f170156d;
            }
            bxxk bxxk = f170158f;
            if (bxxk == null) {
                synchronized (bzid.class) {
                    bxxk = f170158f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170156d);
                        f170158f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74548c() {
        if (!this.f170160b.mo73666a()) {
            this.f170160b = GeneratedMessageLite.m124021a(this.f170160b);
        }
    }
}
