package p000;

/* renamed from: cag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cag extends bwz {

    /* renamed from: c */
    public static final byte[] f6343c = {95, 42};

    /* renamed from: d */
    public static final bzx f6344d = bzx.BOTH;

    /* renamed from: e */
    public static final bzu f6345e;

    /* renamed from: f */
    public static final int f6346f = 3;

    /* renamed from: g */
    public static final int f6347g = 2;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Transaction Currency Code";
        bzv.f6287b = "Indicates the currency code of the transaction according to ISO 4217";
        bzv.f6293h = f6346f;
        bzv.f6294i = f6347g;
        bzv.f6290e = f6344d;
        bzv.f6288c = f6343c;
        bzv.f6289d = 2;
        f6345e = bzv.mo3629a();
    }

    public cag(byte[] bArr) {
        super(bArr, true, f6345e);
    }

    protected cag(byte[] bArr, bzu bzu) {
        super(bArr, true, bzu);
    }
}
