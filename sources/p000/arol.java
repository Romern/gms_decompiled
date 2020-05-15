package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.smartdevice.d2d.p065ui.DeviceListItemView;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: arol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arol extends Fragment {

    /* renamed from: a */
    public String f88009a;

    /* renamed from: b */
    public DeviceListItemView f88010b;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f88009a = arguments.getString("deviceName");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.smartdevice_target_device_name_fragment, viewGroup, false);
        DeviceListItemView deviceListItemView = (DeviceListItemView) inflate.findViewById(C0126R.C0129id.device_item);
        this.f88010b = deviceListItemView;
        deviceListItemView.mo59122a(this.f88009a);
        DeviceListItemView deviceListItemView2 = this.f88010b;
        deviceListItemView2.mo1865a(0.0f);
        deviceListItemView2.setBackgroundResource(C0126R.C0127drawable.smartdevice_rounded_background);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        GlifLayout glifLayout = (GlifLayout) view.findViewById(C0126R.C0129id.glif_layout);
        Activity activity = getActivity();
        if (glifLayout != null && activity != null) {
            asbr.m73757a(activity.getContainerActivity(), glifLayout.mo71367f());
        }
    }
}
