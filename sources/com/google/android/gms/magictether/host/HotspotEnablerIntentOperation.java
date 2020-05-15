package com.google.android.gms.magictether.host;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.ResultReceiver;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HotspotEnablerIntentOperation extends IntentOperation {
    /* renamed from: a */
    public static Intent m67139a(Context context, boolean z, ResultReceiver resultReceiver) {
        Intent startIntent = IntentOperation.getStartIntent(context, HotspotEnablerIntentOperation.class, "com.google.android.gms.magictether.ENABLE_HOTSPOT");
        startIntent.putExtra("EXTRA_SHOW_PROVISIONING_UI", z);
        startIntent.putExtra("EXTRA_RESULT_RECEIVER", resultReceiver);
        return startIntent;
    }

    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.magictether.ENABLE_HOTSPOT".equals(intent.getAction())) {
            boolean booleanExtra = intent.getBooleanExtra("EXTRA_SHOW_PROVISIONING_UI", false);
            ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("EXTRA_RESULT_RECEIVER");
            afan a = afal.m52785a(this);
            afan.m52786b();
            afan.f64091e = new asfb(rpr.m34216b(), 268435462, "Magic Tether");
            afan.f64091e.mo49114a("Starting tethering", afan.f64089a);
            if (a.f64093d.mo34733c() != 10) {
                a.mo34714a(booleanExtra, resultReceiver);
                return;
            }
            aki a2 = aki.m919a(rpr.m34216b());
            a2.mo873a(new HotspotEnabler$2(a, "auth_magictether", a2, booleanExtra, resultReceiver), new IntentFilter("com.google.android.gms.magictether.AP_FINISHED_DISABLING"));
        }
    }
}
