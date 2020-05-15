package p000;

/* renamed from: bwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwl extends bwz {

    /* renamed from: a */
    public static final byte[] f5899a = {-97, 89};

    /* renamed from: b */
    public static final bzx f5900b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f5901c;

    /* renamed from: d */
    public static final int f5902d = 3;

    /* renamed from: e */
    public static final int f5903e = 2;

    /* renamed from: f */
    public static final int f5904f = 2;
    private static final long serialVersionUID = 1;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Terminal Transaction Information";
        bzv.f6287b = "";
        bzv.f6293h = f5902d;
        bzv.f6289d = 3;
        bzv.f6294i = f5903e;
        bzv.f6288c = f5899a;
        bzv.f6290e = f5900b;
        bzv.f6295j = f5904f;
        f5901c = bzv.mo3629a();
    }

    public bwl(byte[] bArr) {
        super(bArr, f5901c);
    }

    /* renamed from: aP */
    public final void mo3547aP() {
    }

    /* renamed from: b */
    public final boolean mo3454b() {
        return mo3555a(0, 2);
    }

    public final String toString() {
        return cbm.m3893a(this.f5930l) + "\nByte 1\nbit 8: " + mo3558c(0) + " = RFU\nbit 7: " + mo3558c(1) + " = RFU\nbit 6: " + mo3558c(2) + " = RFU\nbit 5: " + mo3558c(4) + " =  CDA " + mo3559d(4) + "supported\nbit 4: " + mo3558c(3) + " =  Offline " + mo3559d(3) + "supported\nbit 3: " + mo3558c(5) + " = RFU\nbit 2: " + mo3558c(6) + " = RFU\nbit 1: " + mo3558c(7) + " = RFU\nByte 2\nbit 8: " + mo3558c(8) + " = RFU\nbit 7: " + mo3558c(9) + " = RFU\nbit 6: " + mo3558c(10) + " = RFU\nbit 5: " + mo3558c(4) + " = Mobile NFC device" + mo3559d(4) + "accepted\nbit 4: " + mo3558c(12) + " = RFU\nbit 3: " + mo3558c(13) + " = RFU\nbit 2: " + mo3558c(14) + " = RFU\nbit 1: " + mo3558c(15) + " = RFU\nByte 3\nbits 8-1: RFU (00000000)\n";
    }
}
