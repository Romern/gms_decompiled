package com.google.android.gms.ads.settings.p014ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: com.google.android.gms.ads.settings.ui.i */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0891i extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        C0890h hVar;
        C0889g gVar;
        if (getActivity() instanceof C0890h) {
            hVar = (C0890h) getActivity();
        } else {
            hVar = null;
        }
        AlertDialog.Builder message = new AlertDialog.Builder(getActivity()).setTitle((int) C0126R.string.ads_prefs_toggle_interest_based_ads_dialog_title).setMessage(Html.fromHtml(getString(C0126R.string.ads_prefs_toggle_interest_based_ads_dialog_msg)));
        if (hVar != null) {
            gVar = new C0889g(hVar);
        } else {
            gVar = null;
        }
        return message.setPositiveButton(17039370, gVar).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
    }
}
