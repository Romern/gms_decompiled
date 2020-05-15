package p000;

/* renamed from: buy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buy extends bwz {

    /* renamed from: a */
    public static final byte[] f5751a = {-33, 27};

    /* renamed from: b */
    public static final byte[] f5752b = {0, 0};

    /* renamed from: c */
    public static final bzx f5753c = bzx.BOTH;

    /* renamed from: d */
    public static final bzu f5754d;

    /* renamed from: e */
    public static final int f5755e = 1;

    /* renamed from: f */
    public static final int f5756f = 1;

    /* renamed from: g */
    public static final int f5757g = 3;

    /* renamed from: h */
    public static final int f5758h = 3;

    /* renamed from: i */
    public static final int f5759i = 5;

    /* renamed from: j */
    public static final int f5760j = 1;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Multicurrency Unauthenticated Counter";
        bzv.f6287b = "Tracks number of transactions not in Issuer currency since last successful Passcode check.  Counter stored incard's riscManagement and reset after successful passcode validation";
        bzv.f6293h = f5755e;
        bzv.f6294i = f5756f;
        bzv.f6290e = f5753c;
        bzv.f6289d = 2;
        bzv.f6288c = f5751a;
        bzv.f6295j = f5757g;
        bzv.f6296k = f5758h;
        bzv.f6297l = f5760j;
        bzv.f6298m = f5759i;
        f5754d = bzv.mo3629a();
    }

    public buy(byte[] bArr) {
        super(bArr, f5754d);
    }

    /* renamed from: a */
    public final void mo3531a() {
        super.mo3553a(f5752b);
    }

    /* renamed from: b */
    public final long mo3454b() {
        try {
            return Long.parseLong(cbm.m3893a(mo3563i()));
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
