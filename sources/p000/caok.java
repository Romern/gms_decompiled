package p000;

/* renamed from: caok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caok extends caoi {

    /* renamed from: b */
    public final byte[] f175450b;

    /* renamed from: c */
    public final byte f175451c;

    /* renamed from: d */
    public final byte[] f175452d;

    /* renamed from: e */
    public final byte[] f175453e;

    /* renamed from: f */
    public final byte[] f175454f;

    /* renamed from: g */
    public final byte f175455g;

    /* renamed from: h */
    public final byte[] f175456h;

    /* renamed from: i */
    public byte[] f175457i;

    /* renamed from: j */
    public final byte f175458j;

    /* renamed from: k */
    public final byte[] f175459k;

    /* renamed from: l */
    public final byte[] f175460l;

    /* renamed from: m */
    private final caon f175461m;

    public caok(byte[] bArr, caom caom) {
        super(bArr);
        int i = this.f175447a;
        if (i != 6) {
            String a = caoh.m126870a(i);
            StringBuilder sb = new StringBuilder(a.length() + 38);
            sb.append("Expected a GENERATE AC C-APDU, found: ");
            sb.append(a);
            throw new capn(sb.toString());
        } else if (mo74722a() == -114 && mo74723b() == Byte.MIN_VALUE) {
            int length = bArr.length;
            if (bArr[length - 1] == 0) {
                byte b = bArr[4];
                if (length == b + 6) {
                    byte[] bArr2 = new byte[b];
                    this.f175460l = bArr2;
                    System.arraycopy(bArr, 5, bArr2, 0, b);
                    this.f175461m = caon.m126881a(caom, this.f175460l);
                    if (caom == null) {
                        throw new capp("ComputeCC C-APDU: Invalid UDOL list length");
                    } else if (caom.mo74726a() == b) {
                        this.f175454f = this.f175461m.mo74730a("9F6A");
                        this.f175451c = this.f175461m.mo74730a("9F7E")[0];
                        this.f175450b = this.f175461m.mo74730a("9F02");
                        this.f175453e = this.f175461m.mo74730a("5F2A");
                        this.f175452d = this.f175461m.mo74730a("9F1A");
                        this.f175458j = this.f175461m.mo74730a("9C")[0];
                        this.f175456h = this.f175461m.mo74730a("9A");
                        this.f175457i = this.f175461m.mo74730a("9F15");
                        this.f175455g = this.f175461m.mo74730a("9F35")[0];
                        this.f175459k = this.f175461m.mo74730a("9F1D");
                    } else {
                        throw new capp("ComputeCC C-APDU: Invalid UDOL list length");
                    }
                } else {
                    throw new capp("Invalid length (does not match LC)");
                }
            } else {
                throw new capn("Invalid LE value for the Compute CC C-APDU");
            }
        } else {
            byte a2 = mo74722a();
            byte b2 = mo74723b();
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("Invalid P1/P2 parameter: ");
            sb2.append((int) a2);
            sb2.append(", ");
            sb2.append((int) b2);
            throw new capq(sb2.toString());
        }
    }
}
