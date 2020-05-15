package com.google.android.location.activity;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ActivityRecognitionHelper$LastActivityReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ bern f150684a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityRecognitionHelper$LastActivityReceiver(bern bern) {
        super("location");
        this.f150684a = bern;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (ActivityRecognitionResult.m66819a(intent)) {
            ActivityRecognitionResult b = ActivityRecognitionResult.m66821b(intent);
            ArrayList arrayList = new ArrayList();
            for (DetectedActivity detectedActivity : b.f79300a) {
                int a = detectedActivity.mo43513a();
                if (a == 0 || a == 1 || a == 2 || a == 3 || a == 4 || a == 7 || a == 8 || a == 16 || a == 17) {
                    arrayList.add(detectedActivity);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f150684a.f112224b = new ActivityRecognitionResult(arrayList, b.f79301b, b.f79302c, b.mo43493c());
            }
        }
    }
}
