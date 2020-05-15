package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.chimera.debug.items.ModuleSetItem;
import java.util.Locale;

/* renamed from: qpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qpl extends Fragment {

    /* renamed from: a */
    private qpp f41920a;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Activity activity2 = getActivity();
        if (activity2 instanceof qpp) {
            this.f41920a = (qpp) activity2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((int) C0126R.C0128layout.fragment_module_set_details, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        this.f41920a = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Activity activity = getActivity();
        if (activity != null) {
            sre.m36089i(activity);
        }
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("chimera_module_set_item_key")) {
            qpp qpp = this.f41920a;
            if (qpp != null) {
                qpp.mo17639a(getString(C0126R.string.unexpected_err_msg));
                return;
            }
            return;
        }
        ModuleSetItem moduleSetItem = (ModuleSetItem) arguments.getParcelable("chimera_module_set_item_key");
        if (moduleSetItem != null) {
            ((TextView) view.findViewById(C0126R.C0129id.module_set_id)).setText(moduleSetItem.f30005b);
            ((TextView) view.findViewById(C0126R.C0129id.module_set_variant)).setText(String.format(Locale.ENGLISH, "%d", moduleSetItem.f30006c));
            ((TextView) view.findViewById(C0126R.C0129id.module_set_status)).setText(moduleSetItem.f30007d);
        }
    }
}
