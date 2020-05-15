package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fido.u2f.api.view.NfcViewOptions;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;

/* renamed from: ycw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ycw extends yct implements View.OnClickListener {

    /* renamed from: a */
    private static final Logger f53636a = new Logger(new String[]{"NfcEnableFragment"}, (short[]) null);

    /* renamed from: a */
    public static ycw m43821a(ViewOptions viewOptions) {
        sdo.m34970a(viewOptions.mo18855c().equals(yav.NFC_ENABLE));
        ycw ycw = new ycw();
        Bundle bundle = new Bundle();
        bundle.putParcelable("VIEW_OPTIONS", viewOptions);
        ycw.setArguments(bundle);
        return ycw;
    }

    /* renamed from: b */
    public final ViewOptions mo30351b() {
        if (this.f53615d == null) {
            this.f53615d = (ViewOptions) getArguments().getParcelable("VIEW_OPTIONS");
        }
        return this.f53615d;
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.nfc_turn_on_button) {
            f53636a.mo25414c("User clicked the button to turn on NFC", new Object[0]);
            this.f53617f.mo29788a(new NfcViewOptions());
            return;
        }
        f53636a.mo25418e("View %d is not handled in onClick", Integer.valueOf(view.getId()));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f53617f = (xic) getActivity();
        return mo30349a(layoutInflater, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle(getString(C0126R.string.common_turn_on_nfc));
        getActivity().getWindow().getDecorView().sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo30349a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.nfc_enable_fragment, viewGroup, z);
        inflate.findViewById(C0126R.C0129id.nfc_turn_on_button).setOnClickListener(this);
        return inflate;
    }

    /* renamed from: a */
    public final ycu mo30350a() {
        return ycu.NFC_ENABLE_FRAGMENT;
    }
}
