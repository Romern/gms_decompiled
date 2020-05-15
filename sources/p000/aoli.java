package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: aoli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoli extends DialogFragment implements CompoundButton.OnCheckedChangeListener, DialogInterface.OnClickListener {

    /* renamed from: a */
    public static final /* synthetic */ int f78393a = 0;

    /* renamed from: b */
    private aolh f78394b;

    /* renamed from: c */
    private String f78395c;

    /* renamed from: d */
    private String f78396d;

    /* renamed from: e */
    private String f78397e;

    /* renamed from: f */
    private boolean f78398f;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f78394b = (aolh) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(String.valueOf(activity.toString()).concat(" must implement InstallAppDialogFragmentCallbacks"));
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f78394b.mo42959a(this.f78398f);
        dismiss();
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.getId() == C0126R.C0129id.plus_install_app_dialog_checkbox) {
            this.f78398f = z;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            aolh aolh = this.f78394b;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://market.android.com/details?id=%1$s&rdid=%1$s&rdot=1", this.f78397e)));
            intent.setPackage("com.android.vending");
            intent.putExtra("use_direct_purchase", true);
            intent.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
            aolh.mo42958a(intent, this.f78398f);
        } else {
            this.f78394b.mo42959a(this.f78398f);
        }
        dismiss();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f78395c = arguments.getString("dialog_title");
        this.f78396d = arguments.getString("dialog_message");
        this.f78397e = arguments.getString("target_package");
        boolean z = false;
        if (bundle != null && bundle.getBoolean("dont_ask_again")) {
            z = true;
        }
        this.f78398f = z;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder title = new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 2132019651)).setTitle(this.f78395c);
        View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.plus_install_app_dialog, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0126R.C0129id.plus_install_app_dialog_message)).setText(this.f78396d);
        CheckBox checkBox = (CheckBox) inflate.findViewById(C0126R.C0129id.plus_install_app_dialog_checkbox);
        checkBox.setText(getString(C0126R.string.plus_install_app_dialog_checkbox_text));
        checkBox.setChecked(this.f78398f);
        checkBox.setOnCheckedChangeListener(this);
        AlertDialog create = title.setView(inflate).setPositiveButton((int) C0126R.string.plus_install_app_dialog_positive_button, this).setNegativeButton((int) C0126R.string.plus_install_app_dialog_negative_button, this).setInverseBackgroundForced(true).setCancelable(true).create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("dont_ask_again", this.f78398f);
    }
}
