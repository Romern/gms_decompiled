package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;
import java.util.List;

/* renamed from: atnu */
final /* synthetic */ class atnu implements atol {

    /* renamed from: a */
    private final TapUiChimeraActivity f90572a;

    public atnu(TapUiChimeraActivity tapUiChimeraActivity) {
        this.f90572a = tapUiChimeraActivity;
    }

    /* renamed from: a */
    public final void mo50067a(List list) {
        int i;
        TapUiChimeraActivity tapUiChimeraActivity = this.f90572a;
        if (list.size() == 1) {
            i = C0126R.string.tp_tap_choose_other_card_label;
        } else {
            i = C0126R.string.tp_tap_choose_card_label;
        }
        tapUiChimeraActivity.mo59417a(tapUiChimeraActivity.getString(i), new atnp(tapUiChimeraActivity, list));
    }
}
