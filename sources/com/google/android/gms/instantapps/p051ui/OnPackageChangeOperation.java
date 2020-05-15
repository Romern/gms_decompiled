package com.google.android.gms.instantapps.p051ui;

import android.app.PendingIntent;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.instantapps.internal.OptInInfo;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.instantapps.ui.OnPackageChangeOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnPackageChangeOperation extends IntentOperation {

    /* renamed from: a */
    private static final adfs f79238a = new adfs("OnPackageChangeOperation");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    public final void onHandleIntent(Intent intent) {
        if (adfk.m50305a() == 1) {
            return;
        }
        if (intent.getData() == null || intent.getAction() == null) {
            f79238a.mo33426b("Bad intent %s", intent);
            return;
        }
        String encodedSchemeSpecificPart = intent.getData().getEncodedSchemeSpecificPart();
        String action = intent.getAction();
        if ("com.google.android.instantapps.supervisor".equals(encodedSchemeSpecificPart)) {
            sex a = sex.m35104a(this);
            if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                a.mo25444a("InstantApps", 100);
            } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                aucb j = adee.m50255b(this).mo24752j();
                try {
                    aucu.m76782a(j);
                    if (((OptInInfo) j.mo50386d()).f79182a == 1 && !adfr.m50317a(getApplicationContext())) {
                        PendingIntent activity = PendingIntent.getActivity(this, 0, adlb.m50785a(true).putExtra("downloadSupervisorShowConfirmation", true), 134217728);
                        String string = getString(C0126R.string.restore_instant_apps_notif_text, new Object[]{getString(C0126R.string.supervisor_title)});
                        C1102je jeVar = new C1102je(this);
                        jeVar.mo13640e(getString(C0126R.string.restore_instant_apps_notif_title));
                        jeVar.mo13632b(string);
                        C1101jd jdVar = new C1101jd();
                        jdVar.mo13593a(string);
                        jeVar.mo13626a(jdVar);
                        jeVar.mo13616a(1);
                        jeVar.mo13630b(17301642);
                        jeVar.mo13627a(true);
                        jeVar.f22254f = activity;
                        jeVar.mo13624a(new C1096iz(0, getString(C0126R.string.common_restore), activity).mo13508a());
                        a.mo25445a("InstantApps", 100, jeVar.mo13629b());
                    }
                } catch (InterruptedException | ExecutionException e) {
                    f79238a.mo33425a(e, "Could not fetch opt in info.", new Object[0]);
                }
            }
        }
    }
}
