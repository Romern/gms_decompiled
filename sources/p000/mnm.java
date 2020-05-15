package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: mnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mnm extends mnj {

    /* renamed from: a */
    private GlifLayout f34041a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20177a() {
        TextView textView = (TextView) this.f34041a.findViewById(C0126R.C0129id.success_description_text);
        if (!cckw.f179263a.mo6606a().mo76234X() || getArguments().getBoolean("isWifiD2d", true)) {
            textView.setText(getString(C0126R.string.continue_on_other_device, this.f34039b));
            return;
        }
        textView.setText(getString(C0126R.string.source_success_description_usb, this.f34039b));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mnk mnk = new mnk(this);
        if (!ccoa.f179599a.mo6606a().mo76514e()) {
            GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate((int) C0126R.C0128layout.source_success_fragment, (ViewGroup) null);
            this.f34041a = glifLayout;
            glifLayout.findViewById(C0126R.C0129id.suc_layout_title).setVisibility(8);
            ((Button) this.f34041a.findViewById(C0126R.C0129id.success_done_button)).setOnClickListener(mnk);
        } else {
            GlifLayout glifLayout2 = (GlifLayout) layoutInflater.inflate((int) C0126R.C0128layout.source_success_fragment_v2, (ViewGroup) null);
            this.f34041a = glifLayout2;
            biyo biyo = new biyo(getContext());
            biyo.f122328c = 4;
            biyo.f122329d = 2132018229;
            biyo.mo64883a(C0126R.string.close_button_label);
            biyo.f122327b = mnk;
            ((biyn) glifLayout2.mo71342a(biyn.class)).mo52733a(biyo.mo64882a());
        }
        mo20183a(getArguments().getString("target_device_model"));
        return this.f34041a;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f34041a = null;
    }
}
