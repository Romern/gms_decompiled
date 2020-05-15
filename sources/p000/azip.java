package p000;

import android.app.AlertDialog;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: azip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azip implements suh {

    /* renamed from: a */
    final /* synthetic */ azit f99488a;

    public azip(azit azit) {
        this.f99488a = azit;
    }

    /* renamed from: a */
    public final void mo7099a(View view, sui sui) {
        azit azit = this.f99488a;
        if (azit.f99494c == null) {
            azit.f99494c = new AlertDialog.Builder(azit.f99492a).setTitle(azit.f99493b.getResources().getString(C0126R.string.ms_confirm, azit.f99493b.getResources().getString(C0126R.string.ms_erase_all_messages_option))).setMessage((int) C0126R.string.ms_erase_all_messages_dialog_message).setPositiveButton((int) C0126R.string.common_ui_confirm_deleting_button, new azis(azit)).setNegativeButton((int) C0126R.string.ms_erase_all_messages_dialog_cancel, new aziq(azit)).create();
        }
        azit.f99494c.show();
    }
}
