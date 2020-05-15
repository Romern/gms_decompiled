package p000;

import android.accounts.Account;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentEntity;

/* renamed from: anmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anmv extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private anmu f77164a;

    /* renamed from: b */
    private Account f77165b;

    /* renamed from: c */
    private MomentEntity f77166c;

    /* renamed from: d */
    private String f77167d;

    /* renamed from: e */
    private String f77168e;

    /* renamed from: a */
    public static anmv m64789a(Account account, MomentEntity momentEntity, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("account", account);
        bundle.putParcelable("moment", momentEntity);
        bundle.putString("calling_package_name", str);
        anmv anmv = new anmv();
        anmv.setShowsDialog(true);
        anmv.setArguments(bundle);
        return anmv;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof anmu) {
            this.f77164a = (anmu) activity;
            return;
        }
        throw new IllegalStateException("DeleteMomentChimeraDialog has to be hosted by an Activity that implements OnDeleteMomentAcceptedListener.");
    }

    public final void onCancel(DialogInterface dialogInterface) {
        shz.m35339a(getActivity(), this.f77165b.name, (String) null, rig.f43042j, rih.f43055i, this.f77167d);
        int i = Build.VERSION.SDK_INT;
        m64790a();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -1) {
            shz.m35339a(getActivity(), this.f77165b.name, (String) null, rig.f43042j, rih.f43055i, this.f77167d);
            int i2 = Build.VERSION.SDK_INT;
            m64790a();
        } else {
            anmu anmu = this.f77164a;
            if (anmu != null) {
                anmu.mo41971a(this.f77166c.f82974g);
                shz.m35339a(getActivity(), this.f77165b.name, (String) null, rig.f43041i, rih.f43055i, this.f77167d);
            } else {
                return;
            }
        }
        dismiss();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f77165b = (Account) arguments.getParcelable("account");
        this.f77166c = (MomentEntity) arguments.getParcelable("moment");
        this.f77167d = arguments.getString("calling_package_name");
        this.f77168e = arguments.getString("acl_text");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(getActivity()).setIcon(0).setPositiveButton((int) C0126R.string.common_ui_confirm_deleting_button, this).setNegativeButton((int) C0126R.string.common_cancel, this);
        View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.plus_delete_moment_dialog_contents, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0126R.C0129id.message)).setText(this.f77166c.f82972e);
        if (this.f77168e != null) {
            String string = getActivity().getString(C0126R.string.plus_delete_dialog_acl_label);
            String str = this.f77168e;
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
            sb.append(string);
            sb.append("\n");
            sb.append(str);
            ((TextView) inflate.findViewById(C0126R.C0129id.acl_message)).setText(sb.toString());
        }
        return negativeButton.setView(inflate).setInverseBackgroundForced(true).create();
    }

    public final void onDetach() {
        super.onDetach();
        this.f77164a = null;
    }

    /* renamed from: a */
    private final void m64790a() {
        dismiss();
        getActivity().setResult(0);
        getActivity().finish();
    }
}
