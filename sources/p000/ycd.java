package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fido.u2f.api.view.BleEnableViewOptions;
import com.google.android.gms.fido.u2f.api.view.BleViewOptions;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;

/* renamed from: ycd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ycd extends yct implements View.OnClickListener {

    /* renamed from: c */
    private static final sek f53591c = new sek(new String[]{"BleEnableFragment"}, (short[]) null);

    /* renamed from: a */
    private Boolean f53592a;

    /* renamed from: b */
    private Boolean f53593b;

    /* renamed from: a */
    public static ycd m43792a(ViewOptions viewOptions) {
        sdo.m34970a(viewOptions.mo18855c().equals(yav.BLE_ENABLE));
        ycd ycd = new ycd();
        Bundle bundle = new Bundle();
        bundle.putParcelable("VIEW_OPTIONS", viewOptions);
        BleEnableViewOptions bleEnableViewOptions = (BleEnableViewOptions) viewOptions;
        bundle.putBoolean("BLUETOOTH_ENABLED", bleEnableViewOptions.f31957a);
        bundle.putBoolean("LOCATION_SERVICE_ENABLED", bleEnableViewOptions.f31958b);
        ycd.setArguments(bundle);
        return ycd;
    }

    /* renamed from: b */
    public final ViewOptions mo30351b() {
        if (this.f53615d == null) {
            this.f53615d = (ViewOptions) getArguments().getParcelable("VIEW_OPTIONS");
        }
        return this.f53615d;
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.ble_turn_on_button) {
            f53591c.mo25414c("User clicked the button to turn on Bluetooth and/or Location service", new Object[0]);
            this.f53617f.mo29788a(new BleViewOptions());
            return;
        }
        f53591c.mo25418e("View %d is not handled in onClick", Integer.valueOf(view.getId()));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f53617f == null) {
            this.f53617f = (xic) getActivity();
        }
        this.f53592a = Boolean.valueOf(getArguments().getBoolean("BLUETOOTH_ENABLED"));
        this.f53593b = Boolean.valueOf(getArguments().getBoolean("LOCATION_SERVICE_ENABLED"));
        if (!this.f53592a.booleanValue() || !this.f53593b.booleanValue()) {
            return mo30349a(layoutInflater, viewGroup, false);
        }
        throw new IllegalArgumentException("BleEnableView should not be called if bluetooth and location are already enabled.");
    }

    public final void onResume() {
        super.onResume();
        if (this.f53592a.booleanValue() && !this.f53593b.booleanValue()) {
            getActivity().setTitle(this.f53617f.getResources().getString(C0126R.string.fido_ble_enable_title_location_only));
        } else if (!this.f53592a.booleanValue() && this.f53593b.booleanValue()) {
            getActivity().setTitle(this.f53617f.getResources().getString(C0126R.string.common_turn_on_bluetooth));
        } else if (!this.f53592a.booleanValue() && !this.f53593b.booleanValue()) {
            getActivity().setTitle(this.f53617f.getResources().getString(C0126R.string.fido_ble_enable_title_bluetooth_and_location));
        }
        getActivity().getWindow().getDecorView().sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo30349a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.ble_enable_fragment, viewGroup, z);
        inflate.findViewById(C0126R.C0129id.ble_turn_on_button).setOnClickListener(this);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.fido_ble_enable_title_textview);
        TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.fido_ble_enable_body_textview);
        if (this.f53592a.booleanValue() && !this.f53593b.booleanValue()) {
            textView.setText(this.f53617f.getResources().getString(C0126R.string.fido_ble_enable_title_location_only));
            textView2.setText(this.f53617f.getResources().getString(C0126R.string.fido_ble_enable_body_location_only));
        } else if (!this.f53592a.booleanValue() && this.f53593b.booleanValue()) {
            textView.setText(this.f53617f.getResources().getString(C0126R.string.common_turn_on_bluetooth));
            textView2.setText(this.f53617f.getResources().getString(C0126R.string.fido_ble_enable_body_bluetooth_only));
        } else if (!this.f53592a.booleanValue() && !this.f53593b.booleanValue()) {
            textView.setText(this.f53617f.getResources().getString(C0126R.string.fido_ble_enable_title_bluetooth_and_location));
            textView2.setText(this.f53617f.getResources().getString(C0126R.string.fido_ble_enable_body_bluetooth_and_location));
        }
        return inflate;
    }

    /* renamed from: a */
    public final ycu mo30350a() {
        return ycu.BLE_ENABLE_FRAGMENT;
    }
}
