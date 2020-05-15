package com.google.android.gms.fitness.service.init;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.fitness.disconnect.FitCleanupIntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitnessIntentHandlers$OnPackageRemoveOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        srn srn = znn.f55563a;
        FitCleanupIntentOperation.m23700a(getApplicationContext(), intent);
    }
}
