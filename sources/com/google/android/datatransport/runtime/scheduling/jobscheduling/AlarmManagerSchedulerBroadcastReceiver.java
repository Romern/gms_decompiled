package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        ejc.m10524a(context);
        eja d = ejb.m10519d();
        d.mo10190a(queryParameter);
        d.mo10189a(emj.m10667a(intValue));
        if (queryParameter2 != null) {
            d.f15114a = Base64.decode(queryParameter2, 0);
        }
        ejc.m10523a().f15118a.mo10238a(d.mo10188a(), i, ejy.f15161a);
    }
}
