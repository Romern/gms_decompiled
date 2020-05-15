package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MeasurementPackageBroadcastIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String str;
        if ("android.intent.action.PACKAGE_REMOVED".equals(intent.getAction()) && !intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
            Uri data = intent.getData();
            if (data != null) {
                str = data.getSchemeSpecificPart();
            } else {
                str = null;
            }
            agmn a = agmn.m54505a(this);
            if (str != null) {
                a.mo35497E().f65571j.mo35436a("Got package removed intent", str);
                if (!"com.google.android.gms".equals(str) && a.mo35664a().f65291a) {
                    a.mo35498F().mo35492a(new agmk(a, str, a.mo35691o().mo20505a()));
                    return;
                }
                return;
            }
            a.mo35497E().f65567f.mo35435a("Got package removed intent with a null package name");
        }
    }
}
