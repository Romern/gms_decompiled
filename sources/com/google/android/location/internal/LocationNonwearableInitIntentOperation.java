package com.google.android.location.internal;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationNonwearableInitIntentOperation extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        sre.m36087g(this);
        Intent startIntent = IntentOperation.getStartIntent(this, LocationNonwearablePersistentInitIntentOperation.class, "com.google.android.gms.location.internal.INIT_RUNTIME_STATE");
        sdo.m34959a(startIntent);
        startIntent.putExtra("com.google.android.gms.location.internal.FLAGS", i);
        startService(startIntent);
    }
}
