package p000;

import java.util.Arrays;

/* renamed from: caoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caoo extends caoi {

    /* renamed from: b */
    public final byte[] f175466b;

    /* renamed from: c */
    public final byte[] f175467c;

    /* renamed from: d */
    public final byte[] f175468d;

    /* renamed from: e */
    public final byte[] f175469e;

    /* renamed from: f */
    public final byte[] f175470f;

    /* renamed from: g */
    public final byte[] f175471g;

    /* renamed from: h */
    public final byte[] f175472h;

    /* renamed from: i */
    public final byte[] f175473i;

    /* renamed from: j */
    public byte f175474j;

    /* renamed from: k */
    public final byte[] f175475k;

    /* renamed from: l */
    public final byte[] f175476l;

    /* renamed from: m */
    public final byte[] f175477m;

    /* renamed from: n */
    public final byte[] f175478n;

    /* renamed from: o */
    public final boolean f175479o;

    /* renamed from: p */
    public final boolean f175480p;

    /* renamed from: q */
    public final boolean f175481q;

    /* renamed from: r */
    public final boolean f175482r;

    public caoo(byte[] bArr) {
        super(bArr);
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.f175447a;
        if (i == 5) {
            byte a = mo74722a();
            if ((a & 15) == 0 && (a & -64) != -64 && mo74723b() == 0) {
                int length = bArr.length;
                if (bArr[length - 1] == 0) {
                    byte b = bArr[4];
                    if (b < 45) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Invalid LC for a GENERATE AC C-APDU: ");
                        sb.append((int) b);
                        throw new capp(sb.toString());
                    } else if (b + 6 == length) {
                        byte a2 = mo74722a();
                        byte b2 = a2 & -64;
                        boolean z4 = true;
                        if (b2 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.f175479o = z;
                        if (b2 == 64) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f175480p = z2;
                        if (b2 == Byte.MIN_VALUE) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.f175481q = z3;
                        this.f175482r = (a2 & 16) != 16 ? false : z4;
                        byte b3 = bArr[4];
                        byte[] bArr2 = new byte[b3];
                        this.f175466b = bArr2;
                        System.arraycopy(bArr, 5, bArr2, 0, b3);
                        this.f175467c = Arrays.copyOfRange(this.f175466b, 0, 6);
                        this.f175468d = Arrays.copyOfRange(this.f175466b, 6, 12);
                        this.f175469e = Arrays.copyOfRange(this.f175466b, 12, 14);
                        Arrays.copyOfRange(this.f175466b, 14, 19);
                        this.f175470f = Arrays.copyOfRange(this.f175466b, 19, 21);
                        this.f175471g = Arrays.copyOfRange(this.f175466b, 21, 24);
                        this.f175472h = Arrays.copyOfRange(this.f175466b, 24, 25);
                        this.f175473i = Arrays.copyOfRange(this.f175466b, 25, 29);
                        byte[] bArr3 = this.f175466b;
                        this.f175474j = bArr3[29];
                        this.f175475k = Arrays.copyOfRange(bArr3, 30, 32);
                        this.f175476l = Arrays.copyOfRange(this.f175466b, 32, 40);
                        this.f175477m = Arrays.copyOfRange(this.f175466b, 40, 43);
                        this.f175478n = Arrays.copyOfRange(this.f175466b, 43, 45);
                    } else {
                        throw new capp("Invalid GENERATE AC APDU length (does not match LC)");
                    }
                } else {
                    throw new capn("Invalid LE value for the GENERATE AC C-APDU");
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
        } else {
            String a4 = caoh.m126870a(i);
            StringBuilder sb3 = new StringBuilder(a4.length() + 38);
            sb3.append("Expected a GENERATE AC C-APDU, found: ");
            sb3.append(a4);
            throw new capn(sb3.toString());
        }
    }
}
