package com.google.android.gms.herrevad.init;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.herrevad.services.PersistentConfigurationUpdateIntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InitializeChimeraIntentOperation extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        int i2 = i & 8;
        int i3 = i & 2;
        if ((i & 4) != 0 || i2 != 0 || i3 != 0) {
            int i4 = eoa.f15378a;
            Intent startIntent = IntentOperation.getStartIntent(getApplicationContext(), PersistentConfigurationUpdateIntentOperation.class, "com.google.android.gms.herrevad.ON_INIT");
            if (startIntent != null) {
                getApplicationContext().startService(startIntent);
            } else {
                eoa.m10824a("Herrevad", "Could not obtain start intent for PersistentConfigurationUpdateIntentOperation", new Object[0]);
            }
        }
    }
}
