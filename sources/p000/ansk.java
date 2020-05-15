package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: ansk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ansk extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private String f77589a;

    /* renamed from: b */
    private String f77590b;

    /* renamed from: c */
    private String f77591c;

    /* renamed from: a */
    private final void m65106a(boolean z) {
        ansj ansj = (ansj) getActivity();
        if (ansj != null) {
            ansj.mo42182a(z);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof ansj)) {
            throw new IllegalStateException("Activity must implement AddToCircleConsentDialogHost.");
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        m65106a(false);
        super.onCancel(dialogInterface);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        m65106a(i == -1);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f77589a = arguments.getString("consentHtml");
        this.f77590b = arguments.getString("titleText");
        this.f77591c = arguments.getString("buttonText");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        AlertDialog.Builder title = new AlertDialog.Builder(new ContextThemeWrapper(activity, 2132019651)).setTitle(this.f77590b);
        View inflate = activity.getLayoutInflater().inflate((int) C0126R.C0128layout.plus_add_to_circle_consent_dialog, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.consent_text);
        textView.setText(Html.fromHtml(this.f77589a));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setClickable(true);
        return title.setView(inflate).setPositiveButton(this.f77591c, this).setInverseBackgroundForced(true).setCancelable(true).create();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        m65106a(false);
        super.onDismiss(dialogInterface);
    }
}
