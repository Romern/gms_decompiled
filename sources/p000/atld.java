package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.settings.TapAndPayHomeChimeraActivity;

/* renamed from: atld */
public final /* synthetic */ class atld implements rkl {

    /* renamed from: a */
    private final TapAndPayHomeChimeraActivity f90438a;

    public atld(TapAndPayHomeChimeraActivity tapAndPayHomeChimeraActivity) {
        this.f90438a = tapAndPayHomeChimeraActivity;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        int i;
        TapAndPayHomeChimeraActivity tapAndPayHomeChimeraActivity = this.f90438a;
        Status status = (Status) rkk;
        if (status.mo17710c()) {
            tapAndPayHomeChimeraActivity.mo59411g();
        } else if (status.f30115i == 15011) {
            tapAndPayHomeChimeraActivity.mo59410b(tapAndPayHomeChimeraActivity.getString(C0126R.string.tp_gsuite_error_message));
        } else {
            if (!ssk.m36235a(tapAndPayHomeChimeraActivity)) {
                i = C0126R.string.tp_no_network_error_body;
            } else {
                i = C0126R.string.tp_account_selection_error_body;
            }
            tapAndPayHomeChimeraActivity.mo59410b(tapAndPayHomeChimeraActivity.getString(i));
        }
    }
}
