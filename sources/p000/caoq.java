package p000;

/* renamed from: caoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caoq extends caoi {

    /* renamed from: b */
    public final byte[] f175497b;

    /* renamed from: c */
    public final byte[] f175498c;

    /* renamed from: d */
    public final byte[] f175499d;

    /* renamed from: e */
    private final byte f175500e;

    /* renamed from: f */
    private final byte f175501f;

    /* renamed from: g */
    private final caon f175502g;

    public caoq(byte[] bArr, caom caom) {
        super(bArr);
        int i = this.f175447a;
        if (i != 3) {
            String a = caoh.m126870a(i);
            StringBuilder sb = new StringBuilder(a.length() + 30);
            sb.append("Expected a GPO C-APDU, found: ");
            sb.append(a);
            throw new capn(sb.toString());
        } else if (mo74722a() == 0 && mo74723b() == 0) {
            int length = bArr.length;
            if (bArr[length - 1] == 0) {
                byte b = bArr[4];
                this.f175500e = b;
                if (b + 6 == length) {
                    byte[] bArr2 = new byte[b];
                    byte b2 = 0;
                    System.arraycopy(bArr, 5, bArr2, 0, b);
                    if (bArr2[0] == -125) {
                        byte b3 = bArr2[1];
                        int i2 = this.f175500e - 2;
                        if (b3 == i2) {
                            byte[] bArr3 = new byte[i2];
                            this.f175499d = bArr3;
                            System.arraycopy(bArr2, 2, bArr3, 0, i2);
                            this.f175502g = caon.m126881a(caom, this.f175499d);
                            if (caom == null) {
                                throw new capp("GPO C-APDU: Invalid PDOL list length");
                            } else if (caom.mo74726a() == bArr2[1]) {
                                byte[] a2 = this.f175502g.mo74730a("9F35");
                                if (!(a2 == null || a2.length == 0)) {
                                    b2 = a2[0];
                                }
                                this.f175501f = b2;
                                this.f175497b = this.f175502g.mo74730a("9F1D");
                                this.f175498c = this.f175502g.mo74730a("9F1A");
                                if (catg.m127158a(this.f175501f)) {
                                    throw new capl("Terminal is OffLine only");
                                }
                            } else {
                                throw new capp("GPO C-APDU: Invalid PDOL list length");
                            }
                        } else {
                            throw new capp("GPO C-APDU: Invalid C-DATA Length");
                        }
                    } else {
                        throw new capl("GPO C-APDU: Invalid C-DATA Tag");
                    }
                } else {
                    throw new capp("Invalid ComputeCC C-APDU length (does not match LC info)");
                }
            } else {
                throw new capn("Invalid LE value for the GPO C-APDU");
            }
        } else {
            byte a3 = mo74722a();
            byte b4 = mo74723b();
            StringBuilder sb2 = new StringBuilder(34);
            sb2.append("Invalid P1 or P2 value: ");
            sb2.append((int) a3);
            sb2.append(", ");
            sb2.append((int) b4);
            throw new capq(sb2.toString());
        }
    }
}
