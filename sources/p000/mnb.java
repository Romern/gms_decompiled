package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: mnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mnb extends mnj {

    /* renamed from: a */
    private GlifLayout f34031a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20177a() {
        mo20182a(this.f34031a, getString(C0126R.string.source_connected_title, this.f34039b));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34031a = (GlifLayout) layoutInflater.inflate((int) C0126R.C0128layout.source_connected_fragment, (ViewGroup) null);
        mo20183a(getArguments().getString("target_device_model"));
        return this.f34031a;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f34031a = null;
    }
}
