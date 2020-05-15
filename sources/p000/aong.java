package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.chimera.DialogFragment;

/* renamed from: aong */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aong extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private String f78571a;

    /* renamed from: a */
    public static aong m66135a(String str) {
        aong aong = new aong();
        aong.setArguments(m66136b(str));
        return aong;
    }

    /* renamed from: b */
    public static Bundle m66136b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        return bundle;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dismiss();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f78571a = getArguments().getString("message");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 2132019651)).setMessage(this.f78571a).setNeutralButton(17039370, this).setIcon(17301543).setInverseBackgroundForced(true).create();
    }
}
