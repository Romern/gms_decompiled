package p000;

/* renamed from: caos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caos extends caoi {

    /* renamed from: b */
    public final byte[] f175503b;

    public caos(byte[] bArr) {
        super(bArr);
        int i = this.f175447a;
        if (i != 2) {
            String a = caoh.m126870a(i);
            StringBuilder sb = new StringBuilder(a.length() + 33);
            sb.append("Expected a SELECT C-APDU, found: ");
            sb.append(a);
            throw new capn(sb.toString());
        } else if (mo74722a() == 4 && mo74723b() == 0) {
            int length = bArr.length;
            if (bArr[length - 1] == 0) {
                int i2 = bArr[4] & 255;
                if (i2 < 5 || i2 > 16) {
                    StringBuilder sb2 = new StringBuilder(43);
                    sb2.append("Invalid LC for a SELECT C-APDU: ");
                    sb2.append(i2);
                    throw new capp(sb2.toString());
                } else if (i2 + 6 == length) {
                    byte[] bArr2 = new byte[i2];
                    this.f175503b = bArr2;
                    System.arraycopy(bArr, 5, bArr2, 0, i2);
                } else {
                    throw new capp("Invalid SELECT APDU length (does not match LC info)");
                }
            } else {
                throw new capn("Invalid LE value for the SELECT C-APDU");
            }
        } else {
            byte a2 = mo74722a();
            byte b = mo74723b();
            StringBuilder sb3 = new StringBuilder(34);
            sb3.append("Invalid P1 or P2 value: ");
            sb3.append((int) a2);
            sb3.append(", ");
            sb3.append((int) b);
            throw new capq(sb3.toString());
        }
    }
}
