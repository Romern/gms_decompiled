package com.google.android.gms.mobiledataplan.event;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SimChangeIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final srn f80291a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    public final void onHandleIntent(Intent intent) {
        Bundle extras;
        f80291a.mo26019b(agyt.m55307c()).mo68420a("SIM state changed, continue %s", Boolean.valueOf(cfmv.m140311j()));
        if (cfmv.m140311j() && (extras = intent.getExtras()) != null && extras.get("ss") != null && ((String) bmxu.m108565a(extras.getString("ss"), "")).equals("LOADED")) {
            if (cfmq.m140241l()) {
                agrl.m54942a().mo35982a(3, bygd.DEVICE_STATUS_SIM_STATE_CHANGED);
            }
            if (!cfmz.m140473d() || agyq.m55296q(rpr.m34216b())) {
                ChimeraPeriodicUpdaterService.m67285a(rpr.m34216b(), cfmv.m140301D(), cfmv.m140299B(), boom.SIM_CHANGE_EVENT);
                f80291a.mo26019b(agyt.m55307c()).mo68435a("SIM state changed. Periodic service enabled? %b Periodic fetch on? %b", cfmv.m140313l(), cfmv.m140317p());
                if (cflr.m139933j() && cflr.f184273a.mo6606a().mo81399m()) {
                    agsl.m55046a().mo36056b();
                }
            }
        }
    }
}
