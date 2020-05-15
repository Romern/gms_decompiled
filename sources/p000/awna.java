package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.p082im.ImRootChimeraActivity;
import com.google.android.gms.wallet.p088ui.component.pageheader.SetupWizardPageHeaderView;
import com.google.android.gms.wallet.setupwizard.WalletGlifLayout;

/* renamed from: awna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awna extends awmv {

    /* renamed from: q */
    awxy f94654q;

    /* renamed from: r */
    private WalletGlifLayout f94655r;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f94655r = (WalletGlifLayout) getActivity().findViewById(C0126R.C0129id.setup_wizard_layout);
        return super.mo51901a(layoutInflater, viewGroup, bundle);
    }

    /* renamed from: f */
    public final void mo51922f() {
        super.mo51922f();
        boolean z = this.f124195aJ;
        awxy awxy = this.f94654q;
        if (awxy != null) {
            awxy.f122314f.mo64888a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final int mo52299x() {
        return ((awmv) this).f94646j ? !ImRootChimeraActivity.m94010a(this.f95358B) ? C0126R.C0128layout.wallet_sw_fragment_instrument_manager_dialog : C0126R.C0128layout.wallet_sw_fragment_instrument_manager_dialog_gm2 : C0126R.C0128layout.wallet_sw_fragment_instrument_manager;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo52300z() {
        if (this.f94655r != null) {
            this.f94640d = (SetupWizardPageHeaderView) this.f95357A.findViewById(C0126R.C0129id.sw_page_header_view);
            this.f94640d.setVisibility(0);
            this.f94640d.f110581a = this;
            return;
        }
        super.mo52300z();
    }

    /* renamed from: a */
    public final void mo51904a(int i) {
        super.mo51904a(i);
        WalletGlifLayout walletGlifLayout = this.f94655r;
        if (walletGlifLayout != null) {
            walletGlifLayout.mo7880a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52295a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            WalletGlifLayout walletGlifLayout = this.f94655r;
            if (walletGlifLayout != null) {
                this.f94654q = (awxy) walletGlifLayout.mo71342a(biyn.class);
                bxwc bxwc = ((bmrx) this.f95397aj).f130605g;
                int size = bxwc.size();
                for (int i = 0; i < size; i++) {
                    biyo biyo = new biyo(this.f123962aG);
                    biyo.f122328c = 4;
                    biyo.f122329d = 2132018229;
                    biyp a = biyo.mo64882a();
                    this.f94654q.mo52733a(a);
                    awxr awxr = new awxr(this, getContext(), a, this.f94654q);
                    awxr.mo65787a(mo65980at());
                    awxr.mo52707a((bmdb) bxwc.get(i));
                    this.f94654q.f122314f.f122336f = awxr;
                    bjwl.m104784a(awxr, awxr.f152125g.f128770b, this.f124196aK);
                }
                return;
            }
            throw new IllegalStateException("Button container not defined.");
        }
        super.mo52295a(viewGroup);
    }
}
