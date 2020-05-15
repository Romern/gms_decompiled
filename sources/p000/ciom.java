package p000;

/* renamed from: ciom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciom extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final ciom f191083k;

    /* renamed from: l */
    private static volatile bxxk f191084l;

    /* renamed from: a */
    public int f191085a;

    /* renamed from: b */
    public long f191086b;

    /* renamed from: c */
    public long f191087c;

    /* renamed from: d */
    public long f191088d;

    /* renamed from: e */
    public long f191089e;

    /* renamed from: f */
    public long f191090f;

    /* renamed from: g */
    public long f191091g;

    /* renamed from: h */
    public long f191092h;

    /* renamed from: i */
    public long f191093i;

    /* renamed from: j */
    public bxwc f191094j = bxxn.f165040b;

    static {
        ciom ciom = new ciom();
        f191083k = ciom;
        GeneratedMessageLite.m124024a(ciom.class, ciom);
    }

    private ciom() {
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
            return GeneratedMessageLite.m124022a(f191083k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\n\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", ciol.class});
        } else if (i2 == 3) {
            return new ciom();
        } else {
            if (i2 == 4) {
                return new ciok();
            }
            if (i2 == 5) {
                return f191083k;
            }
            bxxk bxxk = f191084l;
            if (bxxk == null) {
                synchronized (ciom.class) {
                    bxxk = f191084l;
                    if (bxxk == null) {
                        bxxk = new bxve(f191083k);
                        f191084l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo86264c() {
        if (!this.f191094j.mo73666a()) {
            this.f191094j = GeneratedMessageLite.m124021a(this.f191094j);
        }
    }
}
