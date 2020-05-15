package com.google.android.gms.mobiledataplan.event;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocaleChangeIntentOperation extends IntentOperation {
    static {
        srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);
    }

    public final void onHandleIntent(Intent intent) {
        cflx.m140022i();
        if (cflx.m140022i()) {
            if (cfmq.m140241l()) {
                agrl.m54942a().mo35982a(5, bygd.DEVICE_STATUS_LOCALE_CHANGED);
            }
            if (!cfmz.m140473d() || agyq.m55296q(rpr.m34216b())) {
                if (cflr.m139933j() && cflr.f184273a.mo6606a().mo81393g()) {
                    agsl a = agsl.m55046a();
                    a.f66368f.execute(new agsi(a));
                }
                ChimeraPeriodicUpdaterService.m67285a(rpr.m34216b(), cfmv.m140301D(), cfmv.m140299B(), boom.LOCALE_CHANGE_EVENT);
                cfmv.m140313l();
                cfmv.m140317p();
            }
        }
    }
}
