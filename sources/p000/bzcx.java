package p000;

/* renamed from: bzcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzcx extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bzcx f169429h;

    /* renamed from: k */
    private static volatile bxxk f169430k;

    /* renamed from: a */
    public int f169431a;

    /* renamed from: b */
    public bxwc f169432b = bxxn.f165040b;

    /* renamed from: c */
    public String f169433c = "";

    /* renamed from: d */
    public bxvw f169434d = bxwq.f165002b;

    /* renamed from: e */
    public long f169435e;

    /* renamed from: f */
    public bzdh f169436f;

    /* renamed from: g */
    public long f169437g;

    /* renamed from: i */
    private boolean f169438i;

    /* renamed from: j */
    private bxww f169439j = bxww.f165013b;

    static {
        bzcx bzcx = new bzcx();
        f169429h = bzcx;
        GeneratedMessageLite.m124024a(bzcx.class, bzcx);
    }

    private bzcx() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125673a(bzcx bzcx) {
        bzcx.f169431a |= 2;
        bzcx.f169438i = true;
    }

    /* renamed from: c */
    public final void mo74538c() {
        if (!this.f169432b.mo73666a()) {
            this.f169432b = GeneratedMessageLite.m124021a(this.f169432b);
        }
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
            return GeneratedMessageLite.m124022a(f169429h, "\u0001\b\u0000\u0001\u0001\n\b\u0001\u0002\u0000\u0001\u001b\u0002ဈ\u0000\u0003\u0014\u0004ဇ\u0001\u00072\bဂ\u0003\tဉ\u0004\nဂ\u0005", new Object[]{"a", "b", bzcu.class, "c", "d", "i", "j", bzcw.f169428a, "e", "f", "g"});
        } else if (i2 == 3) {
            return new bzcx();
        } else {
            if (i2 == 4) {
                return new bzcv();
            }
            if (i2 == 5) {
                return f169429h;
            }
            bxxk bxxk = f169430k;
            if (bxxk == null) {
                synchronized (bzcx.class) {
                    bxxk = f169430k;
                    if (bxxk == null) {
                        bxxk = new bxve(f169429h);
                        f169430k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
