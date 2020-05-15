package p000;

/* renamed from: caoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class caoi {

    /* renamed from: a */
    public final int f175447a;

    /* renamed from: b */
    private final byte[] f175448b;

    protected caoi(byte[] bArr) {
        this.f175447a = m126871a(bArr);
        this.f175448b = bArr;
    }

    /* renamed from: a */
    public static int m126871a(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            throw new capn("Invalid C-APDU");
        }
        byte b = bArr[0];
        byte b2 = bArr[1];
        if (b2 != -92) {
            if (b2 != -88) {
                if (b2 != -82) {
                    if (b2 != -78) {
                        if (b2 != 42) {
                            throw new capo("C-APDU - Instruction Code not supported");
                        } else if (b == Byte.MIN_VALUE) {
                            return 6;
                        } else {
                            throw new capm("C-APDU - Class not supported");
                        }
                    } else if (b == 0) {
                        return 4;
                    } else {
                        throw new capm("C-APDU - Class not supported");
                    }
                } else if (b == Byte.MIN_VALUE) {
                    return 5;
                } else {
                    throw new capm("C-APDU - Class not supported");
                }
            } else if (b == Byte.MIN_VALUE) {
                return 3;
            } else {
                throw new capm("C-APDU - Class not supported");
            }
        } else if (b == 0) {
            return 2;
        } else {
            throw new capm("C-APDU - Class not supported");
        }
    }

    /* renamed from: b */
    public final byte mo74723b() {
        return this.f175448b[3];
    }

    public caoi(byte[] bArr, byte[] bArr2) {
        this(bArr);
        int i = this.f175447a;
        if (i != 4) {
            String a = caoh.m126870a(i);
            StringBuilder sb = new StringBuilder(a.length() + 36);
            sb.append("Expected a READ_RECORD APDU, found: ");
            sb.append(a);
            throw new capn(sb.toString());
        } else if (mo74722a() == 0) {
            byte a2 = mo74722a();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Invalid Record Number - invalid P1: ");
            sb2.append((int) a2);
            throw new capq(sb2.toString());
        } else if ((mo74723b() & 7) == 4) {
            byte b = bArr[4];
            if (b != 0) {
                StringBuilder sb3 = new StringBuilder(22);
                sb3.append("Invalid LE field: ");
                sb3.append((int) b);
                throw new capn(sb3.toString());
            }
        } else {
            byte b2 = mo74723b();
            StringBuilder sb4 = new StringBuilder(38);
            sb4.append("SFI value malformed - invalid P2: ");
            sb4.append((int) b2);
            throw new capr(sb4.toString());
        }
    }

    /* renamed from: a */
    public final byte mo74722a() {
        return this.f175448b[2];
    }
}
