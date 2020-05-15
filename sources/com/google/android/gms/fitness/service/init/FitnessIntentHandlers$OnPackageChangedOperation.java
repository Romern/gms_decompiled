package com.google.android.gms.fitness.service.init;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.fitness.service.recording.FitRecordingChimeraBroker;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitnessIntentHandlers$OnPackageChangedOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (cdyu.m135392j()) {
            bnsl bnsl = (bnsl) znn.f55563a.mo68390d();
            bnsl.mo68432a("com.google.android.gms.fitness.service.init.FitnessIntentHandlers$OnPackageChangedOperation", "onHandleIntent", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("OnPackageChangedOperation got intent: %s", intent);
            FitRecordingChimeraBroker.m23782a(getApplicationContext(), intent);
        }
    }
}
