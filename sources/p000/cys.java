package p000;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: cys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cys {

    /* renamed from: a */
    public final cyx f12408a;

    /* renamed from: b */
    public final cyu f12409b;

    /* renamed from: c */
    public final cvj f12410c;

    /* renamed from: d */
    public cux f12411d;

    public cys(cyx cyx, cyu cyu, cvj cvj) {
        cvx.m7698b(cyx == null, "card profile cannot be null");
        this.f12408a = cyx;
        this.f12409b = cyu;
        this.f12410c = cvj;
    }

    /* renamed from: a */
    public final String mo8423a() {
        return this.f12409b.f12417a;
    }

    /* renamed from: b */
    public final String mo8428b() {
        return this.f12408a.mo8439a("Token_PAN");
    }

    /* renamed from: c */
    public final String mo8430c() {
        return this.f12408a.mo8439a("Exp_Date");
    }

    /* renamed from: d */
    public final String mo8431d() {
        String c = this.f12408a.mo8443c("Track_2_Data_for_ZIP/MS_Mode");
        return cwd.m7751a(c) ? cvz.m7704a(this.f12408a.mo8447e()) : c;
    }

    /* renamed from: e */
    public final byte[] mo8432e() {
        return cvz.m7720b(this.f12408a.mo8439a("AFL"));
    }

    /* renamed from: f */
    public final String mo8433f() {
        return this.f12408a.mo8443c("track_data_hash");
    }

    /* renamed from: g */
    public final Long mo8434g() {
        long j;
        if (!mo8426a(cxb.PROFILE_SPECIFIC_CVM_CUM)) {
            j = Long.parseLong(this.f12408a.mo8446e("CVM-Cum_limit_1"));
        } else {
            j = Long.parseLong(this.f12408a.mo8443c("CVM-Cum_limit_1"));
        }
        return Long.valueOf(j);
    }

    /* renamed from: h */
    public final byte[] mo8435h() {
        return cvz.m7728d(mo8424a(3));
    }

    /* renamed from: i */
    public final byte[] mo8436i() {
        return cvz.m7720b(cwd.m7754c(mo8423a(), 4));
    }

    /* renamed from: a */
    public final String mo8424a(int i) {
        return cwd.m7754c(String.valueOf(cvz.m7724c(cvz.m7720b(cwd.m7753b(this.f12409b.f12417a, 8)))), i);
    }

    /* renamed from: b */
    public final String mo8429b(String str) {
        try {
            String a = cvz.m7704a(mo8435h());
            String f = mo8433f();
            String str2 = this.f12409b.f12418b;
            String b = cwa.m7740b(str);
            String b2 = cwa.m7740b(a);
            int length = a.length();
            int length2 = String.valueOf(str).length();
            int length3 = String.valueOf(b).length();
            StringBuilder sb = new StringBuilder(length + length2 + length3 + String.valueOf(f).length() + String.valueOf(b2).length());
            sb.append(a);
            sb.append(str);
            sb.append(b);
            sb.append(f);
            sb.append(b2);
            String a2 = cvz.m7704a(cwb.m7741a(cvz.m7720b(cwa.m7739a(str2)), cvz.m7720b(sb.toString())));
            StringBuilder sb2 = new StringBuilder(3);
            sb2.append(Integer.parseInt(a2.substring(0, 2), 16) % 10);
            sb2.append(Integer.parseInt(a2.substring(2, 4), 16) % 10);
            sb2.append(Integer.parseInt(a2.substring(4, 6), 16) % 10);
            return sb2.toString();
        } catch (IllegalBlockSizeException e) {
            return cwa.m7738a();
        } catch (InvalidKeyException e2) {
            return cwa.m7738a();
        } catch (NoSuchAlgorithmException e3) {
            return cwa.m7738a();
        } catch (BadPaddingException e4) {
            return cwa.m7738a();
        } catch (NoSuchPaddingException e5) {
            return cwa.m7738a();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cwd.a(java.lang.String, char):java.lang.String
     arg types: [java.lang.String, int]
     candidates:
      cwd.a(char, int):java.lang.String
      cwd.a(java.lang.String, int):java.lang.String
      cwd.a(java.lang.String, char):java.lang.String */
    /* renamed from: a */
    public final String mo8425a(String str) {
        boolean z;
        try {
            String a = mo8424a(3);
            String b = mo8428b();
            String str2 = this.f12409b.f12420d;
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + String.valueOf(str).length() + String.valueOf(a).length());
            sb.append(b);
            sb.append(str);
            sb.append(a);
            String a2 = cwd.m7747a(sb.toString(), '0');
            if (str2 == null || str2.length() < 32) {
                z = false;
            } else {
                z = true;
            }
            cvx.m7697a(z, "CT_MS key missing or too short");
            byte[] b2 = cvz.m7720b(a2.substring(0, 16));
            byte[] b3 = cvz.m7720b(a2.substring(16, 32));
            byte[] b4 = cvz.m7720b(str2.substring(0, 16));
            Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
            instance.init(1, new SecretKeySpec(b4, "DES"));
            String a3 = cvz.m7704a(cwb.m7741a(cvz.m7720b(cwa.m7739a(str2)), cvz.m7716a(instance.doFinal(b2), b3)));
            StringBuilder sb2 = new StringBuilder(3);
            char[] charArray = a3.toCharArray();
            for (char c : charArray) {
                if (c >= '0' && c <= '9') {
                    sb2.append(c);
                    if (sb2.length() == 3) {
                        return sb2.toString();
                    }
                }
            }
            char[] charArray2 = a3.toCharArray();
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
            return cwa.m7738a();
        } catch (InvalidKeyException e2) {
            return cwa.m7738a();
        } catch (NoSuchAlgorithmException e3) {
            return cwa.m7738a();
        } catch (BadPaddingException e4) {
            return cwa.m7738a();
        } catch (NoSuchPaddingException e5) {
            return cwa.m7738a();
        }
    }

    /* renamed from: a */
    public final boolean mo8426a(cxb cxb) {
        if (this.f12408a.mo8450g() != null) {
            return cxb.m7810a(this.f12408a.mo8450g()).mo8362a(cxb);
        }
        return false;
    }

    /* renamed from: a */
    public final byte[] mo8427a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            return cvz.m7720b(cwc.m7742a(this.f12409b.f12419c, cwc.m7743a(bArr, bArr2, bArr3, mo8436i(), bArr4)));
        } catch (IllegalBlockSizeException e) {
            return cwc.m7745a();
        } catch (InvalidKeyException e2) {
            return cwc.m7745a();
        } catch (NoSuchAlgorithmException e3) {
            return cwc.m7745a();
        } catch (BadPaddingException e4) {
            return cwc.m7745a();
        } catch (NoSuchPaddingException e5) {
            return cwc.m7745a();
        } catch (InvalidAlgorithmParameterException e6) {
            return cwc.m7745a();
        }
    }
}
