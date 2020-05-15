package com.google.android.gms.tapandpay.globalactions;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.provider.Settings;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GlobalActionsStateUpdateTaskOperation implements aspm {
    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        boolean z;
        int i;
        if (!cgwn.m147267q()) {
            return 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!ssw.m36269a()) {
            Intent intent = new Intent("com.google.android.gms.tapandpay.globalactions.STATE").setPackage("com.android.systemui");
            PackageManager packageManager = context.getPackageManager();
            rfz a = rfz.m33557a(context);
            Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(intent, 0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && activityInfo.exported && a.mo24610b(activityInfo.packageName)) {
                    asqc asqc = new asqc(context);
                    boolean a2 = asqc.mo49360a();
                    ContentResolver contentResolver = context.getContentResolver();
                    int i3 = Settings.Secure.getInt(contentResolver, "global_actions_panel_enabled", -1);
                    if (Settings.Secure.getInt(contentResolver, "global_actions_panel_available", 0) != a2) {
                        Settings.Secure.putInt(contentResolver, "global_actions_panel_available", a2 ? 1 : 0);
                        if (a2) {
                            if (i3 == -1) {
                                Settings.Secure.putInt(contentResolver, "global_actions_panel_enabled", 1);
                            }
                            try {
                                asqc.mo49359a(asqc.mo49356a(askg.m74283b(asqc.f89376b, null)));
                            } catch (asks e) {
                                bnsl bnsl = (bnsl) asqc.f89375a.mo68388c();
                                bnsl.mo68437a(e);
                                bnsl.mo68432a("asqc", "b", 439, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68405a("maybeLogFeatureEnabled: sql error");
                            }
                        }
                        asqc.mo49362c();
                    }
                }
            }
        }
        if (ssw.m36269a()) {
            asqc asqc2 = new asqc(context);
            if (!ssw.m36269a() || !asqc2.mo49360a()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                i = 2;
            } else {
                i = 1;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.google.android.gms.tapandpay.globalactions.QuickAccessWalletService"), i, 1);
            atkm atkm = asqc2.f89377c;
            boolean z2 = atkm.f90420c.getBoolean("wallet_service_enabled", false);
            atkm.f90420c.edit().putBoolean("wallet_service_enabled", z).apply();
            if (z2 != z) {
                asqc2.mo49362c();
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
        asql.m74466a(context);
    }
}
