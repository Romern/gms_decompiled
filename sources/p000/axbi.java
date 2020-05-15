package p000;

import android.os.Bundle;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: axbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axbi extends bkhs {

    /* renamed from: g */
    private String f95687g;

    /* renamed from: a */
    public final void mo51907a(bjer bjer) {
        OrchestrationViewEvent.m93828c(getActivity(), this.f95687g, bjer.mo51919co());
    }

    /* renamed from: m */
    public final void mo52982m() {
        this.f124234a = true;
        if (this.f124235b) {
            this.f124235b = false;
            mo51905a(8, Bundle.EMPTY);
        }
    }

    public final void onCreate(Bundle bundle) {
        this.f124239f = awfq.m79857a(getContext(), (BuyFlowConfig) getArguments().getParcelable("buyFlowConfig"));
        super.onCreate(bundle);
        this.f95687g = getArguments().getString("analyticsSessionId");
    }
}
