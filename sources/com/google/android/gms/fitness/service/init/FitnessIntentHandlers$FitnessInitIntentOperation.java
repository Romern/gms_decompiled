package com.google.android.gms.fitness.service.init;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitnessIntentHandlers$FitnessInitIntentOperation extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        srn srn = znn.f55563a;
        Context applicationContext = getApplicationContext();
        try {
            Intent startIntent = IntentOperation.getStartIntent(applicationContext, "com.google.android.gms.fitness.service.init.PersistentInitIntentOperation", "com.google.android.gms.fitness.START_INIT_ACTION");
            bmxy.m108582a(startIntent, "Error getting intent operation.");
            applicationContext.startService(startIntent);
        } catch (Exception e) {
            bnsl bnsl = (bnsl) znn.f55563a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.fitness.service.init.FitnessIntentHandlers$FitnessInitIntentOperation", "a", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to init required services %s", intent);
        }
        zme.m45749a(applicationContext, "com.google.android.gms.fitness.service.recording.FitRecordingBroker");
    }
}
