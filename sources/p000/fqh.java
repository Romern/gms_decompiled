package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: fqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fqh extends DialogFragment implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    public final void onCancel(DialogInterface dialogInterface) {
        Activity activity = getActivity();
        activity.setResult(0);
        activity.finish();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = getActivity();
        if (i == -1) {
            Intent a = sbv.m34871a("com.google.android.gms");
            if (a.resolveActivity(activity.getPackageManager()) != null) {
                activity.startActivityForResult(a, 0);
                return;
            }
        }
        activity.setResult(0);
        activity.finish();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        ArrayList<String> stringArrayList = getArguments().getStringArrayList("missingGroups");
        Collections.sort(stringArrayList);
        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.common_permissions_dialog_contents, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0126R.C0129id.permissions_list);
        Resources resources = getResources();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            View inflate2 = layoutInflater.inflate((int) C0126R.C0128layout.common_permissions_list, (ViewGroup) null);
            ((TextView) inflate2.findViewById(C0126R.C0129id.permission_name)).setText(resources.getString(sft.m35177a(str).intValue()));
            int intExtra = getActivity().getIntent().getIntExtra(str, 0);
            if (intExtra != 0) {
                TextView textView = (TextView) inflate2.findViewById(C0126R.C0129id.permission_explanation);
                textView.setText(resources.getString(intExtra));
                textView.setVisibility(0);
            }
            linearLayout.addView(inflate2);
        }
        return new AlertDialog.Builder(getActivity()).setView(inflate).setPositiveButton((int) C0126R.string.common_permissions_open_settings, this).setNegativeButton(17039360, this).setInverseBackgroundForced(true).create();
    }
}
