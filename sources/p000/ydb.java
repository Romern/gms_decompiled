package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.view.MultiTransportViewOptions;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import java.util.List;

/* renamed from: ydb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ydb extends yct implements View.OnClickListener {

    /* renamed from: a */
    private static final Logger f53644a = new Logger(new String[]{"TransportSelectionFragment"}, (short[]) null);

    /* renamed from: a */
    public static ydb m43831a(ViewOptions viewOptions, boolean z) {
        sdo.m34970a(viewOptions.mo18855c().equals(yav.MULTI_TRANSPORT));
        ydb ydb = new ydb();
        Bundle bundle = new Bundle();
        bundle.putParcelable("VIEW_OPTIONS", viewOptions);
        bundle.putBoolean("FINGERPRINT_ALLOWED", z);
        ydb.setArguments(bundle);
        return ydb;
    }

    /* renamed from: b */
    public final ViewOptions mo30351b() {
        if (this.f53615d == null) {
            this.f53615d = (ViewOptions) getArguments().getParcelable("VIEW_OPTIONS");
        }
        return this.f53615d;
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.select_bluetooth_layout) {
            this.f53617f.mo29786a(Transport.BLUETOOTH_LOW_ENERGY);
        } else if (view.getId() == C0126R.C0129id.select_nfc_layout) {
            this.f53617f.mo29786a(Transport.NFC);
        } else if (view.getId() == C0126R.C0129id.select_usb_layout) {
            this.f53617f.mo29786a(Transport.USB);
        } else if (view.getId() == C0126R.C0129id.select_fingerprint_layout) {
            this.f53617f.mo18789b();
        } else if (view.getId() == C0126R.C0129id.select_cable_layout) {
            this.f53617f.mo29786a(Transport.CABLE);
        } else {
            f53644a.mo25418e("View %d is not handled in onClick!", Integer.valueOf(view.getId()));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ydb.a(android.view.LayoutInflater, android.view.ViewGroup, boolean):android.view.View
     arg types: [android.view.LayoutInflater, android.view.ViewGroup, int]
     candidates:
      ydb.a(android.view.View, int, boolean):void
      ydb.a(android.view.LayoutInflater, android.view.ViewGroup, boolean):android.view.View */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f53617f = (xic) getActivity();
        this.f53616e = Boolean.valueOf(getArguments().getBoolean("FINGERPRINT_ALLOWED"));
        return mo30349a(layoutInflater, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle(getString(C0126R.string.fido_transport_selection_title));
        getActivity().getWindow().getDecorView().sendAccessibilityEvent(32);
    }

    /* renamed from: a */
    private final void m43832a(View view, int i, boolean z) {
        View findViewById = view.findViewById(i);
        if (z) {
            findViewById.setOnClickListener(this);
            findViewById.setVisibility(0);
            return;
        }
        findViewById.setOnClickListener(null);
        findViewById.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo30349a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.transport_selection_fragment, viewGroup, z);
        List list = ((MultiTransportViewOptions) mo30351b()).f31966b;
        m43832a(inflate, (int) C0126R.C0129id.select_bluetooth_layout, list.contains(Transport.BLUETOOTH_LOW_ENERGY));
        m43832a(inflate, (int) C0126R.C0129id.select_nfc_layout, list.contains(Transport.NFC));
        m43832a(inflate, (int) C0126R.C0129id.select_usb_layout, list.contains(Transport.USB));
        m43832a(inflate, (int) C0126R.C0129id.select_cable_layout, list.contains(Transport.CABLE));
        m43832a(inflate, (int) C0126R.C0129id.select_fingerprint_layout, this.f53616e.booleanValue());
        return inflate;
    }

    /* renamed from: a */
    public final ycu mo30350a() {
        return ycu.TRANSPORT_SELECTION_FRAGMENT;
    }
}
