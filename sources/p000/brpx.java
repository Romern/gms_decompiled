package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: brpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brpx {

    /* renamed from: a */
    public final String f143146a;

    /* renamed from: b */
    public final String f143147b;

    public brpx(Context context, String str) {
        sdo.m34959a(context);
        sdo.m34977c(str);
        this.f143146a = str;
        try {
            byte[] a = spo.getPackageCertificateHash(context, str, "SHA1");
            if (a == null) {
                String valueOf = String.valueOf(str);
                Log.e("FBA-PackageInfo", valueOf.length() == 0 ? new String("single cert required: ") : "single cert required: ".concat(valueOf));
                this.f143147b = null;
                return;
            }
            this.f143147b = srv.m36164d(a);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf2 = String.valueOf(str);
            Log.e("FBA-PackageInfo", valueOf2.length() == 0 ? new String("no pkg: ") : "no pkg: ".concat(valueOf2));
            this.f143147b = null;
        }
    }
}
