package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: bhaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhaa extends DialogFragment implements DialogInterface.OnClickListener {
    /* renamed from: a */
    private final bgzz m100506a() {
        if (getTargetFragment() instanceof bgzz) {
            return (bgzz) getTargetFragment();
        }
        if (getActivity() instanceof bgzz) {
            return (bgzz) getActivity();
        }
        return null;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        bgzz a = m100506a();
        if (a != null) {
            getArguments();
            a.mo63472a(getTag());
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bgzz a = m100506a();
        if (a == null) {
            return;
        }
        if (i == -2) {
            getArguments();
            a.mo63473b(getTag());
        } else if (i == -1) {
            getArguments();
            a.mo63474c(getTag());
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        CharSequence charSequence;
        Bundle arguments = getArguments();
        Activity activity = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        if (arguments.containsKey("title")) {
            builder.setTitle(arguments.getString("title"));
        }
        if (arguments.containsKey("titleId")) {
            builder.setTitle(arguments.getInt("titleId"));
        }
        if (arguments.containsKey("message")) {
            charSequence = arguments.getCharSequence("message");
        } else {
            charSequence = null;
        }
        if (arguments.containsKey("messageId")) {
            charSequence = activity.getString(arguments.getInt("messageId"));
        }
        if (charSequence != null) {
            if (!arguments.containsKey("process_html")) {
                builder.setMessage(charSequence);
            } else {
                TextView textView = (TextView) getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.common_dialog_message, (ViewGroup) null);
                textView.setText(Html.fromHtml(charSequence.toString()));
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                builder.setView(textView);
            }
        }
        if (arguments.containsKey("positive")) {
            builder.setPositiveButton(arguments.getString("positive"), this);
        }
        if (arguments.containsKey("positiveId")) {
            builder.setPositiveButton(arguments.getInt("positiveId"), this);
        }
        if (arguments.containsKey("negative")) {
            builder.setNegativeButton(arguments.getString("negative"), this);
        }
        if (arguments.containsKey("negativeId")) {
            builder.setNegativeButton(arguments.getInt("negativeId"), this);
        }
        AlertDialog create = builder.create();
        if (arguments.containsKey("enablingCheckbox")) {
            int i = arguments.getInt("enablingCheckbox");
            View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.alert_dialog_checkbox, (ViewGroup) null);
            create.setView(inflate);
            CheckBox checkBox = (CheckBox) inflate.findViewById(C0126R.C0129id.checkbox);
            checkBox.setText(i);
            checkBox.setOnCheckedChangeListener(new bgzw(create));
            create.setOnShowListener(new bgzx(create, checkBox));
            create.setOnDismissListener(new bgzy(checkBox));
        }
        return create;
    }

    public final void onResume() {
        TextView textView;
        super.onResume();
        if (getDialog() != null && (textView = (TextView) getDialog().findViewById(16908299)) != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* renamed from: a */
    public static bhaa m100507a(int i, int i2, int i3, int i4) {
        bhaa bhaa = new bhaa();
        Bundle bundle = new Bundle();
        if (i != 0) {
            bundle.putInt("titleId", i);
        }
        bundle.putInt("messageId", i2);
        bundle.putInt("positiveId", i3);
        if (i4 != 0) {
            bundle.putInt("negativeId", i4);
        }
        bhaa.setArguments(bundle);
        return bhaa;
    }
}
