package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: ajqy */
public final /* synthetic */ class ajqy implements aubw {

    /* renamed from: a */
    private final SetupChimeraActivity f71169a;

    public ajqy(SetupChimeraActivity setupChimeraActivity) {
        this.f71169a = setupChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        SetupChimeraActivity setupChimeraActivity = this.f71169a;
        Integer num = (Integer) obj;
        setupChimeraActivity.f80982m = num.intValue();
        int intValue = num.intValue();
        if (intValue == 0) {
            setupChimeraActivity.f80979j.setText((int) C0126R.string.sharing_visibility_option_hidden);
            setupChimeraActivity.f80980k.setText((int) C0126R.string.sharing_setup_subtitle_visibility_none);
            setupChimeraActivity.f80981l.setImageDrawable(SetupChimeraActivity.m67553a(setupChimeraActivity, 2132018134));
        } else if (intValue == 1) {
            setupChimeraActivity.f80979j.setText((int) C0126R.string.sharing_all_contacts);
            setupChimeraActivity.f80980k.setText((int) C0126R.string.sharing_setup_subtitle_visibility_contacts);
            setupChimeraActivity.f80981l.setImageDrawable(SetupChimeraActivity.m67553a(setupChimeraActivity, 2132018133));
        } else if (intValue == 2) {
            ajty ajty = setupChimeraActivity.f70615c;
            ajik ajik = new ajik();
            ajik.mo38679b(true);
            ajty.mo38896a(ajik.f70715a).mo50373a(new ajqz(setupChimeraActivity));
            setupChimeraActivity.f80980k.setText((int) C0126R.string.sharing_setup_subtitle_visibility_contacts);
            setupChimeraActivity.f80981l.setImageDrawable(SetupChimeraActivity.m67553a(setupChimeraActivity, 2132018135));
        }
    }
}
