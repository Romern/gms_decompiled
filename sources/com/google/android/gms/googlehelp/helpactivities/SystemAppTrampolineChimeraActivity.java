package com.google.android.gms.googlehelp.helpactivities;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SystemAppTrampolineChimeraActivity extends Activity {

    /* renamed from: a */
    private static final Set f78981a = new HashSet();

    /* renamed from: b */
    private static int f78982b;

    /* renamed from: c */
    private abcr f78983c;

    /* renamed from: d */
    private HelpConfig f78984d;

    /* renamed from: a */
    private final void m66595a(int i) {
        abcx.m47462a(68, i, this, this.f78984d, this.f78983c);
        abht.m47727a(this, Uri.parse(ceeg.m136421z()), this.f78984d, this.f78983c);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        abcr abcr = this.f78983c;
        if (abcr != null) {
            abcr.close();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        int length;
        int length2;
        super.onCreate(bundle);
        String a = spn.m35852a((Activity) this);
        PackageManager packageManager = getPackageManager();
        this.f78983c = new abcr(this);
        HelpConfig a2 = HelpConfig.m66350a(GoogleHelp.m66336a("systemAppTrampolineActivity"), this);
        this.f78984d = a2;
        a2.f78827b = a;
        abcx.m47462a(66, 1, this, a2, this.f78983c);
        if (packageManager.hasSystemFeature("com.google.android.feature.GOOGLE_EXPERIENCE")) {
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a, 0);
                if (applicationInfo == null || (applicationInfo.flags & 1) == 0) {
                    m66595a(35);
                    return;
                }
                String aU = ceeg.f182447a.mo6606a().mo78980aU();
                if (aU.hashCode() != f78982b) {
                    f78981a.clear();
                    Collections.addAll(f78981a, aayh.m47256a(aU));
                    f78982b = aU.hashCode();
                }
                if (!f78981a.contains(a)) {
                    m66595a(36);
                    return;
                }
                Intent intent = getIntent();
                if (intent.hasExtra("EXTRA_CONTEXT")) {
                    str = intent.getStringExtra("EXTRA_CONTEXT");
                } else {
                    str = "";
                }
                GoogleHelp a3 = GoogleHelp.m66336a(str);
                new aare(a3).mo31634a(this.f78984d.f78830e);
                ThemeSettings themeSettings = new ThemeSettings();
                int intExtra = intent.getIntExtra("EXTRA_THEME", -1);
                if (intExtra != -1) {
                    themeSettings.f31623a = intExtra;
                }
                int intExtra2 = intent.getIntExtra("EXTRA_PRIMARY_COLOR", -1);
                if (intExtra2 != -1) {
                    themeSettings.f31624b = intExtra2;
                }
                a3.f78776s = themeSettings;
                String[] stringArrayExtra = intent.getStringArrayExtra("EXTRA_PSD_KEYS");
                String[] stringArrayExtra2 = intent.getStringArrayExtra("EXTRA_PSD_VALUES");
                if (!(stringArrayExtra == null || stringArrayExtra2 == null || (length2 = stringArrayExtra.length) != stringArrayExtra2.length)) {
                    C1223np npVar = new C1223np(length2);
                    for (int i = 0; i < length2; i++) {
                        npVar.put(stringArrayExtra[i], stringArrayExtra2[i]);
                    }
                    a3.mo43197a(npVar);
                }
                String[] stringArrayExtra3 = intent.getStringArrayExtra("EXTRA_FEEDBACK_PSD_KEYS");
                String[] stringArrayExtra4 = intent.getStringArrayExtra("EXTRA_FEEDBACK_PSD_VALUES");
                if (!(stringArrayExtra3 == null || stringArrayExtra4 == null || (length = stringArrayExtra3.length) != stringArrayExtra4.length)) {
                    wwu wwu = new wwu();
                    for (int i2 = 0; i2 < length; i2++) {
                        wwu.mo29492a(stringArrayExtra3[i2], stringArrayExtra4[i2]);
                    }
                    a3.mo43196a(wwu.mo29490a(), getCacheDir());
                }
                Account account = (Account) intent.getParcelableExtra("EXTRA_ACCOUNT");
                if (account != null) {
                    a3.f78760c = account;
                }
                a3.f78762e = spn.m35852a((Activity) this);
                abcx.m47462a(67, 1, this, this.f78984d, this.f78983c);
                Intent a4 = a3.mo43194a();
                int intExtra3 = intent.getIntExtra("EXTRA_OPEN_TO_CONTACT_OPTION", 0);
                if (intExtra3 != 0) {
                    a4.putExtra("EXTRA_OPEN_TO_CONTACT_OPTION", intExtra3);
                }
                startActivityForResult(a4, 0);
                finish();
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(a);
                Log.e("gH_SystemAppTrampoline", valueOf.length() == 0 ? new String("Error trying to get the application info for ") : "Error trying to get the application info for ".concat(valueOf));
                m66595a(34);
            }
        } else {
            m66595a(33);
        }
    }
}
