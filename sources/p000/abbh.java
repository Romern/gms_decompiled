package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abbh extends DialogFragment {

    /* renamed from: a */
    public String[] f56984a;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f56984a = getArguments().getStringArray("phone_numbers");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(helpChimeraActivity);
        builder.setTitle((int) C0126R.string.gh_pick_support_phone_number).setItems(this.f56984a, new abbg(this, helpChimeraActivity));
        return builder.create();
    }
}
