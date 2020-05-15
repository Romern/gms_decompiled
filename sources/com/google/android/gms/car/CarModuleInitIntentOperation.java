package com.google.android.gms.car;

import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarModuleInitIntentOperation extends nyt {

    /* renamed from: a */
    private static final bnsn f29354a = odk.m28481a("CAR.SERVICE.INIT");

    /* renamed from: c */
    private final void m22067c(Intent intent) {
        if (intent.getIntExtra(IntentOperation.EXTRA_PREVIOUS_VERSION, Integer.MAX_VALUE) < 10) {
            int i = 1;
            if (onz.m29292a(this, npp.f36339a.getClassName()) == 1 || onz.m29292a(this, npp.f36340b.getClassName()) == 1) {
                bnsi d = f29354a.mo68390d();
                d.mo68432a("com.google.android.gms.car.CarModuleInitIntentOperation", "c", 83, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("Resetting night mode");
                int identifier = Resources.getSystem().getIdentifier("config_defaultNightMode", "integer", "android");
                if (identifier != 0) {
                    i = Resources.getSystem().getInteger(identifier);
                }
                ((UiModeManager) getSystemService("uimode")).setNightMode(i);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: onz.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.car.CarModuleInitIntentOperation, java.lang.String, int]
     candidates:
      onz.a(android.content.Context, java.lang.String, int):void
      onz.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        onz.m29294a((Context) this, "com.google.android.gms.car.CarHomeActivity1", false);
        onz.m29294a((Context) this, "com.google.android.gms.car.CarHomeActivity2", false);
        if (!ccrv.f179815a.mo6606a().mo76692b() || !nzi.m28224a()) {
            int i = 1;
            onz.m29294a((Context) this, "com.google.android.gms.car.diagnostics.CrashReporterService2", true);
            onz.m29294a((Context) this, "com.google.android.gms.car.CarServiceSettingsActivity2", true);
            if (((ComponentName) nzg.f36999a.mo6606a()).getPackageName().equals("com.google.android.gms")) {
                onz.m29294a((Context) this, ((ComponentName) nzg.f36999a.mo6606a()).getClassName(), true);
            }
            if (intent.getIntExtra(IntentOperation.EXTRA_PREVIOUS_VERSION, Integer.MAX_VALUE) >= 10) {
                return;
            }
            if (onz.m29292a(this, npp.f36339a.getClassName()) == 1 || onz.m29292a(this, npp.f36340b.getClassName()) == 1) {
                bnsi d = f29354a.mo68390d();
                d.mo68432a("com.google.android.gms.car.CarModuleInitIntentOperation", "c", 83, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("Resetting night mode");
                int identifier = Resources.getSystem().getIdentifier("config_defaultNightMode", "integer", "android");
                if (identifier != 0) {
                    i = Resources.getSystem().getInteger(identifier);
                }
                ((UiModeManager) getSystemService("uimode")).setNightMode(i);
            }
        }
    }
}
