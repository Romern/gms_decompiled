package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fido.u2f.api.view.BleDeviceIdentifier;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;

/* renamed from: ycj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ycj extends yct implements View.OnClickListener {

    /* renamed from: a */
    private static final sek f53602a = new sek(new String[]{"BleLocatePinFragment"}, (short[]) null);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo30349a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.ble_locate_pin_fragment, viewGroup, z);
        inflate.findViewById(C0126R.C0129id.ble_locate_pin_continue_button).setOnClickListener(this);
        ((TextView) inflate.findViewById(C0126R.C0129id.fido_ble_locate_pin_title_textview)).setText(String.format(this.f53617f.getResources().getString(C0126R.string.fido_ble_locate_pin_title), ((BleDeviceIdentifier) getArguments().getParcelable("DEVICE_ID")).f31954a));
        return inflate;
    }

    /* renamed from: b */
    public final ViewOptions mo30351b() {
        return null;
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.ble_locate_pin_continue_button) {
            f53602a.mo25414c("User clicked CONTINUE button on Locate PIN screen", new Object[0]);
            BleDeviceIdentifier bleDeviceIdentifier = (BleDeviceIdentifier) getArguments().getParcelable("DEVICE_ID");
            this.f53617f.mo29787a(new BleDeviceIdentifier(bleDeviceIdentifier.f31954a, bleDeviceIdentifier.f31955b));
            return;
        }
        f53602a.mo25418e("View %d is not handled in onClick", Integer.valueOf(view.getId()));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f53617f == null) {
            this.f53617f = (xic) getActivity();
        }
        return mo30349a(layoutInflater, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle(getString(C0126R.string.fido_ble_locate_pin_title));
        getActivity().getWindow().getDecorView().sendAccessibilityEvent(32);
    }

    /* renamed from: a */
    public final ycu mo30350a() {
        return ycu.BLE_LOCATE_PIN_FRAGMENT;
    }
}
