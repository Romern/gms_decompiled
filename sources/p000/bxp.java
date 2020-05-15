package p000;

/* renamed from: bxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxp extends bwz implements Comparable {

    /* renamed from: a */
    public static final byte[] f6000a = {-97, 54};

    /* renamed from: b */
    public static final bzx f6001b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f6002c;

    /* renamed from: d */
    public static final int f6003d = 3;

    /* renamed from: e */
    public static final int f6004e = 1;

    /* renamed from: f */
    public static final int f6005f = 2;

    /* renamed from: g */
    public static final int f6006g = 4;

    /* renamed from: h */
    public static final int f6007h = 3;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Application Transaction Counter";
        bzv.f6287b = "Count of the number of transactions initiated since personalization. Maintained by the application in the card.";
        bzv.f6293h = f6003d;
        bzv.f6294i = f6004e;
        bzv.f6290e = f6001b;
        bzv.f6288c = f6000a;
        bzv.f6295j = f6005f;
        bzv.f6296k = f6006g;
        bzv.f6297l = 2;
        bzv.f6298m = f6007h;
        f6002c = bzv.mo3629a();
    }

    public bxp(byte[] bArr) {
        super(bArr, f6002c);
    }

    /* renamed from: aP */
    public final void mo3547aP() {
    }

    /* renamed from: b */
    public final int mo3454b() {
        return new cbj(mo3563i()).mo3652b();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.valueOf(mo3454b()).compareTo(Integer.valueOf(((bxp) obj).mo3454b()));
    }

    public bxp(byte[] bArr, byte[] bArr2) {
        super(bArr, false, f6002c);
    }
}
