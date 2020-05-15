package p000;

import android.accounts.Account;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: annf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class annf extends DialogFragment implements DialogInterface.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private anne f77180a;

    /* renamed from: b */
    private Account f77181b;

    /* renamed from: c */
    private anxl f77182c;

    /* renamed from: d */
    private boolean f77183d;

    /* renamed from: e */
    private anlv f77184e;

    /* renamed from: f */
    private String f77185f;

    /* renamed from: g */
    private boolean f77186g;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof anne) {
            this.f77180a = (anne) activity;
            return;
        }
        throw new IllegalStateException("DisconnectSourceChimeraDialog has to be hosted by an Activity that implements OnDisconnectSourceAcceptedListener.");
    }

    public final void onCancel(DialogInterface dialogInterface) {
        shz.m35339a(getActivity(), this.f77181b.name, (String) null, rig.f43040h, rih.f43049c, this.f77185f);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.getId() == C0126R.C0129id.checkbox) {
            this.f77183d = z;
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -1) {
            shz.m35339a(getActivity(), this.f77181b.name, (String) null, rig.f43040h, rih.f43049c, this.f77185f);
        } else {
            anne anne = this.f77180a;
            if (anne != null) {
                anne.mo41978a(this.f77182c, this.f77183d);
                if (this.f77183d) {
                    shz.m35339a(getActivity(), this.f77181b.name, (String) null, rig.f43039g, rih.f43049c, this.f77185f);
                } else {
                    shz.m35339a(getActivity(), this.f77181b.name, (String) null, rig.f43038f, rih.f43049c, this.f77185f);
                }
            } else {
                return;
            }
        }
        dismiss();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f77181b = (Account) arguments.getParcelable("account");
        this.f77182c = (anxl) arguments.getParcelable("application");
        boolean z = false;
        if (bundle != null && bundle.getBoolean("delete_all_frames")) {
            z = true;
        }
        this.f77183d = z;
        this.f77184e = anlw.m64727a(getActivity()).mo41925a(this.f77182c);
        this.f77185f = arguments.getString("calling_package_name");
        this.f77186g = arguments.getBoolean("signed_up");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setIcon(0);
        builder.setPositiveButton((int) C0126R.string.plus_disconnect_source_dialog_positive_button, this);
        builder.setNegativeButton((int) C0126R.string.plus_disconnect_source_dialog_negative_button, this);
        builder.setInverseBackgroundForced(true);
        if (!this.f77186g || !this.f77182c.mo42355f()) {
            View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.plus_disconnect_source_non_aspen_dialog_contents, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.message);
            if (!TextUtils.isEmpty(this.f77182c.mo42359j())) {
                textView.setText(this.f77182c.mo42359j());
            } else {
                textView.setText(getString(C0126R.string.plus_disconnect_source_non_aspen_dialog_message));
            }
            builder.setView(inflate);
        } else {
            builder.setTitle(getString(C0126R.string.plus_disconnect_source_dialog_title));
            CharSequence charSequence = this.f77184e.f77092a;
            View inflate2 = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.plus_disconnect_source_dialog_contents, (ViewGroup) null);
            TextView textView2 = (TextView) inflate2.findViewById(C0126R.C0129id.message);
            if (!TextUtils.isEmpty(this.f77182c.mo42359j())) {
                textView2.setText(this.f77182c.mo42359j());
            } else {
                textView2.setText(getString(C0126R.string.plus_disconnect_source_dialog_message, charSequence, charSequence));
            }
            CheckBox checkBox = (CheckBox) inflate2.findViewById(C0126R.C0129id.checkbox);
            checkBox.setText(getString(C0126R.string.plus_disconnect_source_dialog_checkbox, charSequence));
            checkBox.setChecked(this.f77183d);
            checkBox.setOnCheckedChangeListener(this);
            builder.setView(inflate2);
        }
        return builder.create();
    }

    public final void onDetach() {
        super.onDetach();
        this.f77180a = null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delete_all_frames", this.f77183d);
    }
}
