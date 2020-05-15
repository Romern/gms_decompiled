package com.google.android.gms.gcm.clientqueue;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MessageRetryIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        aajt f = aakb.m21381a().mo16921f();
        aamn aamn = f.f28305h;
        if (aamn.f28469a) {
            for (aamh aamh : aamn.f28472d.mo17045a(f)) {
                aaqi aaqi = aaqi.CLIENT_QUEUE_APP_DOES_NOT_SUPPORT_RETRIES;
                aamn.f28471c.mo17024a(aamh);
                aamn.f28472d.mo17054b(aamh, aaqi);
            }
            aamn.mo17037a();
        }
    }
}
