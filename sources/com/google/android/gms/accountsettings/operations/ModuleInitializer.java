package com.google.android.gms.accountsettings.operations;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.accountsettings.service.PurgeScreenDataChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializer extends qlf {

    /* renamed from: b */
    static final String[] f7801b = {"com.google.android.gms.accountsettings.mg.ui.main.MainActivity", "com.google.android.gms.accountsettings.ui.SettingsLoaderActivity", "com.google.android.gms.accountsettings.service.PurgeScreenDataService"};

    /* renamed from: c */
    private static final sek f7802c = ffw.m11631a("ModuleInitializer");

    /* renamed from: a */
    aeat f7803a;

    public ModuleInitializer() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: a */
    public static void m4994a(Context context) {
        m4996c(context);
        try {
            spn.m35856a(context, "com.google.android.gms.accountsettings.service.PurgeScreenDataService", true);
        } catch (IllegalArgumentException e) {
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: b */
    static void m4995b(Context context) {
        sre.m36087g(context);
        m4996c(context);
        if (!cbro.f178167a.mo6606a().mo75289i()) {
            if (spn.m35876d(context, "com.google.android.gms.accountsettings.ui.SearchEntryPointActivity") != 2) {
                spn.m35856a(context, "com.google.android.gms.accountsettings.ui.SearchEntryPointActivity", false);
            }
            if (spn.m35876d(context, "com.google.android.gms.accountsettings.content.SettingsSearchContentProvider") != 2) {
                spn.m35856a(context, "com.google.android.gms.accountsettings.content.SettingsSearchContentProvider", false);
                return;
            }
            return;
        }
        if (spn.m35876d(context, "com.google.android.gms.accountsettings.ui.SearchEntryPointActivity") != 1) {
            spn.m35856a(context, "com.google.android.gms.accountsettings.ui.SearchEntryPointActivity", true);
        }
        if (spn.m35876d(context, "com.google.android.gms.accountsettings.content.SettingsSearchContentProvider") != 1) {
            spn.m35856a(context, "com.google.android.gms.accountsettings.content.SettingsSearchContentProvider", true);
        }
    }

    /* renamed from: c */
    private static void m4996c(Context context) {
        sre.m36088h(context);
    }

    public final void onCreate() {
        this.f7803a = aeat.m51532a(getBaseContext());
    }

    protected ModuleInitializer(Context context) {
        attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        m4994a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        m4996c(getBaseContext());
        aeat aeat = this.f7803a;
        if (aeat != null) {
            aeat.mo33984a(PurgeScreenDataChimeraService.m5000a());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.accountsettings.operations.ModuleInitializer, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        m4996c(this);
        for (String str : f7801b) {
            spn.m35856a((Context) this, str, true);
        }
        try {
            spn.m35856a((Context) this, "com.google.android.gms.accountsettings.ui.ZeroPartyEntryPointActivity", true);
        } catch (IllegalArgumentException e) {
            f7802c.mo25418e("Component 'ZeroPartyActivity' not available", new Object[0]);
        }
        try {
            spn.m35856a((Context) this, "com.google.android.gms.accountsettings.ui.PrivacyHubActivityControlsActivity", true);
        } catch (IllegalArgumentException e2) {
            f7802c.mo25418e("Component 'ACTIVITY_CONTROLS_ACTIVITY_ALIAS' not available", new Object[0]);
        }
        m4995b(this);
    }
}
