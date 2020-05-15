package p000;

/* renamed from: bjxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjxb {

    /* renamed from: a */
    public static final String[] f123551a = {"A0000000041010", "A00000000401", "A0000000042010", "A0000000042203", "A0000000043010", "A0000000044010", "A0000000045010", "A0000000043060", "A0000000050001", "A0000000101030", "A0000000031010", "A0000000032020", "A0000000032010", "A0000000033010", "A0000000034010", "A0000000035010", "A0000000038010", "A0000000039010", "A0000", "A000000025", "A00000006510"};

    /* renamed from: b */
    public static final String[] f123552b = {"315041592E5359532E4444463031", "325041592E5359532E4444463031"};

    /* renamed from: a */
    public static bjxd m104826a(byte b, byte b2, byte b3) {
        bjxc bjxc = new bjxc((byte) -78);
        bjxc.f123554b = b;
        bjxc.f123555c = (byte) ((b2 << 3) | 4);
        bjxc.mo65609a(b3);
        return bjxc.mo65608a();
    }

    /* renamed from: a */
    public static bjxd m104827a(String str) {
        bjxc bjxc = new bjxc((byte) -92);
        bjxc.f123554b = 4;
        bjxc.mo65610a(bjve.m104687a(str));
        bjxc.mo65609a((byte) 0);
        return bjxc.mo65608a();
    }

    /* renamed from: a */
    public static boolean m104828a(bjxf bjxf, byte[] bArr) {
        byte b = bjxf.f123566d;
        if (((b >>> 4) & 15) != bArr[0]) {
            return false;
        }
        int length = bArr.length;
        if (length >= 2 && (b & 15) != bArr[1]) {
            return false;
        }
        if (length < 3 || ((bjxf.f123567e >>> 4) & 15) == bArr[2]) {
            return length != 4 || (bjxf.f123567e & 15) == bArr[3];
        }
        return false;
    }
}
