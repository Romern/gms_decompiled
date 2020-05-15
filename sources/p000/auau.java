package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* renamed from: auau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auau extends DialogFragment {

    /* renamed from: a */
    atam f91342a;

    /* renamed from: b */
    private bpan f91343b = bpan.UNKNOWN_PROMPT_TYPE;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: a */
    public final void mo50345a(int i) {
        if (getActivity() instanceof auat) {
            ((auat) getActivity()).mo50173a(i, getArguments().getInt("requestCode"));
            if (this.f91342a != null && this.f91343b != bpan.UNKNOWN_PROMPT_TYPE) {
                if (i == -1) {
                    this.f91342a.mo49756b(this.f91343b);
                } else {
                    this.f91342a.mo49761c(this.f91343b);
                }
            }
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (getActivity() instanceof auas) {
            ((auas) getActivity()).mo50172a(getArguments().getInt("requestCode"));
        } else {
            mo50345a(-2);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        atam atam;
        sre.m36089i(getActivity());
        Bundle arguments = getArguments();
        if (this.f91342a == null) {
            AccountInfo accountInfo = (AccountInfo) arguments.getParcelable("accountInfo");
            if (accountInfo != null) {
                atam = new atam(getActivity(), accountInfo);
            } else {
                atam = null;
            }
            this.f91342a = atam;
        }
        C1349sg sgVar = new C1349sg(new ContextThemeWrapper(getActivity(), (int) C0126R.style.TpAlertDialogActivity));
        View inflate = LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.tp_dialog_layout, (ViewGroup) null);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.tp_button_positive);
        Button button2 = (Button) inflate.findViewById(C0126R.C0129id.tp_button_negative);
        ((TextView) inflate.findViewById(C0126R.C0129id.tp_request_prompt_headline)).setText(arguments.getString("title"));
        ((TextView) inflate.findViewById(C0126R.C0129id.tp_request_prompt_text)).setText(arguments.getString("message"));
        button.setText(arguments.getString("positiveButtonText"));
        button.setOnClickListener(new auap(this));
        String string = arguments.getString("negativeButtonText");
        if (!TextUtils.isEmpty(string)) {
            button2.setText(string);
            button2.setOnClickListener(new auaq(this));
        } else {
            button2.setVisibility(8);
        }
        sgVar.mo15907b(inflate);
        C1350sh b = sgVar.mo15904b();
        b.setCanceledOnTouchOutside(false);
        bpan a = bpan.m111723a(arguments.getInt("promptType"));
        if (a == null) {
            a = bpan.UNKNOWN_PROMPT_TYPE;
        }
        this.f91343b = a;
        if (!(this.f91342a == null || a == bpan.UNKNOWN_PROMPT_TYPE)) {
            this.f91342a.mo49738a(this.f91343b);
        }
        return b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sre.m36089i(getActivity());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
