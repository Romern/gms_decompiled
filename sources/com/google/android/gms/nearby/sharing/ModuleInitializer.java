package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.UserManager;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializer extends IntentOperation {

    /* renamed from: a */
    private static final String f80887a = ssv.m36267a("com.google.android.gms.nearby");

    /* renamed from: a */
    public static boolean m67468a(Context context) {
        if (cfov.m142066s()) {
            int i = Build.VERSION.SDK_INT;
            if (context.getPackageManager().hasSystemFeature("android.hardware.bluetooth") && context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") && (!m67469b(context) || cfov.f185185a.mo6606a().mo82365bm())) {
                if (!cfov.f185185a.mo6606a().mo82396t()) {
                    return true;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (!((UserManager) context.getSystemService("user")).getUserRestrictions().getBoolean("no_bluetooth_sharing", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m67469b(Context context) {
        return C1133kh.m17835a(context, "android.permission.MANAGE_USERS") == 0 && ssh.m36213a(context).mo26045d();
    }

    public final void onHandleIntent(Intent intent) {
        boolean z;
        String action = intent.getAction();
        if ((!"com.google.android.gms.phenotype.COMMITTED".equals(action) && !f80887a.equals(action)) || "com.google.android.gms.nearby".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            boolean a = m67468a(this);
            ahfm.m55645a(this, "com.google.android.gms.nearby.sharing.DirectShareService", a);
            ahfm.m55645a(this, "com.google.android.gms.nearby.sharing.SharingSyncService", a);
            ahfm.m55645a(this, "com.google.android.gms.nearby.sharing.ShareSheetActivity", a);
            ahfm.m55645a(this, "com.google.android.gms.nearby.sharing.SettingsActivity", a);
            ahfm.m55645a(this, "com.google.android.gms.nearby.sharing.SetupActivity", a);
            ahfm.m55645a(this, "com.google.android.gms.nearby.sharing.ReceiveSurfaceActivity", a);
            ahfm.m55645a(this, "com.google.android.gms.nearby.sharing.SettingsActivityAlias", a);
            ahfm.m55645a(this, "com.google.android.gms.nearby.sharing.ReceiveSurfaceService", a);
            if (a) {
                int i = Build.VERSION.SDK_INT;
                z = true;
            } else {
                z = false;
            }
            ahfm.m55645a(this, "com.google.android.gms.nearby.sharing.SharingTileService", z);
            int i2 = Build.VERSION.SDK_INT;
            ahfm.m55645a(this, "com.google.android.gms.nearby.sharing.ReceiveSurfaceService", true);
            startService(new Intent().setClassName(this, "com.google.android.gms.nearby.sharing.ReceiveSurfaceService"));
            if (a) {
                ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Runtime state initialization complete. Sharing is enabled.");
            } else {
                ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Runtime state initialization complete. Sharing is disabled.");
            }
        }
    }
}
