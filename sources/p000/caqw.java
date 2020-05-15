package p000;

import java.util.Arrays;

/* renamed from: caqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caqw {

    /* renamed from: a */
    public static final byte[] f175624a = catg.m127160a("0000000000F0");

    /* renamed from: b */
    public static final byte[] f175625b = catg.m127160a("000000000F0E");

    /* renamed from: c */
    public static final byte[] f175626c = catg.m127160a("04");

    /* renamed from: d */
    public static final byte[] f175627d = catg.m127160a("00F0");

    /* renamed from: e */
    public static final byte[] f175628e = catg.m127160a("0F0E");

    /* renamed from: f */
    public static final byte[] f175629f = catg.m127160a("04");

    /* renamed from: g */
    public final byte[] f175630g;

    /* renamed from: h */
    public final byte[] f175631h;

    /* renamed from: i */
    private final boolean f175632i;

    public caqw(casb casb, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z) {
        byte[] bArr4;
        String str;
        byte[] bArr5;
        byte[] bArr6;
        this.f175632i = z;
        if (casb != null) {
            carx[] carxArr = casb.f175731b;
            for (carx carx : carxArr) {
                if (carx.f175715a == 1 && carx.f175716b == 1 && (bArr4 = carx.f175717c) != null) {
                    catj a = catj.m127172a(bArr4);
                    if (a != null) {
                        catj a2 = catj.m127172a(a.mo74843a("70"));
                        if (a2 != null) {
                            byte[] a3 = a2.mo74843a("9F62");
                            byte[] a4 = a2.mo74843a("9F63");
                            byte[] a5 = a2.mo74843a("9F64");
                            byte[] a6 = a2.mo74843a("9F65");
                            byte[] a7 = a2.mo74843a("9F66");
                            byte[] a8 = a2.mo74843a("9F67");
                            if (Arrays.equals(a3, f175624a) && Arrays.equals(a4, f175625b) && Arrays.equals(a5, f175626c) && Arrays.equals(a6, f175627d) && Arrays.equals(a7, f175628e) && Arrays.equals(a8, f175629f)) {
                                if (!this.f175632i) {
                                    str = "3";
                                } else {
                                    str = "8";
                                }
                                String a9 = m126998a(bArr);
                                String a10 = m126998a(bArr2);
                                String substring = new String(boan.f132472f.mo68794a(bArr3)).substring(5, 8);
                                StringBuilder sb = new StringBuilder(String.valueOf(a9).length() + 2 + String.valueOf(a10).length() + String.valueOf(substring).length() + str.length());
                                sb.append("0");
                                sb.append(a9);
                                sb.append(a10);
                                sb.append(substring);
                                sb.append(str);
                                sb.append("F");
                                String sb2 = sb.toString();
                                byte[] a11 = a2.mo74843a("56");
                                byte[] a12 = a2.mo74843a("9F6B");
                                if (a11 == null) {
                                    bArr5 = new byte[0];
                                } else {
                                    String str2 = new String(a11);
                                    String valueOf = String.valueOf(str2.substring(0, str2.lastIndexOf("^") + 9));
                                    String valueOf2 = String.valueOf(sb2.substring(1, 13));
                                    bArr5 = (valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)).getBytes();
                                }
                                this.f175630g = bArr5;
                                if (a12 != null) {
                                    String valueOf3 = String.valueOf(catg.m127164b(a12).substring(0, catg.m127164b(a12).indexOf(68) + 8));
                                    String valueOf4 = String.valueOf(sb2);
                                    String str3 = valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4);
                                    bArr6 = (str3.length() % 2 != 0 ? str3.substring(0, str3.length() - 1) : str3).getBytes();
                                } else {
                                    bArr6 = new byte[0];
                                }
                                this.f175631h = bArr6;
                                return;
                            }
                        }
                        throw new capg("Data in profile does not match standard MCBP 1.0 bitmaps");
                    }
                    throw new capg("Invalid profile data");
                }
            }
            throw new capg("Unable to retrieve Record 1 1 for transaction id");
        }
        throw new capk("Invalid profile information");
    }

    /* renamed from: a */
    private static final String m126998a(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return "0000";
        }
        String valueOf = String.valueOf(Long.valueOf(new String(boan.f132472f.mo68794a(bArr)), 16).toString());
        String str = valueOf.length() == 0 ? new String("0000") : "0000".concat(valueOf);
        return str.substring(str.length() - 4);
    }
}
