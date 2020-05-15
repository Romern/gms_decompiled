package p000;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fido.u2f.api.view.BleDeviceIdentifier;
import com.google.android.gms.fido.u2f.api.view.BleSelectViewOptions;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ycs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ycs extends yct {

    /* renamed from: c */
    public static final Logger f53612c = new Logger(new String[]{"BleSelectDeviceFragment"}, (short[]) null);

    /* renamed from: a */
    public AlertDialog f53613a;

    /* renamed from: b */
    List f53614b;

    /* renamed from: a */
    public static ycs m43814a(ViewOptions viewOptions) {
        sdo.m34970a(viewOptions.mo18855c().equals(yav.BLE_SELECT));
        ycs ycs = new ycs();
        List list = ((BleSelectViewOptions) viewOptions).f31963b;
        Bundle bundle = new Bundle();
        bundle.putParcelable("VIEW_OPTIONS", viewOptions);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add((BleDeviceIdentifier) list.get(i));
            }
        }
        bundle.putParcelableArrayList("DEVICE_LIST", arrayList);
        ycs.setArguments(bundle);
        return ycs;
    }

    /* renamed from: b */
    public final ViewOptions mo30351b() {
        if (this.f53615d == null) {
            this.f53615d = (ViewOptions) getArguments().getParcelable("VIEW_OPTIONS");
        }
        return this.f53615d;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f53617f == null) {
            this.f53617f = (xic) getActivity();
        }
        this.f53614b = getArguments().getParcelableArrayList("DEVICE_LIST");
        return mo30349a(layoutInflater, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle(getString(C0126R.string.fido_ble_select_device_title));
        getActivity().getWindow().getDecorView().sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo30349a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.ble_select_device_fragment, viewGroup, z);
        ListView listView = (ListView) inflate.findViewById(C0126R.C0129id.security_key_list);
        listView.setAdapter((ListAdapter) new ycr(layoutInflater, this.f53614b, this.f53617f));
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            int paddingTop = listView.getPaddingTop() + listView.getPaddingBottom();
            for (int i = 0; i < adapter.getCount(); i++) {
                View view = adapter.getView(i, null, listView);
                if (view instanceof ViewGroup) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                view.measure(0, 0);
                paddingTop += view.getMeasuredHeight();
            }
            ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = paddingTop + (listView.getDividerHeight() * adapter.getCount());
            listView.setLayoutParams(layoutParams);
        }
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.dont_see_your_key_hint);
        textView.setOnClickListener(new ycp(this, textView));
        return inflate;
    }

    /* renamed from: a */
    public final ycu mo30350a() {
        return ycu.BLE_SELECT_DEVICE_FRAGMENT;
    }
}
