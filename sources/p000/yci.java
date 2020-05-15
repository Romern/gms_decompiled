package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.view.BleViewOptions;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: yci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yci extends yct implements View.OnClickListener {

    /* renamed from: g */
    private static final Logger f53598g = new Logger(new String[]{"BleInstructionsFragment"}, (short[]) null);

    /* renamed from: a */
    private Boolean f53599a;

    /* renamed from: b */
    private Boolean f53600b;

    /* renamed from: c */
    private String f53601c;

    /* renamed from: a */
    public static yci m43796a(ViewOptions viewOptions, String str, boolean z) {
        sdo.m34970a(viewOptions.mo18855c().equals(yav.BLE));
        return m43798a(viewOptions, ((BleViewOptions) viewOptions).f31964a, viewOptions.f31970c, true, str, z);
    }

    /* renamed from: b */
    public final ViewOptions mo30351b() {
        if (this.f53615d == null) {
            this.f53615d = (ViewOptions) getArguments().getParcelable("VIEW_OPTIONS");
        }
        return this.f53615d;
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.cancel) {
            this.f53617f.mo29785a();
        } else if (view.getId() == C0126R.C0129id.begin) {
            this.f53617f.mo29791a(new ycl());
        } else {
            f53598g.mo25418e("View %d is not handled in onClick!", Integer.valueOf(view.getId()));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: yci.a(android.view.LayoutInflater, android.view.ViewGroup, boolean):android.view.View
     arg types: [android.view.LayoutInflater, android.view.ViewGroup, int]
     candidates:
      yci.a(com.google.android.gms.fido.u2f.api.view.ViewOptions, java.lang.String, boolean):yci
      yci.a(android.view.LayoutInflater, android.view.ViewGroup, boolean):android.view.View */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f53617f == null) {
            this.f53617f = (xic) getActivity();
        }
        this.f53615d = (ViewOptions) getArguments().getParcelable("VIEW_OPTIONS");
        this.f53599a = Boolean.valueOf(getArguments().getBoolean("ANY_DEVICE_PAIRED"));
        this.f53616e = Boolean.valueOf(getArguments().getBoolean("FINGERPRINT_ALLOWED"));
        Boolean valueOf = Boolean.valueOf(getArguments().getBoolean("WELCOME_SCREEN"));
        this.f53600b = valueOf;
        if (valueOf.booleanValue()) {
            this.f53601c = getArguments().getCharSequence("APP_NAME").toString();
        }
        return mo30349a(layoutInflater, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        if (this.f53600b.booleanValue()) {
            getActivity().setTitle(String.format(this.f53617f.getResources().getString(C0126R.string.fido_welcome_title), this.f53601c));
        } else if (!this.f53599a.booleanValue()) {
            getActivity().setTitle(getString(C0126R.string.fido_ble_pair_instructions_title));
        } else {
            getActivity().setTitle(getString(C0126R.string.fido_instructions_title));
        }
        getActivity().getWindow().getDecorView().sendAccessibilityEvent(32);
    }

    /* renamed from: a */
    public static yci m43797a(ViewOptions viewOptions, boolean z) {
        sdo.m34970a(viewOptions.mo18855c().equals(yav.BLE));
        return m43798a(viewOptions, ((BleViewOptions) viewOptions).f31964a, viewOptions.f31970c, false, null, z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    private static yci m43798a(ViewOptions viewOptions, boolean z, Set set, boolean z2, String str, boolean z3) {
        yci yci = new yci();
        Bundle bundle = new Bundle();
        bundle.putParcelable("VIEW_OPTIONS", viewOptions);
        bundle.putBoolean("ANY_DEVICE_PAIRED", z);
        bundle.putBoolean("FINGERPRINT_ALLOWED", z3);
        bundle.putBoolean("WELCOME_SCREEN", z2);
        if (z2) {
            sdo.checkIfNull((Object) str, (Object) "App name or authority in request params cannot be null for welcome screen");
            sdo.m34971a(!str.trim().isEmpty(), (Object) "App name or authority from request params cannot be empty after trimming.");
            bundle.putCharSequence("APP_NAME", str);
        }
        ArrayList arrayList = new ArrayList();
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add((Transport) it.next());
            }
        }
        bundle.putParcelableArrayList("ALTERNATIVE_TRANSPORTS", arrayList);
        yci.setArguments(bundle);
        return yci;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo30349a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View view;
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("ALTERNATIVE_TRANSPORTS");
        if (!this.f53599a.booleanValue()) {
            f53598g.mo25412b("Ble pairing instructions view is shown.", new Object[0]);
            view = layoutInflater.inflate((int) C0126R.C0128layout.ble_pair_instructions_layout, viewGroup, z);
            view.findViewById(C0126R.C0129id.cancel).setOnClickListener(this);
            view.findViewById(C0126R.C0129id.begin).setOnClickListener(this);
        } else {
            f53598g.mo25412b("Ble instructions view is shown.", new Object[0]);
            view = layoutInflater.inflate((int) C0126R.C0128layout.ble_instructions_layout, viewGroup, z);
            TextView textView = (TextView) view.findViewById(C0126R.C0129id.fido_pair_another_security_key_textview);
            textView.setVisibility(0);
            textView.setOnClickListener(new yce(this));
            if (this.f53600b.booleanValue()) {
                ((TextView) view.findViewById(C0126R.C0129id.fido_ble_instructions_title_textview)).setText(String.format(this.f53617f.getResources().getString(C0126R.string.fido_welcome_title), this.f53601c));
                ((TextView) view.findViewById(C0126R.C0129id.fido_ble_instructions_body_textview)).setText(String.format("%1$s.\r\n\n%2$s", this.f53617f.getResources().getString(C0126R.string.fido_ble_instructions_body), String.format(this.f53617f.getResources().getString(C0126R.string.fido_welcome_body), this.f53601c)));
            }
        }
        if (parcelableArrayList.contains(Transport.USB)) {
            TextView textView2 = (TextView) view.findViewById(C0126R.C0129id.fido_use_usb_instead_textview);
            textView2.setVisibility(0);
            textView2.setOnClickListener(new ycf(this));
        }
        if (parcelableArrayList.contains(Transport.NFC)) {
            TextView textView3 = (TextView) view.findViewById(C0126R.C0129id.fido_use_nfc_instead_textview);
            textView3.setVisibility(0);
            textView3.setOnClickListener(new ycg(this));
        }
        if (this.f53616e.booleanValue()) {
            TextView textView4 = (TextView) view.findViewById(C0126R.C0129id.fido_use_fp_instead_textview);
            textView4.setVisibility(0);
            textView4.setOnClickListener(new ych(this));
        }
        return view;
    }

    /* renamed from: a */
    public final ycu mo30350a() {
        if (this.f53599a == null) {
            this.f53599a = Boolean.valueOf(getArguments().getBoolean("ANY_DEVICE_PAIRED"));
        }
        if (this.f53600b == null) {
            this.f53600b = Boolean.valueOf(getArguments().getBoolean("WELCOME_SCREEN"));
        }
        if (!this.f53599a.booleanValue()) {
            return ycu.BLE_INSTRUCTIONS_PAIRING_FRAGMENT;
        }
        if (this.f53600b.booleanValue()) {
            return ycu.BLE_INSTRUCTIONS_NON_PAIRING_AUGMENTED_FRAGMENT;
        }
        return ycu.BLE_INSTRUCTIONS_NON_PAIRING_FRAGMENT;
    }
}
