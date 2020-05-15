package com.google.android.gms.phonesky.recovery;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhoneskyRecoveryModuleInitIntentOperation extends qlf {
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        int i2 = i & 4;
        int i3 = i & 8;
        if ((i & 2) == 0 && i2 == 0 && i3 == 0) {
            anjb.m64557b("Module triggered without updates or boot complete", new Object[0]);
        } else {
            new anjf(this).mo41868a();
        }
    }
}
