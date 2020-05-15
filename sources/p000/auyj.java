package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: auyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auyj extends DialogFragment {

    /* renamed from: a */
    public auyi f92774a;

    /* renamed from: a */
    public static auyj m78079a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        auyj auyj = new auyj();
        Bundle bundle = new Bundle();
        bundle.putString("auth_trust_agent_pref_trusted_places_preference_home_id", str);
        bundle.putString("auth_trust_agent_pref_trusted_places_preference_home_address", str2);
        bundle.putString("auth_trust_agent_pref_trusted_places_preference_title", str3);
        bundle.putString("auth_trust_agent_pref_trusted_places_preference_brief", str4);
        bundle.putString("auth_trust_agent_pref_trusted_places_preference_warning", str5);
        bundle.putString("auth_trust_agent_pref_trusted_places_preference_question", str6);
        bundle.putString("auth_trust_agent_pref_trusted_places_preference_enable", str7);
        bundle.putString("auth_trust_agent_pref_trusted_places_preference_cancel", str8);
        auyj.setArguments(bundle);
        return auyj;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f92774a = (auyi) activity;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.trusted_place_confirmation_dialog, (ViewGroup) null);
        builder.setTitle(getArguments().getString("auth_trust_agent_pref_trusted_places_preference_title"));
        builder.setView(inflate);
        ((TextView) inflate.findViewById(C0126R.C0129id.trusted_places_confirmation_brief)).setText(getArguments().getString("auth_trust_agent_pref_trusted_places_preference_brief"));
        ((TextView) inflate.findViewById(C0126R.C0129id.trusted_places_confirmation_address)).setText(getArguments().getString("auth_trust_agent_pref_trusted_places_preference_home_address").replaceAll(", ", "\n"));
        String string = getArguments().getString("auth_trust_agent_pref_trusted_places_preference_warning");
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.trusted_places_confirmation_radius_warning);
        if (string != null) {
            textView.setText(string);
        } else {
            textView.setVisibility(8);
        }
        String string2 = getArguments().getString("auth_trust_agent_pref_trusted_places_preference_question");
        TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.trusted_places_lure_confirmation_question);
        if (string2 != null) {
            textView2.setText(string2);
        } else {
            textView2.setVisibility(8);
        }
        String[] strArr = {getArguments().getString("auth_trust_agent_pref_trusted_places_preference_home_id"), getArguments().getString("auth_trust_agent_pref_trusted_places_preference_home_address")};
        String string3 = getArguments().getString("auth_trust_agent_pref_trusted_places_preference_enable");
        String string4 = getArguments().getString("auth_trust_agent_pref_trusted_places_preference_cancel");
        builder.setPositiveButton(string3, new auyg(this, strArr));
        builder.setNegativeButton(string4, new auyh(this));
        return builder.create();
    }
}
