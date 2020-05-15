package p000;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: atvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atvz extends DialogFragment {

    /* renamed from: a */
    public atvx f91033a;

    public final /* bridge */ /* synthetic */ Dialog onCreateDialog(Bundle bundle) {
        this.f91033a = (atvx) getActivity();
        View inflate = getLayoutInflater(bundle).inflate((int) C0126R.C0128layout.tp_bottom_sheet_list_item, (ViewGroup) null);
        String string = getResources().getString(C0126R.string.tp_call_issuer, this.f91033a.mo50261b());
        atvy atvy = new atvy(inflate);
        atvy.f91031a.setText(string);
        atvy.f91032b.setImageResource(C0126R.C0127drawable.quantum_ic_local_phone_grey600_24);
        inflate.setOnClickListener(new atvw(this));
        bhfq bhfq = new bhfq(getActivity());
        bhfq.setContentView(inflate);
        return bhfq;
    }
}
