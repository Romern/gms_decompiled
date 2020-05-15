package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: mnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mnh extends mnj {

    /* renamed from: a */
    private GlifLayout f34035a;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34035a = (GlifLayout) layoutInflater.inflate((int) C0126R.C0128layout.source_copying_fragment, (ViewGroup) null);
        mo20183a(getArguments().getString("target_device_model"));
        return this.f34035a;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f34035a = null;
    }
}
