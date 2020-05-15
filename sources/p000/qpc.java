package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: qpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qpc extends Fragment {

    /* renamed from: a */
    public qpp f41909a;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Activity activity2 = getActivity();
        if (activity2 instanceof qpp) {
            this.f41909a = (qpp) activity2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((int) C0126R.C0128layout.fragment_message, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        this.f41909a = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        boolean z = true;
        if (arguments == null || !arguments.containsKey("chimera_message_key")) {
            ((TextView) view.findViewById(C0126R.C0129id.message)).setText(getString(C0126R.string.unexpected_err_msg));
        } else {
            z = arguments.getBoolean("chimera_enabled_flag_key", true);
            ((TextView) view.findViewById(C0126R.C0129id.message)).setText(arguments.getString("chimera_message_key"));
        }
        Button button = (Button) view.findViewById(C0126R.C0129id.update_button);
        if (!z) {
            button.setVisibility(4);
            return;
        }
        button.setVisibility(0);
        button.setOnClickListener(new qpb(this));
    }
}
