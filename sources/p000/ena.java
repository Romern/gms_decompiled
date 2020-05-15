package p000;

import android.content.Context;
import android.content.pm.Signature;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* renamed from: ena */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ena {
    /* renamed from: a */
    public static final X509Certificate m10748a(Context context, String str) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(context.getAssets().open(str));
        } catch (FileNotFoundException e) {
            String valueOf = String.valueOf(str);
            Log.e("DynamicModuleDownloader", valueOf.length() == 0 ? new String("Certificate file could not be found. Check: ") : "Certificate file could not be found. Check: ".concat(valueOf));
            return null;
        } catch (CertificateException e2) {
            String valueOf2 = String.valueOf(str);
            Log.e("DynamicModuleDownloader", valueOf2.length() == 0 ? new String("Certificate signature could not be extracted from file. Check: ") : "Certificate signature could not be extracted from file. Check: ".concat(valueOf2));
            return null;
        } catch (IOException e3) {
            String valueOf3 = String.valueOf(str);
            Log.e("DynamicModuleDownloader", valueOf3.length() == 0 ? new String("Certificate signature could not be read from file. Check: ") : "Certificate signature could not be read from file. Check: ".concat(valueOf3));
            return null;
        }
    }

    /* renamed from: a */
    public static X509Certificate m10749a(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(ByteString.m123261a(signature.toByteArray()).mo73763g());
        } catch (CertificateException e) {
            Log.e("DynamicModuleDownloader", "Cannot decode certificate.");
            return null;
        }
    }
}
