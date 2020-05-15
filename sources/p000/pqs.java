package p000;

import android.util.Base64;
import com.google.android.gms.cast.firstparty.CastReceiver;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.X509Certificate;
import java.util.Locale;
import java.util.StringTokenizer;

/* renamed from: pqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pqs {
    /* renamed from: a */
    public static final pqr m31035a(CastReceiver castReceiver, X509Certificate x509Certificate) {
        String str;
        pqr pqr = new pqr();
        try {
            byte[] bytes = castReceiver.f29881b.getBytes("UTF-8");
            byte[] decode = Base64.decode(castReceiver.f29882c, 0);
            PublicKey publicKey = x509Certificate.getPublicKey();
            try {
                Signature instance = Signature.getInstance("SHA1withRSA");
                instance.initVerify(publicKey);
                instance.update(bytes);
                if (instance.verify(decode)) {
                    String[] split = x509Certificate.getSubjectX500Principal().getName().split(",");
                    int length = split.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            str = null;
                            break;
                        }
                        String trim = split[i].trim();
                        if (trim.startsWith("CN=")) {
                            str = trim.substring(3);
                            break;
                        }
                        i++;
                    }
                    if (str != null) {
                        String[] split2 = castReceiver.f29881b.split(",");
                        if (split2.length == 5) {
                            StringTokenizer stringTokenizer = new StringTokenizer(str);
                            if (stringTokenizer.countTokens() == 2) {
                                stringTokenizer.nextToken();
                                String replace = stringTokenizer.nextToken().replace(":", "");
                                String replace2 = split2[2].replace(":", "");
                                if (!replace.equals(replace2)) {
                                    pqr.f40075c = String.format(Locale.US, "CN '%s' does not match hotspot BSSID '%s'", replace2, replace);
                                    return pqr;
                                }
                                pqr.f40074b = split2[3];
                                pqr.f40073a = true;
                                return pqr;
                            }
                            pqr.f40075c = "Malformed CN; expected two whitespace-separated tokens";
                            return pqr;
                        }
                        pqr.f40075c = "Malformed message; expected 5 comma-separated chunks";
                        return pqr;
                    }
                    pqr.f40075c = "No CN found!";
                    return pqr;
                }
                pqr.f40075c = "Signed data failed to verify";
                return pqr;
            } catch (IllegalArgumentException e) {
                String valueOf = String.valueOf(e.toString());
                pqr.f40075c = valueOf.length() == 0 ? new String("Verification exception: ") : "Verification exception: ".concat(valueOf);
                return pqr;
            } catch (NoSuchAlgorithmException e2) {
                String valueOf2 = String.valueOf(e2.toString());
                pqr.f40075c = valueOf2.length() == 0 ? new String("Verification exception: ") : "Verification exception: ".concat(valueOf2);
                return pqr;
            } catch (InvalidKeyException e3) {
                String valueOf3 = String.valueOf(e3.toString());
                pqr.f40075c = valueOf3.length() == 0 ? new String("Verification exception: ") : "Verification exception: ".concat(valueOf3);
                return pqr;
            } catch (SignatureException e4) {
                String valueOf4 = String.valueOf(e4.toString());
                pqr.f40075c = valueOf4.length() == 0 ? new String("Verification exception: ") : "Verification exception: ".concat(valueOf4);
                return pqr;
            }
        } catch (UnsupportedEncodingException e5) {
            pqr.f40075c = "Unable to obtain data to sign";
            return pqr;
        }
    }
}
