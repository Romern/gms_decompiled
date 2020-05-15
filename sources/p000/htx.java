package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.api.credentials.internal.AccountCredentialSettings;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialsSettingsChimeraActivity;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.EventsInterceptableLinearLayout;
import java.util.List;

/* renamed from: htx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class htx implements bqfp {

    /* renamed from: a */
    final /* synthetic */ CredentialsSettingsChimeraActivity f20422a;

    public htx(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity) {
        this.f20422a = credentialsSettingsChimeraActivity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.List, htw]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        AccountCredentialSettings accountCredentialSettings = (AccountCredentialSettings) obj;
        this.f20422a.mo7445b(false);
        hhy hhy = new hhy(accountCredentialSettings);
        hhy.f19819c.clear();
        hhy.mo12478a(bngx.m109355a(bnjd.m109586b((Iterable) accountCredentialSettings.f10136c, (bmxz) new htw(this))));
        AccountCredentialSettings a = hhy.mo12477a();
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.f20422a;
        credentialsSettingsChimeraActivity.f10187h = a;
        if (!a.f10137d) {
            credentialsSettingsChimeraActivity.mo7443a(true);
            credentialsSettingsChimeraActivity.f10185f.setVisibility(8);
            credentialsSettingsChimeraActivity.f10186g.setVisibility(0);
            credentialsSettingsChimeraActivity.f10181b.setChecked(a.f10134a);
            credentialsSettingsChimeraActivity.f10182c.setChecked(a.f10135b);
            credentialsSettingsChimeraActivity.f10183d.removeAllViews();
            List list = a.f10136c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String c = qqt.m32669c((String) list.get(i));
                View inflate = credentialsSettingsChimeraActivity.getLayoutInflater().inflate((int) C0126R.C0128layout.credentials_app_item, (ViewGroup) null, false);
                credentialsSettingsChimeraActivity.mo7442a(inflate, c);
                credentialsSettingsChimeraActivity.f10183d.addView(inflate);
                inflate.setOnClickListener(new htt(credentialsSettingsChimeraActivity, c));
            }
            boolean z = a.f10134a;
            EventsInterceptableLinearLayout eventsInterceptableLinearLayout = (EventsInterceptableLinearLayout) credentialsSettingsChimeraActivity.findViewById(C0126R.C0129id.extra_options);
            float alpha = eventsInterceptableLinearLayout.getAlpha();
            if (!z) {
                if (alpha != 0.5f) {
                    eventsInterceptableLinearLayout.setVisibility(0);
                    eventsInterceptableLinearLayout.setAlpha(1.0f);
                    eventsInterceptableLinearLayout.f10196a = true;
                    eventsInterceptableLinearLayout.animate().alpha(0.5f).setListener(new htv(eventsInterceptableLinearLayout));
                }
            } else if (alpha != 1.0f) {
                eventsInterceptableLinearLayout.setAlpha(0.5f);
                eventsInterceptableLinearLayout.animate().alpha(1.0f).setListener(new htu(eventsInterceptableLinearLayout));
            }
            List d = soz.m35801d(credentialsSettingsChimeraActivity, credentialsSettingsChimeraActivity.getPackageName());
            if (a.f10134a || d.size() <= 1) {
                credentialsSettingsChimeraActivity.findViewById(C0126R.C0129id.storage_enabled_helper_text).setVisibility(8);
            } else {
                credentialsSettingsChimeraActivity.findViewById(C0126R.C0129id.storage_enabled_helper_text).setVisibility(0);
            }
        } else {
            credentialsSettingsChimeraActivity.mo7443a(false);
            credentialsSettingsChimeraActivity.f10185f.setVisibility(0);
            credentialsSettingsChimeraActivity.f10186g.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        this.f20422a.mo7445b(true);
        this.f20422a.mo7446e();
        Toast.makeText(this.f20422a.getContainerActivity(), this.f20422a.getResources().getString(C0126R.string.credentials_pref_failed_load), 1).show();
    }
}
