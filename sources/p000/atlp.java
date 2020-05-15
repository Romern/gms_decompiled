package p000;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: atlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atlp extends atln {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9306a() {
        Intent intent = new Intent("android.settings.NFC_SETTINGS");
        Activity activity = getActivity();
        if (activity != null) {
            activity.startActivityForResult(intent, 1100);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        this.f90449b = bpan.ENABLE_NFC;
        return mo50032a(getResources().getString(C0126R.string.common_turn_on_nfc), getResources().getString(C0126R.string.tp_settings_enable_nfc_dialog_message), getResources().getString(C0126R.string.common_settings), getResources().getString(C0126R.string.common_cancel));
    }
}
