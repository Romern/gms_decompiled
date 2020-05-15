package com.google.android.gms.ads.settings.p014ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: com.google.android.gms.ads.settings.ui.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0888f extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        C0887e eVar;
        C0886d dVar;
        if (getActivity() instanceof C0887e) {
            eVar = (C0887e) getActivity();
        } else {
            eVar = null;
        }
        AlertDialog.Builder message = new AlertDialog.Builder(getActivity()).setTitle((int) C0126R.string.debug_logging_enable_dialog_title).setMessage(Html.fromHtml(getString(C0126R.string.debug_logging_enable_dialog_msg)));
        if (eVar != null) {
            dVar = new C0886d(eVar);
        } else {
            dVar = null;
        }
        return message.setPositiveButton(17039370, dVar).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
    }
}
