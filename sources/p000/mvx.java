package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: mvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mvx extends DialogFragment {

    /* renamed from: a */
    public mvw f34826a;

    public final Dialog onCreateDialog(Bundle bundle) {
        sdo.checkIfNull(this.f34826a, "Listener must be set before showing this dialog.");
        return mba.m24785a(getActivity()).setMessage((int) C0126R.string.back_up_now_metered_confirmation_text).setTitle((int) C0126R.string.back_up_now_metered_confirmation_title).setPositiveButton((int) C0126R.string.backup_now_text, new mvv(this)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setCancelable(true).create();
    }
}
