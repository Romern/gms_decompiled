package p000;

import java.io.ByteArrayOutputStream;

/* renamed from: xjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xjj {

    /* renamed from: h */
    private static final sek f52416h = new sek(new String[]{"CtapBleFrameAssembler"}, (short[]) null);

    /* renamed from: a */
    public byte f52417a = 0;

    /* renamed from: b */
    public Byte f52418b = null;

    /* renamed from: c */
    private final int f52419c;

    /* renamed from: d */
    private ByteArrayOutputStream f52420d = null;

    /* renamed from: e */
    private int f52421e = 0;

    /* renamed from: f */
    private int f52422f = 0;

    /* renamed from: g */
    private boolean f52423g = false;

    public xjj(int i) {
        this.f52419c = i;
    }

    /* renamed from: a */
    public final boolean mo29838a() {
        ByteArrayOutputStream byteArrayOutputStream = this.f52420d;
        return byteArrayOutputStream != null && byteArrayOutputStream.size() == this.f52421e;
    }

    /* renamed from: b */
    public final byte[] mo29840b() {
        if (!mo29838a()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = this.f52420d;
        bmxy.m108581a(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(int, int):int}
     arg types: [byte, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int} */
    /* renamed from: a */
    public final boolean mo29839a(byte[] bArr) {
        bmxy.m108581a(bArr);
        Byte b = this.f52418b;
        if (b != null) {
            f52416h.mo25418e("Cannot add fragment: already failed with error %s.", b);
        } else {
            int length = bArr.length;
            if (length == 0) {
                f52416h.mo25418e("Fragment cannot be empty.", new Object[0]);
                this.f52418b = Byte.MAX_VALUE;
            } else {
                if (length >= 4) {
                    byte b2 = bArr[0];
                    if (((b2 >> 7) & 1) == 1) {
                        if (this.f52423g) {
                            f52416h.mo25418e("Received init fragment but frame already started.", new Object[0]);
                            this.f52418b = (byte) 4;
                        } else {
                            if (!(b2 == -66 || b2 == -65)) {
                                switch (b2) {
                                    case -127:
                                    case -126:
                                    case -125:
                                    case -124:
                                        break;
                                    default:
                                        f52416h.mo25418e("Request is not initialization fragment, invalid command: %s", Byte.valueOf(bArr[0]));
                                        this.f52418b = (byte) 1;
                                        break;
                                }
                            }
                            this.f52417a = b2;
                            byte b3 = (bArr[1] << 8) | (bArr[2] & 255);
                            this.f52421e = b3;
                            int i = length - 3;
                            if (i > b3) {
                                f52416h.mo25418e("Data length of init fragment (%s) is longer than header length (%s).", Integer.valueOf(i), Integer.valueOf(this.f52421e));
                                this.f52418b = (byte) 3;
                            } else {
                                int min = Math.min((int) b3, this.f52419c - 3);
                                if (i != min) {
                                    f52416h.mo25418e("Unexpected init fragment data length (%s != %s)", Integer.valueOf(i), Integer.valueOf(min));
                                    this.f52418b = (byte) 3;
                                } else {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.f52421e);
                                    this.f52420d = byteArrayOutputStream;
                                    byteArrayOutputStream.write(bArr, 3, i);
                                    this.f52423g = true;
                                }
                            }
                        }
                    }
                }
                if (length < 2 || (bArr[0] >> 7) != 0) {
                    f52416h.mo25418e("Invalid fragment value: 0x%s is neither an initialization nor continuation fragment.", boan.f132472f.mo68794a(bArr));
                    this.f52418b = Byte.MAX_VALUE;
                } else if (this.f52423g) {
                    ByteArrayOutputStream byteArrayOutputStream2 = this.f52420d;
                    bmxy.m108581a(byteArrayOutputStream2);
                    byte b4 = bArr[0];
                    int i2 = this.f52422f;
                    if (b4 != i2) {
                        f52416h.mo25418e("Expected seqno %s, but received %s", Integer.valueOf(i2), Byte.valueOf(bArr[0]));
                        this.f52418b = (byte) 4;
                    } else {
                        int i3 = length - 1;
                        int min2 = Math.min(this.f52421e - byteArrayOutputStream2.size(), this.f52419c - 1);
                        if (i3 != min2) {
                            f52416h.mo25418e("Unexpected cont fragment data length (%s != %s)", Integer.valueOf(i3), Integer.valueOf(min2));
                            this.f52418b = (byte) 3;
                        } else {
                            byteArrayOutputStream2.write(bArr, 1, i3);
                            this.f52422f = (this.f52422f + 1) % 128;
                        }
                    }
                } else {
                    f52416h.mo25418e("Received continuation fragment before init fragment.", new Object[0]);
                    this.f52418b = (byte) 1;
                }
            }
        }
        return this.f52418b == null;
    }
}
