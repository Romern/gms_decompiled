package p000;

import android.app.AlertDialog;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: jtm */
final /* synthetic */ class jtm implements View.OnClickListener {

    /* renamed from: a */
    private final jtn f23182a;

    public jtm(jtn jtn) {
        this.f23182a = jtn;
    }

    public void onClick(View view) {
        jtn jtn = this.f23182a;
        jtd jtd = new jtd(jtn.f23183a);
        jtd.show(jtn.getFragmentManager(), "DisableBetterTogetherDialogFragment");
        jtn.getFragmentManager().executePendingTransactions();
        AlertDialog alertDialog = (AlertDialog) jtd.getDialog();
        alertDialog.getWindow().setBackgroundDrawableResource(C0126R.C0127drawable.dialog_background);
        alertDialog.getButton(-1).setAllCaps(false);
        alertDialog.getButton(-2).setAllCaps(false);
    }
}
