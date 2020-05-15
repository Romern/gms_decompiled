package p000;

import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.firstparty.GetAvailableOtherPaymentMethodsResponse;

/* renamed from: asvz */
final /* synthetic */ class asvz implements aubw {

    /* renamed from: a */
    private final aswe f89831a;

    public asvz(aswe aswe) {
        this.f89831a = aswe;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        aswe aswe = this.f89831a;
        GetAvailableOtherPaymentMethodsResponse getAvailableOtherPaymentMethodsResponse = (GetAvailableOtherPaymentMethodsResponse) obj;
        Activity activity = aswe.getActivity();
        if (activity != null) {
            for (int i : getAvailableOtherPaymentMethodsResponse.f108374a) {
                if (i == 2) {
                    aswe.f89853p = true;
                }
            }
            aswe.mo49540a(activity);
        }
    }
}
