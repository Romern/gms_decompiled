package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: ydf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ydf extends yct {

    /* renamed from: g */
    private static final sek f53648g = new sek(new String[]{"UsbInstructionsFragment"}, (short[]) null);

    /* renamed from: a */
    private List f53649a;

    /* renamed from: b */
    private Boolean f53650b;

    /* renamed from: c */
    private String f53651c;

    /* renamed from: a */
    public static ydf m43836a(ViewOptions viewOptions, String str, boolean z) {
        sdo.m34970a(viewOptions.mo18855c().equals(yav.USB));
        return m43837a(viewOptions, viewOptions.f31970c, true, str, z);
    }

    /* renamed from: b */
    public final ViewOptions mo30351b() {
        if (this.f53615d == null) {
            this.f53615d = (ViewOptions) getArguments().getParcelable("VIEW_OPTIONS");
        }
        return this.f53615d;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ydf.a(android.view.LayoutInflater, android.view.ViewGroup, boolean):android.view.View
     arg types: [android.view.LayoutInflater, android.view.ViewGroup, int]
     candidates:
      ydf.a(com.google.android.gms.fido.u2f.api.view.ViewOptions, java.lang.String, boolean):ydf
      ydf.a(android.view.LayoutInflater, android.view.ViewGroup, boolean):android.view.View */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f53617f == null) {
            this.f53617f = (xic) getActivity();
        }
        this.f53615d = (ViewOptions) getArguments().getParcelable("VIEW_OPTIONS");
        this.f53649a = getArguments().getParcelableArrayList("ALTERNATIVE_TRANSPORTS");
        this.f53616e = Boolean.valueOf(getArguments().getBoolean("FINGERPRINT_ALLOWED"));
        Boolean valueOf = Boolean.valueOf(getArguments().getBoolean("WELCOME_SCREEN"));
        this.f53650b = valueOf;
        if (valueOf.booleanValue()) {
            this.f53651c = getArguments().getCharSequence("APP_NAME").toString();
        }
        return mo30349a(layoutInflater, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        if (this.f53650b.booleanValue()) {
            getActivity().setTitle(String.format(this.f53617f.getResources().getString(C0126R.string.fido_welcome_title), this.f53651c));
        } else {
            getActivity().setTitle(getString(C0126R.string.fido_instructions_title));
        }
        getActivity().getWindow().getDecorView().sendAccessibilityEvent(32);
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
    private static ydf m43837a(ViewOptions viewOptions, Set set, boolean z, String str, boolean z2) {
        ydf ydf = new ydf();
        ArrayList arrayList = new ArrayList();
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add((Transport) it.next());
            }
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("VIEW_OPTIONS", viewOptions);
        bundle.putParcelableArrayList("ALTERNATIVE_TRANSPORTS", arrayList);
        bundle.putBoolean("FINGERPRINT_ALLOWED", z2);
        bundle.putBoolean("WELCOME_SCREEN", z);
        if (z) {
            sdo.m34966a((Object) str, (Object) "App name or authority in request params cannot be null in welcome screen");
            sdo.m34971a(!str.trim().isEmpty(), (Object) "App name or authority from request params cannot be empty after trimming.");
            bundle.putCharSequence("APP_NAME", str);
        }
        ydf.setArguments(bundle);
        return ydf;
    }

    /* renamed from: a */
    public static ydf m43838a(ViewOptions viewOptions, boolean z) {
        sdo.m34970a(viewOptions.mo18855c().equals(yav.USB));
        return m43837a(viewOptions, viewOptions.f31970c, false, null, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo30349a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.usb_instructions_layout, viewGroup, z);
        if (this.f53650b.booleanValue()) {
            ((TextView) inflate.findViewById(C0126R.C0129id.fido_usb_instructions_title_textview)).setText(this.f53617f.getResources().getString(C0126R.string.fido_welcome_title, this.f53651c));
            ((TextView) inflate.findViewById(C0126R.C0129id.fido_usb_instructions_body_textview)).setText(String.format("%1$s.\r\n\n%2$s", this.f53617f.getResources().getString(C0126R.string.fido_usb_instructions_body), this.f53617f.getResources().getString(C0126R.string.fido_welcome_body, this.f53651c)));
        }
        if (this.f53649a.contains(Transport.BLUETOOTH_LOW_ENERGY)) {
            f53648g.mo25414c("Alternate transport BLE available.", new Object[0]);
            TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.fido_use_ble_instead_textview);
            textView.setVisibility(0);
            textView.setOnClickListener(new ydc(this));
        }
        if (this.f53649a.contains(Transport.NFC)) {
            f53648g.mo25414c("Alternate transport NFC available.", new Object[0]);
            TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.fido_use_nfc_instead_textview);
            textView2.setVisibility(0);
            textView2.setOnClickListener(new ydd(this));
        }
        if (this.f53616e.booleanValue()) {
            TextView textView3 = (TextView) inflate.findViewById(C0126R.C0129id.fido_use_fp_instead_textview);
            textView3.setVisibility(0);
            textView3.setOnClickListener(new yde(this));
        }
        return inflate;
    }

    /* renamed from: a */
    public final ycu mo30350a() {
        if (this.f53650b == null) {
            this.f53650b = Boolean.valueOf(getArguments().getBoolean("WELCOME_SCREEN"));
        }
        if (this.f53650b.booleanValue()) {
            return ycu.USB_INSTRUCTIONS_AUGMENTED_FRAGMENT;
        }
        return ycu.USB_INSTRUCTIONS_FRAGMENT;
    }
}
