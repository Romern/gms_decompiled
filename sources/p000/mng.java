package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: mng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mng extends mnj {

    /* renamed from: a */
    private GlifLayout f34034a;

    /* renamed from: b */
    public final mnf mo20180b() {
        return (mnf) getActivity();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate((int) C0126R.C0128layout.source_copy_confirmation_fragment, (ViewGroup) null);
        this.f34034a = glifLayout;
        mo20181a(glifLayout, (int) C0126R.string.copy_confirmation_title);
        mo20183a(getArguments().getString("target_device_model"));
        biyn biyn = (biyn) this.f34034a.mo71342a(biyn.class);
        biyo biyo = new biyo(getContext());
        biyo.f122328c = 7;
        biyo.f122329d = 2132018230;
        biyo.mo64883a(C0126R.string.cancel_copy_button_text);
        biyo.f122327b = new mnd(this);
        biyn.mo52735b(biyo.mo64882a());
        biyo biyo2 = new biyo(getContext());
        biyo2.f122328c = 5;
        biyo2.f122329d = 2132018229;
        biyo2.mo64883a(17039361);
        biyo2.f122327b = new mne(this);
        biyn.mo52733a(biyo2.mo64882a());
        return this.f34034a;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f34034a = null;
    }
}
