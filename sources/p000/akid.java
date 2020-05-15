package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: akid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akid {
    /* renamed from: a */
    public static int m59786a(String str) {
        return str.getBytes(Charset.forName("UTF-8")).length;
    }

    /* renamed from: a */
    public static boolean m59787a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    /* renamed from: b */
    public static String m59793b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("[ ");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("0x%02x ", Byte.valueOf(bArr[i])));
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: c */
    public static String m59794c(byte[] bArr) {
        int i = 0;
        int i2 = 1;
        for (byte b : bArr) {
            i = (i + (b * i2)) % 9973;
            i2 = (i2 * 31) % 9973;
        }
        return String.format(Locale.US, "%04d", Integer.valueOf(Math.abs(i)));
    }

    /* renamed from: a */
    public static byte[] m59788a(int i) {
        return m59789a(i, new SecureRandom());
    }

    /* renamed from: a */
    public static byte[] m59789a(int i, SecureRandom secureRandom) {
        byte[] bArr = new byte[i];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m59790a(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m59791a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 0) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akid", "a", (int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Salt cannot be empty.");
            return null;
        }
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            try {
                instance.init(new SecretKeySpec(bArr2, "HmacSHA256"));
                return instance.doFinal(bArr);
            } catch (InvalidKeyException e) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("akid", "a", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Invalid key.");
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl3.mo68437a(e2);
            bnsl3.mo68432a("akid", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("No such algorithm %s", "HmacSHA256");
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m59792a(byte[] bArr, byte[] bArr2, int i) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            if (i > instance.getMacLength() * 255) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                bnsl.mo68432a("akid", "a", 141, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Size too large.");
                return null;
            } else if (bArr2.length != 0) {
                try {
                    instance.init(new SecretKeySpec(bArr2, "HmacSHA256"));
                    byte[] bArr3 = new byte[i];
                    try {
                        instance.init(new SecretKeySpec(instance.doFinal(bArr), "HmacSHA256"));
                        byte[] bArr4 = new byte[0];
                        int i2 = 1;
                        int i3 = 0;
                        while (true) {
                            instance.update(bArr4);
                            instance.update((byte) i2);
                            bArr4 = instance.doFinal();
                            int length = bArr4.length;
                            int i4 = i3 + length;
                            if (i4 < i) {
                                System.arraycopy(bArr4, 0, bArr3, i3, length);
                                i2++;
                                i3 = i4;
                            } else {
                                System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                                return bArr3;
                            }
                        }
                    } catch (InvalidKeyException e) {
                        bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl2.mo68437a(e);
                        bnsl2.mo68432a("akid", "a", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Invalid key.");
                        return null;
                    }
                } catch (InvalidKeyException e2) {
                    bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl3.mo68437a(e2);
                    bnsl3.mo68432a("akid", "a", (int) MfiClientException.TYPE_MFICLIENT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Invalid key.");
                    return null;
                }
            } else {
                bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl4.mo68432a("akid", "a", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Key cannot be empty.");
                return null;
            }
        } catch (NoSuchAlgorithmException e3) {
            bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl5.mo68437a(e3);
            bnsl5.mo68432a("akid", "a", 136, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68420a("No such algorithm %s", "HmacSHA256");
            return null;
        }
    }
}
