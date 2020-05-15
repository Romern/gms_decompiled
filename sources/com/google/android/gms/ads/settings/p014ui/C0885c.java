package com.google.android.gms.ads.settings.p014ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: com.google.android.gms.ads.settings.ui.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0885c extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        C0884b bVar;
        C0883a aVar;
        if (getActivity() instanceof C0884b) {
            bVar = (C0884b) getActivity();
        } else {
            bVar = null;
        }
        AlertDialog.Builder message = new AlertDialog.Builder(getActivity()).setTitle((int) C0126R.string.ads_prefs_reset_adid_dialog_title).setMessage((int) C0126R.string.ads_prefs_reset_adid_dialog_msg);
        if (bVar != null) {
            aVar = new C0883a(bVar);
        } else {
            aVar = null;
        }
        return message.setPositiveButton(17039370, aVar).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
    }
}
