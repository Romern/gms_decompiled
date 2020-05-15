package com.google.android.location.fused;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.NetworkLocationStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NlpRequestHelper$DataReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ bfsa f150761a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NlpRequestHelper$DataReceiver(bfsa bfsa) {
        super("location");
        this.f150761a = bfsa;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        ArrayList arrayList;
        List list;
        WorkSource workSource;
        bfsa bfsa = this.f150761a;
        if (bfsa.f115094h && (workSource = bfsa.f115097k) != null) {
            bfsa.f115092f.mo49121c(workSource);
        }
        String action = intent.getAction();
        if (action.equals(bvpm.m121348a("com.google.android.location.internal.action.FLP_AR_RESULT"))) {
            ActivityRecognitionResult b = ActivityRecognitionResult.m66821b(intent);
            if (b != null) {
                this.f150761a.f115091e.mo62098a(3, 0, 0, 0, b);
            }
        } else if (action.equals(bvpm.m121348a("com.google.android.location.internal.action.ACTION_FLP_COMPUTE_WIFI_LOCATIONS_RESULT"))) {
            this.f150761a.f115091e.mo62098a(32, 4, -1, -1, intent.getParcelableArrayListExtra("com.google.android.location.internal.EXTRA_COMPUTE_WIFI_LOCATIONS_RESPONSE_PARCELABLE_ARRAY_LIST"));
        } else if (action.equals(bvpm.m121348a("com.google.android.location.internal.action.FLP_FULL_POWER_LOCATION_RESULT")) && intent.hasExtra("com.google.android.location.internal.LOCATION_STATUS")) {
            ArrayList b2 = sef.m35076b(intent, "com.google.android.location.internal.LOCATION_STATUS", NetworkLocationStatus.CREATOR);
            if (b2 != null) {
                this.f150761a.f115091e.mo62098a(4, 2, -1, -1, (NetworkLocationStatus[]) b2.toArray(new NetworkLocationStatus[b2.size()]));
            }
        } else if (action.equals(bvpm.m121348a("com.google.android.location.internal.action.FLP_LOW_POWER_LOCATION_RESULT"))) {
            if (intent.hasExtra("com.google.android.location.internal.EXTRA_LOCATION_LIST")) {
                arrayList = intent.getParcelableArrayListExtra("com.google.android.location.internal.EXTRA_LOCATION_LIST");
            } else {
                Location a = bxbh.m122518a(intent);
                bxbh.m122520a(a, false);
                if (a != null) {
                    if (aeim.m51906j(a) == 3 && !aeim.m51892a(a)) {
                        String valueOf = String.valueOf(a);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                        sb.append("No debug info returned from NLP: ");
                        sb.append(valueOf);
                        Log.wtf("GCoreFlp", new IllegalStateException(sb.toString()));
                    }
                    list = Collections.singletonList(a);
                } else {
                    list = null;
                }
                arrayList = list;
            }
            if (arrayList != null) {
                this.f150761a.f115091e.mo62098a(5, 1, 0, 0, arrayList);
            }
            bfsa bfsa2 = this.f150761a;
            if (bfsa2.f115099m) {
                bfsa2.f115099m = false;
                bfsa2.f115091e.mo62098a(5, 3, 0, 0, null);
            }
        }
    }
}
