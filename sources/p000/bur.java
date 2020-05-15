package p000;

/* renamed from: bur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bur extends bwz {

    /* renamed from: a */
    public static final byte[] f5687a = {0, 0};

    /* renamed from: b */
    public static final byte[] f5688b = {-97, 113};

    /* renamed from: c */
    public static final bzx f5689c = bzx.BOTH;

    /* renamed from: d */
    public static final bzu f5690d;

    /* renamed from: e */
    public static final int f5691e = 3;

    /* renamed from: f */
    public static final int f5692f = 1;

    /* renamed from: g */
    public static final int f5693g = 2;

    /* renamed from: h */
    public static final int f5694h = 6;

    /* renamed from: i */
    public static final int f5695i = 5;

    /* renamed from: j */
    public static final int f5696j = 2;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Mobile Status Indicator";
        bzv.f6287b = "The Mobile Status Indicator (MSI) is set internally by the MDA during contactless and contact\n(Management) transactions. This value can be read by the handset application using the\nGET DATA command by passing the MSI tag 9F 71 in the P1and P2 parameter fields of the\ncommand";
        bzv.f6293h = f5691e;
        bzv.f6294i = f5692f;
        bzv.f6288c = f5688b;
        bzv.f6290e = f5689c;
        bzv.f6288c = f5688b;
        bzv.f6289d = 2;
        bzv.f6295j = f5693g;
        bzv.f6296k = f5694h;
        bzv.f6297l = f5696j;
        bzv.f6298m = f5695i;
        f5690d = bzv.mo3629a();
    }

    public bur(byte[] bArr) {
        super(bArr, f5690d);
    }

    /* renamed from: a */
    public final void mo3527a(boolean z) {
        mo3551a(0, 1, z);
    }

    /* renamed from: b */
    public final boolean mo3454b() {
        return mo3555a(0, 1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bwz.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      bwz.a(byte[], int, int):void
      bwz.a(int, int, boolean):void */
    /* renamed from: c */
    public final void mo3529c() {
        mo3551a(1, 3, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bwz.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      bwz.a(byte[], int, int):void
      bwz.a(int, int, boolean):void */
    /* renamed from: d */
    public final void mo3530d() {
        mo3551a(1, 1, true);
    }

    /* renamed from: a */
    public final boolean mo3528a() {
        return mo3555a(0, 3);
    }
}
