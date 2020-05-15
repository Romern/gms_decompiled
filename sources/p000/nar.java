package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: nar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nar extends nat {

    /* renamed from: a */
    private static final lvn f35145a = new lvn("SourceEnabler");

    /* renamed from: b */
    private static final String[] f35146b = {"com.google.android.gms.backup.component.D2dSourceActivity", "com.google.android.gms.backup.component.D2dSourceService"};

    /* renamed from: a */
    private static void m25848a(File file) {
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (SecurityException e) {
            f35145a.mo25417e("Could not delete file", e, new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo20414b(Context context, mbz mbz) {
        boolean z;
        if (cckw.f179263a.mo6606a().mo76214D()) {
            if (C1145kt.m18540a(context, "android.permission.MANAGE_USERS") != 0) {
                f35145a.mo25416d("Don't have MANAGE_USERS permission, skipping managed profile check.", new Object[0]);
            } else if (ssh.m36213a(context).mo26045d()) {
                f35145a.mo25414c("Managed profile, disabling source components.", new Object[0]);
                z = false;
            }
            File file = new File(context.getFilesDir(), "component-enabler-test-file");
            m25848a(file);
            try {
                if (file.createNewFile()) {
                    z = true;
                }
            } catch (IOException | SecurityException e) {
                f35145a.mo25417e("Exception while checking whether temporary directory is writable", e, new Object[0]);
            } finally {
                m25848a(file);
            }
            f35145a.mo25418e("Cannot write to temp dir, disabling source components.", new Object[0]);
            z = false;
        } else {
            f35145a.mo25414c("Source components disabled by gservices.", new Object[0]);
            z = false;
        }
        f35145a.mo25414c("Setting source components to enabled = %b", Boolean.valueOf(z));
        mbz.mo19844a(f35146b, z);
        mce.m24864d();
        mbz.mo19843a("com.google.android.gms.backup.component.D2dTransportService", z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mbz.a(java.lang.String[], boolean):void
     arg types: [java.lang.String[], int]
     candidates:
      mbz.a(java.lang.String, boolean):void
      mbz.a(java.lang.String[], boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mbz.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      mbz.a(java.lang.String[], boolean):void
      mbz.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo20413a(mbz mbz) {
        mbz.mo19844a(f35146b, false);
        mbz.mo19843a("com.google.android.gms.backup.component.D2dTransportService", false);
    }
}
