package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: auyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auyf extends DialogFragment {

    /* renamed from: a */
    public auye f92770a;

    /* renamed from: a */
    public static auyf m78076a(String str, String str2, String str3) {
        auyf auyf = new auyf();
        Bundle bundle = new Bundle();
        bundle.putString("auth_trust_agent_pref_trusted_places_preference_key", str);
        bundle.putString("auth_trust_agent_pref_trusted_places_preference_title", str2);
        bundle.putString("auth_trust_agent_pref_trusted_places_preference_summary", str3);
        auyf.setArguments(bundle);
        return auyf;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f92770a = (auye) activity;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        String string = getArguments().getString("auth_trust_agent_pref_trusted_places_preference_key");
        String string2 = getArguments().getString("auth_trust_agent_pref_trusted_places_preference_title");
        String string3 = getArguments().getString("auth_trust_agent_pref_trusted_places_preference_summary");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.trusted_place_rename_dialog, (ViewGroup) null);
        builder.setView(inflate);
        EditText editText = (EditText) inflate.findViewById(C0126R.C0129id.trusted_place_name);
        if (!TextUtils.isEmpty(string2)) {
            editText.setText(string2);
        } else {
            editText.setHint(getString(C0126R.string.auth_trust_agent_trusted_places_place_name_hint));
        }
        editText.selectAll();
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.trusted_place_address);
        if (!TextUtils.isEmpty(string3)) {
            textView.setText(string3);
        } else {
            textView.setHint(getString(C0126R.string.auth_trust_agent_trusted_places_place_address_hint));
        }
        builder.setPositiveButton(getString(C0126R.string.common_ok), new auyc(this, editText, string, string3));
        builder.setNegativeButton(getString(C0126R.string.common_cancel), new auyd(this));
        return builder.create();
    }
}
