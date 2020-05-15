package p000;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: aoni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aoni extends DialogFragment {
    /* renamed from: a */
    public static aoni m66138a(CharSequence charSequence) {
        aoni aoni = new aoni();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("message", charSequence);
        bundle.putBoolean("cancelable", false);
        aoni.setArguments(bundle);
        return aoni;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        Activity activity = getActivity();
        if (activity instanceof aonh) {
            ((aonh) activity).mo43090c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(getArguments().getBoolean("cancelable"));
    }

    public Dialog onCreateDialog(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(new ContextThemeWrapper(getActivity(), 2132019651));
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(getArguments().getCharSequence("message"));
        progressDialog.setCancelable(getArguments().getBoolean("cancelable"));
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Dialog mo43091a(Bundle bundle) {
        return super.onCreateDialog(bundle);
    }
}
