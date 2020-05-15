package p000;

import android.app.AlertDialog;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ovz */
final /* synthetic */ class ovz implements View.OnClickListener {

    /* renamed from: a */
    private final owc f38516a;

    public ovz(owc owc) {
        this.f38516a = owc;
    }

    public void onClick(View view) {
        owc owc = this.f38516a;
        new AlertDialog.Builder(owc.getActivity()).setTitle(owc.getString(C0126R.string.car_setup_exit_dialog_title)).setNegativeButton(owc.getString(C0126R.string.car_setup_exit_dialog_no), new owa(owc)).setPositiveButton(owc.getString(C0126R.string.car_setup_exit_dialog_later), new owb(owc)).create().show();
    }
}
