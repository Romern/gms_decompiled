package com.google.android.gms.instantapps.p051ui;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.google.android.gms.instantapps.ui.SettingsChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsChimeraActivity extends deu {

    /* renamed from: b */
    private static final adfs f79252b = new adfs("SettingsActivity");

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            startActivity(new Intent().setComponent(new ComponentName(cepl.m137726g(), cepl.m137725f())));
        } catch (ActivityNotFoundException e) {
            f79252b.mo33424a(e);
        }
        finish();
    }
}
