package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;

/* renamed from: vyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vyg implements vye {

    /* renamed from: a */
    private final Context f50228a;

    public vyg(Context context) {
        this.f50228a = context;
    }

    /* renamed from: a */
    public final boolean mo28956a(File file) {
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.packageName = "com.google.ccc.abuse.droidguard";
        try {
            X509Certificate[][] a = blq.m3304a(file.getAbsolutePath());
            Signature[] signatureArr = new Signature[a.length];
            for (int i = 0; i < a.length; i++) {
                signatureArr[i] = new Signature(a[i][0].getEncoded());
            }
            packageInfo.signatures = signatureArr;
            return rfz.m33557a(this.f50228a).mo24606a(packageInfo);
        } catch (bln e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException | RuntimeException e2) {
            throw new GeneralSecurityException("Failed to verify signatures", e2);
        }
    }
}
