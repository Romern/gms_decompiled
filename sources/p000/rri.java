package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: rri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rri extends DialogFragment {

    /* renamed from: a */
    public rrh f43546a;

    /* renamed from: a */
    public static rri m34288a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, boolean z) {
        rri rri = new rri();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("message", charSequence2);
        bundle.putBoolean("cancelable", z);
        if (charSequence != null) {
            bundle.putCharSequence("title", charSequence);
        }
        if (charSequence3 != null) {
            bundle.putCharSequence("positive_button", charSequence3);
        }
        if (charSequence4 != null) {
            bundle.putCharSequence("neutral_button", charSequence4);
        }
        if (charSequence5 != null) {
            bundle.putCharSequence("negative_button", charSequence5);
        }
        rri.setArguments(bundle);
        return rri;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f43546a = (rrh) activity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f43546a.mo7754a(this, 4);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        AlertDialog.Builder message = new AlertDialog.Builder(getActivity()).setMessage(arguments.getCharSequence("message"));
        if (arguments.containsKey("title")) {
            message.setTitle(arguments.getCharSequence("title"));
        }
        if (arguments.containsKey("positive_button")) {
            message.setPositiveButton(arguments.getCharSequence("positive_button"), new rre(this));
        }
        if (arguments.containsKey("neutral_button")) {
            message.setNeutralButton(arguments.getCharSequence("neutral_button"), new rrf(this));
        }
        if (arguments.containsKey("negative_button")) {
            message.setNegativeButton(arguments.getCharSequence("negative_button"), new rrg(this));
        }
        AlertDialog create = message.create();
        boolean z = arguments.getBoolean("cancelable", true);
        create.setCanceledOnTouchOutside(z);
        create.setCancelable(z);
        return create;
    }

    /* renamed from: a */
    public static rri m34289a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z) {
        return m34288a(null, charSequence, charSequence2, null, charSequence3, z);
    }
}
