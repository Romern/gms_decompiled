package p000;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.googlecertificates.ModuleDescriptor;

/* renamed from: rfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rfr {

    /* renamed from: a */
    private static volatile scq f42881a;

    /* renamed from: b */
    private static final Object f42882b = new Object();

    /* renamed from: c */
    private static Context f42883c;

    /* renamed from: a */
    static rfu m33522a(String str, rfl rfl, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m33524b(str, rfl, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    public static rfu m33524b(String str, rfl rfl, boolean z, boolean z2) {
        try {
            if (f42881a == null) {
                sdo.m34959a(f42883c);
                synchronized (f42882b) {
                    if (f42881a == null) {
                        f42881a = scp.asInterface(waq.m41676a(f42883c, waq.f50355c, ModuleDescriptor.MODULE_ID).mo29007a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            sdo.m34959a(f42883c);
            try {
                if (!f42881a.isGoogleOrPlatformSigned(new GoogleCertificatesQuery(str, rfl, z, z2), vzs.m41642a(f42883c.getPackageManager()))) {
                    return rfu.m33529a(new rfk(z, str, rfl));
                }
                return rfu.f42885a;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return rfu.m33528a("module call", e);
            }
        } catch (wam e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            return rfu.m33528a(valueOf.length() == 0 ? new String("module init: ") : "module init: ".concat(valueOf), e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        return;
     */
    /* renamed from: a */
    static synchronized void m33523a(Context context) {
        synchronized (rfr.class) {
            if (f42883c != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f42883c = context.getApplicationContext();
            }
        }
    }
}
