package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;

/* renamed from: yck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yck extends yct implements ycv {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo30349a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return layoutInflater.inflate((int) C0126R.C0128layout.ble_pair_device_fragment, viewGroup, z);
    }

    /* renamed from: b */
    public final ViewOptions mo30351b() {
        if (this.f53615d == null) {
            this.f53615d = (ViewOptions) getArguments().getParcelable("VIEW_OPTIONS");
        }
        return this.f53615d;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return mo30349a(layoutInflater, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle(getString(C0126R.string.fido_ble_pair_device_pairing));
        getActivity().getWindow().getDecorView().sendAccessibilityEvent(32);
    }

    /* renamed from: a */
    public final ycu mo30350a() {
        return ycu.BLE_PAIR_DEVICE_FRAGMENT;
    }
}
