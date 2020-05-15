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

/* renamed from: jtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jtd extends DialogFragment {

    /* renamed from: a */
    public static final Logger f23169a = jsy.m17256a("DisableBetterTogether");

    /* renamed from: b */
    public String f23170b;

    public jtd() {
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        jta a = jsz.m17257a();
        if (ccia.m129785c()) {
            a.f23166a.mo24383c("better_together_settings_open_disable_dialog_count").mo24359a();
            a.f23166a.mo24388e();
        }
        AlertDialog.Builder title = new AlertDialog.Builder(getActivity()).setTitle((int) C0126R.string.disable_better_together_button_text);
        View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.disable_better_together_dialog, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0126R.C0129id.disable_dialog_acount_name)).setText(this.f23170b);
        title.setView(inflate);
        title.setPositiveButton((int) C0126R.string.common_forget, new jtc(this, a));
        title.setNegativeButton((int) C0126R.string.common_cancel, (DialogInterface.OnClickListener) null);
        return title.create();
    }

    public jtd(String str) {
        this.f23170b = str;
    }
}
