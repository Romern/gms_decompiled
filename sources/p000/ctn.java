package p000;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ctn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ctn {

    /* renamed from: a */
    public final ctm f12028a;

    /* renamed from: b */
    public final ctp f12029b;

    public ctn(ctm ctm, ctp ctp) {
        czl.m8004b(false, "card profile cannot be null");
        this.f12028a = ctm;
        this.f12029b = ctp;
    }

    /* renamed from: a */
    public static final csv m7564a(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    return ctc.m7523a(ctc.m7527a(bArr), csu.FCI_TEMPLATE);
                }
            } catch (IOException e) {
                throw new ctu(e);
            }
        }
        return ctc.m7522a(csu.FCI_TEMPLATE);
    }

    /* renamed from: b */
    public final csv mo8280b() {
        return m7564a(this.f12028a.mo8272c("Zip_AID_FCI"));
    }

    /* renamed from: c */
    public final String mo8282c() {
        return this.f12029b.f12030a;
    }

    /* renamed from: d */
    public final String mo8283d() {
        return this.f12028a.mo8267a("Token_PAN");
    }

    /* renamed from: e */
    public final String mo8284e() {
        return this.f12028a.mo8267a("Exp_Date");
    }

    /* renamed from: f */
    public final String mo8285f() {
        String b = this.f12028a.mo8269b("Track_2_Data_for_ZIP/MS_Mode");
        return czq.m8041a(b) ? czm.m8019b(this.f12028a.mo8268a()) : b;
    }

    /* renamed from: g */
    public final byte[] mo8286g() {
        return czm.m8026d(mo8277a(3));
    }

    /* renamed from: h */
    public final byte[] mo8287h() {
        return czm.m8012a(czq.m8045d(mo8282c(), 4));
    }

    /* renamed from: a */
    public final csv mo8276a() {
        return m7564a(this.f12028a.mo8272c("DPAS_AID_FCI"));
    }

    /* renamed from: b */
    public final String mo8281b(String str) {
        css.SECURITY_STATUS_NOT_SATISFIED.mo8229a(czq.m8041a((CharSequence) this.f12029b.f12034e));
        try {
            String b = czm.m8019b(mo8286g());
            ctp ctp = this.f12029b;
            String str2 = ctp.f12031b;
            String str3 = ctp.f12034e;
            String b2 = czn.m8031b(str);
            String b3 = czn.m8031b(b);
            int length = b.length();
            int length2 = String.valueOf(str).length();
            int length3 = String.valueOf(b2).length();
            StringBuilder sb = new StringBuilder(length + length2 + length3 + String.valueOf(str3).length() + String.valueOf(b3).length());
            sb.append(b);
            sb.append(str);
            sb.append(b2);
            sb.append(str3);
            sb.append(b3);
            String b4 = czm.m8019b(czo.m8032a(czm.m8012a(czn.m8030a(str2)), czm.m8012a(sb.toString())));
            StringBuilder sb2 = new StringBuilder(3);
            sb2.append(Integer.parseInt(b4.substring(0, 2), 16) % 10);
            sb2.append(Integer.parseInt(b4.substring(2, 4), 16) % 10);
            sb2.append(Integer.parseInt(b4.substring(4, 6), 16) % 10);
            return sb2.toString();
        } catch (IllegalBlockSizeException e) {
            return czn.m8029a();
        } catch (InvalidKeyException e2) {
            return czn.m8029a();
        } catch (NoSuchAlgorithmException e3) {
            return czn.m8029a();
        } catch (BadPaddingException e4) {
            return czn.m8029a();
        } catch (NoSuchPaddingException e5) {
            return czn.m8029a();
        }
    }

    /* renamed from: a */
    public final String mo8277a(int i) {
        return czq.m8045d(String.valueOf(this.f12029b.mo8289b()), i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: czq.a(java.lang.String, char):java.lang.String
     arg types: [java.lang.String, int]
     candidates:
      czq.a(char, int):java.lang.String
      czq.a(java.lang.String, int):java.lang.String
      czq.a(java.lang.String, char):java.lang.String */
    /* renamed from: a */
    public final String mo8278a(String str) {
        boolean z;
        try {
            String a = mo8277a(3);
            String d = mo8283d();
            String str2 = this.f12029b.f12033d;
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + String.valueOf(str).length() + String.valueOf(a).length());
            sb.append(d);
            sb.append(str);
            sb.append(a);
            String a2 = czq.m8038a(sb.toString(), '0');
            if (str2 == null || str2.length() < 32) {
                z = false;
            } else {
                z = true;
            }
            czl.m8003a(z, "CT_MS key missing or too short");
            byte[] a3 = czm.m8012a(a2.substring(0, 16));
            byte[] a4 = czm.m8012a(a2.substring(16, 32));
            byte[] a5 = czm.m8012a(str2.substring(0, 16));
            Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
            instance.init(1, new SecretKeySpec(a5, "DES"));
            String b = czm.m8019b(czo.m8032a(czm.m8012a(czn.m8030a(str2)), czm.m8017a(instance.doFinal(a3), a4)));
            StringBuilder sb2 = new StringBuilder(3);
            char[] charArray = b.toCharArray();
            for (char c : charArray) {
                if (c >= '0' && c <= '9') {
                    sb2.append(c);
                    if (sb2.length() == 3) {
                        return sb2.toString();
                    }
                }
            }
            char[] charArray2 = b.toCharArray();
            for (char c2 : charArray2) {
                if (c2 >= 'A' && c2 <= 'F') {
                    sb2.append((char) (c2 - 17));
                    if (sb2.length() == 3) {
                        return sb2.toString();
                    }
                }
            }
            return sb2.toString();
        } catch (IllegalBlockSizeException e) {
            return czn.m8029a();
        } catch (InvalidKeyException e2) {
            return czn.m8029a();
        } catch (NoSuchAlgorithmException e3) {
            return czn.m8029a();
        } catch (BadPaddingException e4) {
            return czn.m8029a();
        } catch (NoSuchPaddingException e5) {
            return czn.m8029a();
        }
    }

    /* renamed from: a */
    public final byte[] mo8279a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            return czm.m8012a(czp.m8033a(this.f12029b.f12032c, czp.m8034a(bArr, bArr2, bArr3, mo8287h(), bArr4)));
        } catch (IllegalBlockSizeException e) {
            return czp.m8036a();
        } catch (InvalidKeyException e2) {
            return czp.m8036a();
        } catch (NoSuchAlgorithmException e3) {
            return czp.m8036a();
        } catch (BadPaddingException e4) {
            return czp.m8036a();
        } catch (NoSuchPaddingException e5) {
            return czp.m8036a();
        } catch (InvalidAlgorithmParameterException e6) {
            return czp.m8036a();
        }
    }
}
