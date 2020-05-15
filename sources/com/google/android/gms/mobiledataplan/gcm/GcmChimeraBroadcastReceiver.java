package com.google.android.gms.mobiledataplan.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: c */
    public static final /* synthetic */ int f80292c = 0;

    /* renamed from: d */
    private static final srn f80293d = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: b */
    bqgj f80294b;

    public final void onReceive(Context context, Intent intent) {
        agrl.m54942a().mo35998a(bwbv.f158777g, boox.RECEIVED_BY_GCM, "MDP_Notification", bygd.RECEIVED_BY_GCM);
        agqg.m54860o();
        if (!agqg.m54860o().booleanValue()) {
            return;
        }
        if (!"gcm".equals(aakz.m21424a(context).mo16960a(intent))) {
            f80293d.mo26019b(agyt.m55307c()).mo68405a("Received broadcasted intent is not a GCM message!");
            return;
        }
        if (this.f80294b == null) {
            this.f80294b = snp.m35704b(9);
        }
        this.f80294b.execute(new agqy(intent, context));
    }
}
