package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryActionUpdatedEvent;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryLaunchedEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationDependentEvent;
import com.google.android.wallet.analytics.CreditCardEntryAction;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;

/* renamed from: axax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axax extends bkas {

    /* renamed from: C */
    private final bkip f95585C = new bkip();

    /* renamed from: D */
    private String f95586D;

    /* renamed from: E */
    private String f95587E;

    /* renamed from: F */
    private bpis f95588F = bpis.FLOW_TYPE_UNKNOWN;

    /* renamed from: T */
    public final ArrayList mo52820T() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo51901a(layoutInflater, viewGroup, bundle);
        SummaryExpanderWrapper summaryExpanderWrapper = (SummaryExpanderWrapper) a.findViewById(C0126R.C0129id.card_number_field_group);
        if (this.f123888o != null) {
            summaryExpanderWrapper.findViewById(C0126R.C0129id.icon).setVisibility(0);
            summaryExpanderWrapper.findViewById(C0126R.C0129id.summary_text).setVisibility(0);
            awgp.m79907a(summaryExpanderWrapper, this.f123888o, this, (int) C0126R.C0129id.icon, (int) C0126R.C0129id.summary_text, (int) C0126R.C0129id.card_number_field_group_subform_container, (int) C0126R.C0129id.summary_title, this);
            this.f123887n = summaryExpanderWrapper;
        } else {
            summaryExpanderWrapper.f152305a.mo66034a(true);
        }
        summaryExpanderWrapper.mo72160a(this.f123889p);
        summaryExpanderWrapper.mo72169i();
        this.f95585C.mo66032a((bkiq) summaryExpanderWrapper);
        this.f95585C.mo66032a(this.f123886m);
        return a;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95585C;
    }

    /* renamed from: e */
    public final void mo52834e(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo52958m() {
        return C0126R.C0129id.card_number_field_container;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f95586D = getArguments().getString("buyFlowAnalyticsId");
        this.f95588F = (bpis) getArguments().getSerializable("flowTypeArg");
        if (bundle != null) {
            this.f95587E = bundle.getString("analyticsSessionId");
            return;
        }
        this.f95587E = CreditCardEntryLaunchedEvent.m93807a(getActivity(), "orchBuyFlow", awck.m79676a(getActivity()), awck.m79677b(getActivity()), this.f95588F);
        OrchestrationDependentEvent.m93822a(getActivity(), this.f95586D, this.f95587E, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final akoz mo52959q() {
        return awfx.m79876a(getActivity());
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final bkbh mo52960t() {
        int i = this.f123961aF;
        LogContext at = mo65980at();
        axay axay = new axay();
        axay.setArguments(bkdx.m105383a(i, (bmhi) this.f124069w, at));
        return axay;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo52961u() {
        return true;
    }

    /* renamed from: a */
    public final void mo51905a(int i, Bundle bundle) {
        if (i != 7) {
            super.mo51905a(i, bundle);
            return;
        }
        int i2 = bundle.getInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE");
        if (i2 == 770) {
            awqc.m80662a(getActivity(), new CreditCardEntryActionUpdatedEvent((CreditCardEntryAction) bundle.getParcelable("EventListener.EXTRA_BACKGROUND_EVENT_DATA"), this.f95587E));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Unknown analytics background event type: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
