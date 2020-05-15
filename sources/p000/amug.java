package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;

/* renamed from: amug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amug extends adce {
    public final Dialog onCreateDialog(Bundle bundle) {
        bhia bhia = new bhia(getActivity());
        bhia.mo63791f(C0126R.string.people_contacts_sync_turn_on_master_sync_dialog_title);
        bhia.mo15912d((int) C0126R.string.people_contacts_sync_turn_on_master_sync_dialog_body);
        bhia.mo15906b((int) C0126R.string.common_turn_on, new amue((amuf) getTargetFragment()));
        bhia.mo63781c(17039360, (DialogInterface.OnClickListener) null);
        bhia.mo63780b(false);
        return bhia.mo15904b();
    }
}
