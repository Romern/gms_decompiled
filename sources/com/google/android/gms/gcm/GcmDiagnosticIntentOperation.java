package com.google.android.gms.gcm;

import android.content.Intent;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmDiagnosticIntentOperation extends qld {
    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        return new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.gcm.GcmDiagnostics").setFlags(268435456), 2, "GCM Diagnostics", 28);
    }
}
