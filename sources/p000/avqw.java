package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.update.phone.SystemUpdateChimeraActivity;

/* renamed from: avqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avqw extends DialogFragment {
    /* renamed from: a */
    public final void mo51517a(int i) {
        Activity activity = getActivity();
        if (activity instanceof SystemUpdateChimeraActivity) {
            sek sek = SystemUpdateChimeraActivity.f109513a;
            ((SystemUpdateChimeraActivity) activity).mo59678a(i);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        mo51517a(12);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        sdo.m34959a(arguments);
        Activity activity = getActivity();
        sdo.m34959a(activity);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setMessage(arguments.getInt("message_key")).setPositiveButton(arguments.getInt("positive_button_text_key"), new avqt(this)).setNegativeButton(arguments.getInt("negative_button_text_key"), avqu.f93804a);
        AlertDialog create = builder.create();
        create.setOnShowListener(new avqv(this));
        return create;
    }
}
