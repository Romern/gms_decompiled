package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: mnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mnn extends mnj {

    /* renamed from: a */
    private GlifLayout f34042a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20177a() {
        mo20182a(this.f34042a, getString(C0126R.string.continue_on_other_device, this.f34039b));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34042a = (GlifLayout) layoutInflater.inflate((int) C0126R.C0128layout.source_waiting_fragment, (ViewGroup) null);
        mo20183a(getArguments().getString("target_device_model"));
        return this.f34042a;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f34042a = null;
    }
}
