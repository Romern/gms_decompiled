package p000;

/* renamed from: cadp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cadp extends GeneratedMessageLite implements cadq {

    /* renamed from: f */
    public static final cadp f172710f;

    /* renamed from: g */
    private static volatile bxxk f172711g;

    /* renamed from: a */
    public int f172712a;

    /* renamed from: b */
    public caae f172713b;

    /* renamed from: c */
    public bxwc f172714c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f172715d = bxxn.f165040b;

    /* renamed from: e */
    public boolean f172716e;

    static {
        cadp cadp = new cadp();
        f172710f = cadp;
        GeneratedMessageLite.m124024a(cadp.class, cadp);
    }

    private cadp() {
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
            return GeneratedMessageLite.m124022a(f172710f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0002\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဇ\u0002\u0005\u001c", new Object[]{"a", "b", "c", cadn.class, "e", "d"});
        } else if (i2 == 3) {
            return new cadp();
        } else {
            if (i2 == 4) {
                return new cado();
            }
            if (i2 == 5) {
                return f172710f;
            }
            bxxk bxxk = f172711g;
            if (bxxk == null) {
                synchronized (cadp.class) {
                    bxxk = f172711g;
                    if (bxxk == null) {
                        bxxk = new bxve(f172710f);
                        f172711g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74621c() {
        if (!this.f172714c.mo73666a()) {
            this.f172714c = GeneratedMessageLite.m124021a(this.f172714c);
        }
    }

    /* renamed from: n */
    public final boolean mo74619n() {
        return (this.f172712a & 2) != 0;
    }

    /* renamed from: o */
    public final caae mo74620o() {
        caae caae = this.f172713b;
        return caae == null ? caae.f172323i : caae;
    }
}
