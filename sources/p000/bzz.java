package p000;

/* renamed from: bzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bzz extends bwz {

    /* renamed from: a */
    public static final byte[] f6308a = {-97, 3};

    /* renamed from: b */
    public static final bzx f6309b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f6310c;

    /* renamed from: d */
    public static final int f6311d = 3;

    /* renamed from: e */
    public static final int f6312e = 2;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Amount, Other";
        bzv.f6287b = "Secondary amount associated with the transaction representing a cashback amount";
        bzv.f6293h = f6311d;
        bzv.f6294i = f6312e;
        bzv.f6290e = f6309b;
        bzv.f6288c = f6308a;
        bzv.f6289d = 6;
        f6310c = bzv.mo3629a();
    }

    public bzz(byte[] bArr) {
        super(bArr, f6310c);
    }

    protected bzz(byte[] bArr, bzu bzu) {
        super(bArr, bzu);
    }
}
