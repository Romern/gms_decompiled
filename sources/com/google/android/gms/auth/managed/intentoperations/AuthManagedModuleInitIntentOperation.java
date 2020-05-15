package com.google.android.gms.auth.managed.intentoperations;

import android.content.Intent;
import com.google.android.gms.auth.managed.p029ui.SettingsSecurityDeviceOwnerChimeraActivity;
import com.google.android.gms.auth.managed.p029ui.SetupWorkProfileChimeraActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthManagedModuleInitIntentOperation extends qlf {

    /* renamed from: a */
    protected static final String[] f11053a = {"com.google.android.gms.auth.managed.ui.EmmActivity", "com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallActivity"};

    /* renamed from: b */
    private static final sek f11054b = ght.m13171a("AuthManaged", "AuthManagedModuleInitIntentOperation");

    /* renamed from: a */
    private final void m6698a() {
        boolean a = SetupWorkProfileSettingsIntentOperation.m6703a(getBaseContext());
        SetupWorkProfileChimeraActivity.m6735a(getBaseContext(), a);
        sek sek = f11054b;
        StringBuilder sb = new StringBuilder(42);
        sb.append("Set up work profile activity enabled:");
        sb.append(a);
        sek.mo25412b(sb.toString(), new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        f11054b.mo25409a("onBootCompleted", new Object[0]);
        m6698a();
        jho.m16722b().mo13750b(this);
        jho.m16722b().mo13752c();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        String str;
        boolean z2;
        f11054b.mo25409a("onModuleUpdated", new Object[0]);
        bmxr a = bmxr.m108544a("; ").mo66873a();
        sek sek = f11054b;
        String[] strArr = f11053a;
        int length = strArr.length;
        String a2 = a.mo66876a((Object[]) strArr);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 33);
        sb.append("Enabling ");
        sb.append(length);
        sb.append(" components: ");
        sb.append(a2);
        sek.mo25412b(sb.toString(), new Object[0]);
        String[] strArr2 = f11053a;
        int length2 = strArr2.length;
        int i = 0;
        while (true) {
            str = "enabling ";
            z2 = true;
            if (i >= length2) {
                break;
            }
            String str2 = strArr2[i];
            sek sek2 = f11054b;
            String valueOf = String.valueOf(str2);
            sek2.mo25414c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf), new Object[0]);
            spn.m35856a(getBaseContext(), str2, true);
            i++;
        }
        if (!ccgw.f178963a.mo6606a().mo75940a() || !SettingsSecurityDeviceOwnerChimeraActivity.m6733a(getBaseContext())) {
            z2 = false;
        }
        sek sek3 = f11054b;
        if (!z2) {
            str = "disabling ";
        }
        sek3.mo25414c(str.concat("com.google.android.gms.auth.managed.ui.SettingsSecurityDeviceOwnerActivity"), new Object[0]);
        try {
            spn.m35856a(getBaseContext(), "com.google.android.gms.auth.managed.ui.SettingsSecurityDeviceOwnerActivity", z2);
        } catch (IllegalArgumentException e) {
            if (z2) {
                f11054b.mo25415d("Component is not available", e, new Object[0]);
            }
        }
        m6698a();
        jho.m16722b().mo13750b(this);
    }
}
