package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: nas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nas extends nat {

    /* renamed from: a */
    private static final lvn f35147a = new lvn("TargetEnabler");

    /* renamed from: b */
    private static final String[] f35148b = {"com.google.android.gms.backup.component.BackupOptInActivity", "com.google.android.gms.backup.component.D2dMigrateHelperService"};

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mbz.a(java.lang.String[], boolean):void
     arg types: [java.lang.String[], int]
     candidates:
      mbz.a(java.lang.String, boolean):void
      mbz.a(java.lang.String[], boolean):void */
    /* renamed from: a */
    public final void mo20413a(mbz mbz) {
        mbz.mo19844a(f35148b, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mbz.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      mbz.a(java.lang.String[], boolean):void
      mbz.a(java.lang.String, boolean):void */
    /* renamed from: b */
    public final void mo20414b(Context context, mbz mbz) {
        boolean z;
        if (sre.m36086f(context) || ccnf.f179489a.mo6606a().mo76429a() || mce.m24858a()) {
            z = true;
        } else {
            z = false;
        }
        f35147a.mo25414c("Setting target components to enabled = %b", Boolean.valueOf(z));
        mbz.mo19844a(f35148b, z);
        if (!z) {
            int i = Build.VERSION.SDK_INT;
            if (cckw.f179263a.mo6606a().mo76253r()) {
                f35147a.mo25414c("Enabling D2dMigrateHelperService on non-Pixel on P+", new Object[0]);
                mbz.mo19843a("com.google.android.gms.backup.component.D2dMigrateHelperService", true);
            }
        }
    }
}
