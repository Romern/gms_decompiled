package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.usagereporting.p078ui.UsageReportingDialogChimeraActivity;

/* renamed from: avvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avvu extends DialogFragment implements DialogInterface.OnClickListener {
    public final void onClick(DialogInterface dialogInterface, int i) {
        UsageReportingDialogChimeraActivity usageReportingDialogChimeraActivity = (UsageReportingDialogChimeraActivity) getActivity();
        if (i == -1) {
            usageReportingDialogChimeraActivity.mo59696a("com.google.android.gms.usagereporting.OPTIN_UR");
        } else if (i == -2) {
            usageReportingDialogChimeraActivity.mo59696a("com.google.android.gms.usagereporting.OPTOUT_UR");
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.usage_reporting_dialog, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0126R.C0129id.learn_more_text)).setOnClickListener(new avvt((TextView) inflate.findViewById(C0126R.C0129id.usage_reporting_more_text), (TextView) inflate.findViewById(C0126R.C0129id.usage_reporting_control_text)));
        builder.setView(inflate).setInverseBackgroundForced(true).setTitle((int) C0126R.string.usage_reporting_dialog_title).setPositiveButton((int) C0126R.string.common_allow, this).setNegativeButton((int) C0126R.string.common_deny, this);
        return builder.create();
    }

    public final void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }
}
