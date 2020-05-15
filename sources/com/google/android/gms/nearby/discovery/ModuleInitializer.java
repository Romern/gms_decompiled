package com.google.android.gms.nearby.discovery;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializer extends qlf {

    /* renamed from: a */
    private static final String[] f80486a = {"com.google.android.gms.nearby.discovery.devices.DevicesListActivity", "com.google.android.gms.nearby.discovery.service.DiscoveryService", "com.google.android.gms.nearby.discovery.fastpair.CompanionAppInstallActivity", "com.google.android.gms.nearby.discovery.fastpair.HalfSheetActivity", "com.google.android.gms.nearby.discovery.devices.FindDeviceActivity", "com.google.android.gms.nearby.discovery.fastpair.slice.FastPairSliceProvider"};

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        boolean b = burl.m120297b(this, ahfl.m55644a(this));
        for (String str : f80486a) {
            ahfm.m55645a(this, str, b);
        }
        try {
            int i2 = Build.VERSION.SDK_INT;
            ahfm.m55645a(this, "com.google.android.gms.nearby.discovery.fastpair.slice.FastPairContextualCardProvider", true);
            int i3 = Build.VERSION.SDK_INT;
            Intent intent2 = new Intent("com.google.android.setupwizard.SETUP_WIZARD_FINISHED");
            intent2.setComponent(new ComponentName("com.google.android.settings.intelligence", "com.google.android.settings.intelligence.modules.contextualcards.impl.JobBootBroadcastReceiver"));
            sendBroadcast(intent2);
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("Trigger rescan contextual cards");
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68448m();
        }
        startService(DiscoveryChimeraService.m67336a(getBaseContext()).setAction("com.google.android.gms.nearby.discovery:ACTION_INIT_MESSAGES_PATH"));
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            ahzt.m56928b(getBaseContext());
        }
    }
}
