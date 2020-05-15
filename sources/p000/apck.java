package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: apck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apck extends DialogFragment {

    /* renamed from: a */
    public String f84129a;

    public final Dialog onCreateDialog(Bundle bundle) {
        return new AlertDialog.Builder(getContext()).setTitle((int) C0126R.string.romanesco_change_backup_account_title).setMessage(getString(C0126R.string.romanesco_change_backup_account_message, this.f84129a)).setPositiveButton((int) C0126R.string.romanesco_go_to_backup_settings, new apci(this)).setNegativeButton((int) C0126R.string.common_cancel, apcj.f84128a).create();
    }
}
