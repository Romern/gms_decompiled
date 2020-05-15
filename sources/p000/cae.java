package p000;

/* renamed from: cae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cae extends bwz {

    /* renamed from: a */
    public static final byte[] f6331a = {-97, 53};

    /* renamed from: b */
    public static final bzx f6332b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f6333c;

    /* renamed from: d */
    public static final int f6334d = 1;

    /* renamed from: e */
    public static final int f6335e = 2;

    /* renamed from: f */
    public static final int f6336f = 2;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Terminal Type";
        bzv.f6287b = "Indicates the environment of the terminal, its communication capability, and\nits operational control";
        bzv.f6293h = f6334d;
        bzv.f6294i = f6335e;
        bzv.f6290e = f6332b;
        bzv.f6288c = f6331a;
        bzv.f6289d = 1;
        bzv.f6295j = f6336f;
        f6333c = bzv.mo3629a();
    }

    public cae(byte[] bArr) {
        super(bArr, f6333c);
    }

    /* renamed from: b */
    public final boolean mo3454b() {
        return (mo3550a(0) & 15) == 3 || (mo3550a(0) & 15) == 6;
    }
}
