package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: aziv */
public final /* synthetic */ class aziv implements suh {

    /* renamed from: a */
    private final MatchstickSettingsChimeraActivity f99501a;

    /* renamed from: b */
    private final azcb f99502b;

    public aziv(MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity, azcb azcb) {
        this.f99501a = matchstickSettingsChimeraActivity;
        this.f99502b = azcb;
    }

    /* renamed from: a */
    public final void mo7099a(View view, sui sui) {
        MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = this.f99501a;
        azcb azcb = this.f99502b;
        azik azik = new azik();
        Bundle bundle = new Bundle();
        bundle.putString("server_app_id", azcb.mo54588a());
        azik.setArguments(bundle);
        FragmentTransaction replace = matchstickSettingsChimeraActivity.getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(C0126R.C0129id.fragment_container, azik, "app_settings_fragment_tag");
        if (cffg.f183927a.mo6606a().mo81114a()) {
            TextUtils.isEmpty(azcb.mo54588a());
        }
        replace.commitAllowingStateLoss();
    }
}
