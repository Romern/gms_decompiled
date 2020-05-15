package p000;

/* renamed from: cai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cai extends bwz {

    /* renamed from: a */
    public static final byte[] f6353a = {-100};

    /* renamed from: b */
    public static final bzx f6354b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f6355c;

    /* renamed from: d */
    public static final int f6356d = 3;

    /* renamed from: e */
    public static final int f6357e = 2;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Transaction Type";
        bzv.f6287b = "Indicates the type of financial transaction, represented by the first two digits of the ISO 8583:1987 Processing Code. The actual values to be used for the Transaction Type data element are defined by the relevant payment system";
        bzv.f6293h = f6356d;
        bzv.f6294i = f6357e;
        bzv.f6290e = f6354b;
        bzv.f6288c = f6353a;
        bzv.f6289d = 1;
        f6355c = bzv.mo3629a();
    }

    public cai(byte[] bArr) {
        super(bArr, f6355c);
    }
}
