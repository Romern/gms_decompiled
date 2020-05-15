package p000;

import android.os.Bundle;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: aziw */
public final /* synthetic */ class aziw implements suh {

    /* renamed from: a */
    private final MatchstickSettingsChimeraActivity f99503a;

    public aziw(MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity) {
        this.f99503a = matchstickSettingsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo7099a(View view, sui sui) {
        MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = this.f99503a;
        matchstickSettingsChimeraActivity.f111145j.block(cfeo.f183719a.mo6606a().mo80940a());
        azid azid = new azid();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("all_accounts_extra", matchstickSettingsChimeraActivity.f111144f);
        azid.setArguments(bundle);
        matchstickSettingsChimeraActivity.getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(C0126R.C0129id.fragment_container, azid, "account_fragment_tag").commitAllowingStateLoss();
    }
}
