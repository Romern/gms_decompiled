package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.security.settings.SecuritySettingsChimeraActivity;

/* renamed from: apwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apwy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ apup f85036a;

    /* renamed from: b */
    final /* synthetic */ apwz f85037b;

    public apwy(apwz apwz, apup apup) {
        this.f85037b = apwz;
        this.f85036a = apup;
    }

    public final void run() {
        String str;
        SecuritySettingsChimeraActivity securitySettingsChimeraActivity = this.f85037b.f85038a;
        int i = SecuritySettingsChimeraActivity.f107528c;
        sui sui = securitySettingsChimeraActivity.f107529b;
        apup apup = this.f85036a;
        if (apup != null) {
            str = apup.mo47631a(securitySettingsChimeraActivity);
        } else {
            str = null;
        }
        if (str == null) {
            sui.mo26107d(C0126R.string.verify_apps_summary);
        } else {
            sui.mo26105b(str);
        }
    }
}
