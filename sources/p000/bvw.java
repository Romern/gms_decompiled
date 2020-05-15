package p000;

/* renamed from: bvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvw extends bwz {

    /* renamed from: a */
    public static final byte[] f5818a = {-33, 33};

    /* renamed from: b */
    public static final bzx f5819b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f5820c;

    /* renamed from: d */
    public static final int f5821d = 3;

    /* renamed from: e */
    public static final int f5822e = 1;

    /* renamed from: f */
    public static final int f5823f = 2;

    /* renamed from: g */
    public static final int f5824g = 3;

    /* renamed from: h */
    public static final int f5825h = 5;

    /* renamed from: i */
    public static final int f5826i = 2;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Cryptogram Version Number";
        bzv.f6287b = "Interac proprietary data element indicating the version of the Application Cryptogram algorithm used by the application for InApp transaction. Transmitted in the Issuer Application Data.";
        bzv.f6293h = f5821d;
        bzv.f6294i = f5822e;
        bzv.f6290e = f5819b;
        bzv.f6289d = 1;
        bzv.f6288c = f5818a;
        bzv.f6295j = f5823f;
        bzv.f6296k = f5824g;
        bzv.f6297l = f5826i;
        bzv.f6298m = f5825h;
        f5820c = bzv.mo3629a();
    }

    public bvw(byte b) {
        super(new byte[]{b}, false, f5820c);
    }
}
