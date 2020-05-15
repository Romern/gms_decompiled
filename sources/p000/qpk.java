package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.chimera.debug.items.ModuleItem;
import com.google.android.gms.chimera.debug.items.ModuleSetItem;
import java.util.ArrayList;

/* renamed from: qpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qpk extends Fragment {

    /* renamed from: a */
    public qpp f41918a;

    /* renamed from: b */
    private qpa f41919b;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Activity activity2 = getActivity();
        if (activity2 instanceof qpp) {
            this.f41918a = (qpp) activity2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((int) C0126R.C0128layout.fragment_chimera_list, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        this.f41918a = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Activity activity = getActivity();
        if (activity != null) {
            this.f41919b = new qpa(activity);
            ListView listView = (ListView) view.findViewById(C0126R.C0129id.list_view);
            listView.setAdapter((ListAdapter) this.f41919b);
            listView.setOnItemClickListener(new qpf(this));
            Bundle arguments = getArguments();
            if (arguments == null || !arguments.containsKey("chimera_module_list_key") || !arguments.containsKey("chimera_module_set_list_key")) {
                qpp qpp = this.f41918a;
                if (qpp != null) {
                    qpp.mo17639a(getString(C0126R.string.unexpected_err_msg));
                    return;
                }
                return;
            }
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("chimera_module_set_list_key");
            ArrayList parcelableArrayList2 = arguments.getParcelableArrayList("chimera_module_list_key");
            if (parcelableArrayList == null || parcelableArrayList2 == null) {
                qpp qpp2 = this.f41918a;
                if (qpp2 != null) {
                    qpp2.mo17639a(getString(C0126R.string.unexpected_err_msg));
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            Activity activity2 = getActivity();
            if (activity2 != null) {
                sre.m36089i(activity2);
            }
            if (!parcelableArrayList.isEmpty()) {
                arrayList.add(new qpg(getString(C0126R.string.module_sets_list_header), getResources().getDimension(C0126R.dimen.module_set_header_top_margin)));
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(new qpi((ModuleSetItem) parcelableArrayList.get(i)));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int size2 = parcelableArrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ModuleItem moduleItem = (ModuleItem) parcelableArrayList2.get(i2);
                if (moduleItem.f30003i) {
                    arrayList2.add(new qph(moduleItem));
                }
                if (moduleItem.f29999e == 1) {
                    arrayList4.add(new qph(moduleItem));
                } else {
                    arrayList3.add(new qph(moduleItem));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new qpg(getString(C0126R.string.starred_list_header), getResources().getDimension(C0126R.dimen.list_header_top_margin)));
                arrayList.addAll(arrayList2);
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(new qpg(getString(C0126R.string.non_container_list_header), getResources().getDimension(C0126R.dimen.list_header_top_margin)));
                arrayList.addAll(arrayList3);
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(new qpg(getString(C0126R.string.container_list_header), getResources().getDimension(C0126R.dimen.list_header_top_margin)));
                arrayList.addAll(arrayList4);
            }
            this.f41919b.clear();
            this.f41919b.addAll(arrayList);
            this.f41919b.notifyDataSetChanged();
        }
    }
}
