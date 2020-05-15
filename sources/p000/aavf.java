package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.List;

/* renamed from: aavf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aavf {

    /* renamed from: a */
    private final Context f56645a;

    public aavf(Context context) {
        this.f56645a = context;
    }

    /* renamed from: a */
    public final int mo31825a() {
        bxvd da = bzrg.f171125c.mo74144da();
        List a = sqw.m36031a();
        PackageManager packageManager = this.f56645a.getPackageManager();
        if (packageManager == null) {
            a.add(bzrf.RTC_VERSION_UNSET);
        } else {
            String str = "";
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setComponent(new ComponentName("com.google.android.apps.helprtc", "com.google.android.apps.helprtc.ui.ScreenshareActivity")), 0)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && activityInfo.enabled) {
                    str = activityInfo.packageName;
                }
            }
            if (TextUtils.isEmpty(str)) {
                a.add(bzrf.RTC_VERSION_UNSET);
            } else {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                    if (packageInfo == null) {
                        a.add(bzrf.RTC_VERSION_UNSET);
                    } else {
                        int i = packageInfo.versionCode;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzrg bzrg = (bzrg) da.f164949b;
                        bzrg.f171127a |= 1;
                        bzrg.f171128b = i;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    a.add(bzrf.RTC_VERSION_UNSET);
                }
            }
        }
        if (!a.contains(bzrf.RTC_VERSION_UNSET)) {
            return ((bzrg) da.f164949b).f171128b;
        }
        return 0;
    }
}
