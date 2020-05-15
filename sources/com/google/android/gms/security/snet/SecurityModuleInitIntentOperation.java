package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.mdm.receivers.GoogleAccountsAddedChimeraReceiver;
import com.google.android.gms.security.settings.AdmSettingsChimeraActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SecurityModuleInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final String[] f107559a = {"com.google.android.gms.security.provider.SecurityProvider", "com.google.android.gms.security.recaptcha.RecaptchaActivity", "com.google.android.gms.security.settings.VerifyAppsSettingsActivity"};

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58939a() {
        if (!sre.m36080a(this)) {
            int i = Build.VERSION.SDK_INT;
            sre.m36089i(this);
            int i2 = Build.VERSION.SDK_INT;
            afzq.m53763b(this, true);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.security.snet.SecurityModuleInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.security.snet.SecurityModuleInitIntentOperation, java.lang.String, boolean]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        int i2 = i & 8;
        int i3 = i & 2;
        if ((i & 4) != 0 || i2 != 0) {
            afyt.m53683a(this);
            afzd.f64996j.mo10353b();
            int i4 = eoa.f15378a;
            GoogleAccountsAddedChimeraReceiver.m67197b();
            for (String str : f107559a) {
                spn.m35856a((Context) this, str, true);
            }
            spn.m35856a((Context) this, "com.google.android.gms.security.settings.AdmSettingsActivity", AdmSettingsChimeraActivity.m92387c(this));
            mo58939a();
        } else if (i3 != 0) {
            String str2 = (String) afzd.f64992f.mo10351a();
            String str3 = (String) afzd.f64993g.mo10351a();
            if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
                afzj.m53718a(this, str2, str3);
            }
            long longValue = ((Long) afzd.f64995i.mo10351a()).longValue();
            if (longValue > 0) {
                afzf.m53700a(this, longValue);
            }
            afyt.m53683a(this);
            mo58939a();
        }
    }
}
