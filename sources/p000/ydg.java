package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fido.u2f.api.view.BleViewOptions;
import com.google.android.gms.fido.u2f.api.view.NfcViewOptions;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;

/* renamed from: ydg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ydg extends yct implements View.OnClickListener {

    /* renamed from: a */
    private static final sek f53652a = new sek(new String[]{"WelcomeFragment"}, (short[]) null);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo30349a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        String charSequence = getArguments().getCharSequence("APP_NAME").toString();
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.welcome_fragment, viewGroup, z);
        inflate.findViewById(C0126R.C0129id.get_started_button).setOnClickListener(this);
        ((TextView) inflate.findViewById(C0126R.C0129id.fido_welcome_title_textview)).setText(String.format(this.f53617f.getResources().getString(C0126R.string.fido_welcome_title), charSequence));
        ((TextView) inflate.findViewById(C0126R.C0129id.fido_welcome_body_textview)).setText(String.format(this.f53617f.getResources().getString(C0126R.string.fido_welcome_body), charSequence));
        return inflate;
    }

    /* renamed from: b */
    public final ViewOptions mo30351b() {
        return null;
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.get_started_button) {
            f53652a.mo25414c("User clicked GET STARTED button on Welcome screen", new Object[0]);
            xic xic = this.f53617f;
            ycc ycc = xic.f52327b;
            Context applicationContext = xic.getApplicationContext();
            if (ycc.f53587f) {
                ycc.mo14326a(ycc.f53586e);
                ycc.f53587f = false;
                return;
            }
            if (ycc.f53588g == null) {
                ycc.f53588g = xhy.m42973a(applicationContext);
            }
            if (!yav.NFC_ENABLE.equals(ycc.f53586e.mo18855c()) || !ycc.f53588g.mo29775a()) {
                if (ycc.f53584c == null) {
                    ycc.f53584c = BluetoothAdapter.getDefaultAdapter();
                }
                if (!yav.BLE_ENABLE.equals(ycc.f53586e.mo18855c()) || !ycc.f53584c.isEnabled()) {
                    ycc.mo14326a(ycc.f53586e);
                    return;
                }
                BleViewOptions bleViewOptions = new BleViewOptions(false);
                bleViewOptions.mo18875a(ycc.f53586e.f31970c);
                ycc.mo14326a(bleViewOptions);
                return;
            }
            NfcViewOptions nfcViewOptions = new NfcViewOptions();
            nfcViewOptions.mo18875a(ycc.f53586e.f31970c);
            ycc.mo14326a(nfcViewOptions);
            return;
        }
        f53652a.mo25418e("View %d is not handled in onClick", Integer.valueOf(view.getId()));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f53617f == null) {
            this.f53617f = (xic) getActivity();
        }
        return mo30349a(layoutInflater, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle(getString(C0126R.string.fido_welcome_title));
        getActivity().getWindow().getDecorView().sendAccessibilityEvent(32);
    }

    /* renamed from: a */
    public final ycu mo30350a() {
        return ycu.WELCOME_FRAGMENT;
    }
}
