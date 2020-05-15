package com.google.android.gms.location.settings;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationOffWarningIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        int intExtra;
        if (ceyv.m138446b()) {
            sre.m36088h(this);
            if (!srf.m36097f(this) && !ActivityManager.isRunningInTestHarness()) {
                int i = Build.VERSION.SDK_INT;
                Bundle applicationRestrictions = ((RestrictionsManager) getSystemService("restrictions")).getApplicationRestrictions();
                if ((applicationRestrictions == null || !applicationRestrictions.getBoolean("suppressLocationDialog")) && ((double) srf.m36096e(this)) >= ceyv.f183518a.mo6606a().minBatteryLevelPct() && srf.m36098g(this) && aeri.m52434a(this) && "com.google.android.gms.location.settings.SHOW_LOWD".equals(intent.getAction()) && (intExtra = intent.getIntExtra("EXTRA_OLD_LOCATION_MODE", 0)) != 0) {
                    long c = aepp.m52358c(this);
                    if (System.currentTimeMillis() - aepp.m52356b(this) >= c) {
                        long min = Math.min(Math.max(c * ceyv.f183518a.mo6606a().backoffGrowthFactor(), ceyv.f183518a.mo6606a().minBackoffMs()), ceyv.f183518a.mo6606a().maxBackoffMs());
                        aepp.m52352a(this, System.currentTimeMillis());
                        aepp.m52357b(this, min);
                        Intent intent2 = new Intent();
                        intent2.setComponent(new ComponentName(this, "com.google.android.gms.location.settings.LocationOffWarningActivity"));
                        intent2.putExtra("previousMode", intExtra);
                        intent2.setFlags(268435456);
                        startActivity(intent2);
                    }
                }
            }
        }
    }
}
