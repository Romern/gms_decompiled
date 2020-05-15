package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: atvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atvm extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        String str;
        int i;
        Activity activity = getActivity();
        atvl atvl = (atvl) activity;
        Resources resources = getResources();
        String str2 = null;
        View inflate = LayoutInflater.from(activity).inflate((int) C0126R.C0128layout.tp_transaction_feedback_dialog, (ViewGroup) null);
        String a = atvl.mo50231a();
        CheckBox checkBox = (CheckBox) inflate.findViewById(C0126R.C0129id.wrong_merchant_checkbox);
        if (TextUtils.isEmpty(a)) {
            str = resources.getString(C0126R.string.tp_feedback_not_generic_merchant);
        } else {
            str = resources.getString(C0126R.string.tp_feedback_not_merchant, a);
        }
        checkBox.setText(str);
        CheckBox checkBox2 = (CheckBox) inflate.findViewById(C0126R.C0129id.wrong_location_checkbox);
        if (!TextUtils.isEmpty(a)) {
            i = 0;
        } else {
            i = 8;
        }
        checkBox2.setVisibility(i);
        if (!TextUtils.isEmpty(a)) {
            str2 = resources.getString(C0126R.string.tp_feedback_not_location, a);
        }
        checkBox2.setText(str2);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.tp_button_positive);
        button.setText((int) C0126R.string.tp_feedback_report);
        button.setOnClickListener(new atvj(atvl, checkBox, checkBox2));
        Button button2 = (Button) inflate.findViewById(C0126R.C0129id.tp_button_negative);
        button2.setText((int) C0126R.string.tp_feedback_dismiss);
        button2.setOnClickListener(new atvk(this));
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(inflate);
        builder.setTitle(resources.getString(C0126R.string.tp_feedback_title));
        return builder.create();
    }
}
