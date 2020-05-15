package p000;

import android.view.View;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;

/* renamed from: apxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apxb implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ apxg f85039a;

    public apxb(apxg apxg) {
        this.f85039a = apxg;
    }

    public void onClick(View view) {
        apxj apxj = this.f85039a.f85060s;
        if (apxj != null) {
            VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity = apxj.f85064a;
            verifyAppsSettingsChimeraActivity.f107544p = true;
            verifyAppsSettingsChimeraActivity.mo58937g();
            apxj.f85064a.mo58935a(true);
            apxj.f85064a.f107545q.mo47665a(4, 6);
        }
    }
}
