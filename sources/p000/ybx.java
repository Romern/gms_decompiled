package p000;

import android.app.AlertDialog;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ybx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ybx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ycc f53576a;

    public ybx(ycc ycc) {
        this.f53576a = ycc;
    }

    public final void run() {
        ycc ycc = this.f53576a;
        if (ycc.f53583b == null) {
            ycc.f53583b = new AlertDialog.Builder(ycc.f53582a).create();
        }
        ycc.f53583b.setTitle(ycc.f53582a.getResources().getString(C0126R.string.common_something_went_wrong));
        ycc.f53583b.setMessage(ycc.f53582a.getResources().getString(C0126R.string.fido_ble_pairing_failure_dialog_message));
        ycc.f53583b.setButton(-1, ycc.f53582a.getResources().getString(C0126R.string.fido_dialog_positive_button), new yby(ycc));
        ycc.f53583b.setOnShowListener(new ybz(ycc));
        ycc.f53583b.show();
    }
}
