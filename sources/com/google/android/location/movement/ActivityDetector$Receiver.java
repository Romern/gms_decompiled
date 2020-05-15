package com.google.android.location.movement;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.ActivityRecognitionResult;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActivityDetector$Receiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ bgev f150817a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityDetector$Receiver(bgev bgev) {
        super("location");
        this.f150817a = bgev;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        synchronized (this.f150817a.f116306h) {
            String action = intent.getAction();
            if (bvpm.m121348a("com.google.android.location.internal.action.GEOFENCER_AR_RESULT").equals(action)) {
                ActivityRecognitionResult b = ActivityRecognitionResult.m66821b(intent);
                intent.getBooleanExtra("is_mock_for_testing", false);
                boolean z = this.f150817a.f116299a;
                this.f150817a.f116305g.mo62737a(b);
            } else if ("com.google.android.location.internal.server.ACTION_RESTARTED".equals(action)) {
                bgev bgev = this.f150817a;
                int i = bgev.f116308j;
                if (i > 0) {
                    bgev.mo62721a(i, true, bgev.f116309k);
                }
            } else {
                boolean z2 = bfxc.f115575a;
            }
        }
    }
}
