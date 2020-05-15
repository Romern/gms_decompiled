package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* renamed from: atqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atqi extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: a */
    atam f90666a;

    /* renamed from: b */
    private bpan f90667b = bpan.UNKNOWN_PROMPT_TYPE;

    /* renamed from: a */
    public final void mo50119a(Activity activity, int i) {
        if (activity instanceof auat) {
            ((auat) activity).mo50173a(i, getArguments().getInt("requestCode"));
            if (this.f90666a != null && this.f90667b != bpan.UNKNOWN_PROMPT_TYPE) {
                if (i == -1) {
                    this.f90666a.mo49756b(this.f90667b);
                } else if (i == -2) {
                    this.f90666a.mo49761c(this.f90667b);
                }
            }
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (getActivity() instanceof auas) {
            ((auas) getActivity()).mo50172a(getArguments().getInt("requestCode"));
        } else {
            mo50119a(getActivity(), -2);
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mo50119a(getActivity(), i);
        dismiss();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        int i;
        Activity activity = getActivity();
        bpan a = bpan.m111723a(getArguments().getInt("promptType"));
        if (a == null) {
            a = bpan.UNKNOWN_PROMPT_TYPE;
        }
        this.f90667b = a;
        Bundle arguments = getArguments();
        if (this.f90666a == null) {
            AccountInfo accountInfo = (AccountInfo) arguments.getParcelable("accountInfo");
            this.f90666a = accountInfo != null ? new atam(getActivity(), accountInfo) : null;
        }
        View inflate = LayoutInflater.from(activity).inflate((int) C0126R.C0128layout.tp_felica_info_dialog, (ViewGroup) null);
        ((ImageView) inflate.findViewById(C0126R.C0129id.brand_icon)).setImageResource(getArguments().getInt("brandIconResId"));
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.title);
        String string = arguments.getString("title");
        textView.setText(string);
        int i2 = 8;
        if (!TextUtils.isEmpty(string)) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        ((TextView) inflate.findViewById(C0126R.C0129id.message)).setText(arguments.getString("message"));
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("http://ap.pitsquare.jp/osaifu/pc/osaifukeitai_app/kiyaku/menu_kiyaku.html"));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("http://www.felicanetworks.co.jp/privacy/"));
        atyg.m76550a(activity, (TextView) inflate.findViewById(C0126R.C0129id.legal_message), getString(C0126R.string.tp_felica_legal_message), intent, intent2);
        C1349sg sgVar = new C1349sg(new ContextThemeWrapper(getActivity(), (int) C0126R.style.TpAlertDialogActivity));
        sgVar.mo15907b(inflate);
        boolean z = arguments.getBoolean("shouldShowTos", true);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.tp_button_positive);
        button.setText((int) C0126R.string.common_continue);
        button.setOnClickListener(new atqf(this, activity));
        Button button2 = (Button) inflate.findViewById(C0126R.C0129id.tp_button_negative);
        button2.setText((int) C0126R.string.common_cancel);
        button2.setOnClickListener(new atqg(this, activity));
        sgVar.mo15907b(inflate);
        View findViewById = inflate.findViewById(C0126R.C0129id.legal_message);
        if (z) {
            i2 = 0;
        }
        findViewById.setVisibility(i2);
        if (!(this.f90666a == null || this.f90667b == bpan.UNKNOWN_PROMPT_TYPE)) {
            this.f90666a.mo49738a(this.f90667b);
        }
        setCancelable(false);
        return sgVar.mo15904b();
    }
}
