package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: wss */
final /* synthetic */ class wss implements View.OnClickListener {

    /* renamed from: a */
    private final wtd f51262a;

    public wss(wtd wtd) {
        this.f51262a = wtd;
    }

    public void onClick(View view) {
        wtd wtd = this.f51262a;
        if (wtd.f51281d.isChecked()) {
            new AlertDialog.Builder(wtd.getContext()).setTitle((int) C0126R.string.fast_pair_stop_saving_devices).setMessage(wtd.getString(C0126R.string.fast_pair_stop_saving_devices_description, wtd.mo29380b().name)).setPositiveButton((int) C0126R.string.fast_pair_turn_off, new wsu(wtd)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).show();
            return;
        }
        wtd.f51281d.toggle();
    }
}
