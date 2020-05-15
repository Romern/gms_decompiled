package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: bebh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bebh {

    /* renamed from: a */
    private final Context f106869a;

    public bebh(Context context) {
        bmxy.m108582a(context, "Context must not be null.");
        this.f106869a = context;
    }

    /* renamed from: a */
    public final bnhe mo58526a() {
        String packageName = this.f106869a.getPackageName();
        String str = null;
        try {
            PackageInfo packageInfo = this.f106869a.getPackageManager().getPackageInfo(packageName, 64);
            if (!(packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length == 0 || packageInfo.signatures[0] == null)) {
                str = bebg.m91713a(packageInfo.signatures[0]);
            }
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(packageName);
            Log.e("CredentialsHelper", valueOf.length() == 0 ? new String("Unable to get certificate fingerprint for package: ") : "Unable to get certificate fingerprint for package: ".concat(valueOf), e);
        }
        bnha h = bnhe.m109414h();
        if (packageName != null) {
            h.mo67695b("X-Android-Package", packageName);
        }
        if (str != null) {
            h.mo67695b("X-Android-Cert", str);
        }
        return h.mo67618b();
    }
}
