package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: ajqz */
final /* synthetic */ class ajqz implements aubw {

    /* renamed from: a */
    private final SetupChimeraActivity f71170a;

    public ajqz(SetupChimeraActivity setupChimeraActivity) {
        this.f71170a = setupChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        SetupChimeraActivity setupChimeraActivity = this.f71170a;
        Integer num = (Integer) obj;
        setupChimeraActivity.f80979j.setText(setupChimeraActivity.getResources().getQuantityString(C0126R.plurals.sharing_settings_button_select_contacts_description, num.intValue(), num));
    }
}
