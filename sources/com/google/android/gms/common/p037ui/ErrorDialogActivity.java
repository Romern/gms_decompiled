package com.google.android.gms.common.p037ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: com.google.android.gms.common.ui.ErrorDialogActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ErrorDialogActivity extends Activity implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {

    /* renamed from: a */
    private int f30394a;

    public final void onCancel(DialogInterface dialogInterface) {
        setResult(0);
        finish();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        setResult(this.f30394a);
        finish();
    }

    public final Dialog onCreateDialog(int i, Bundle bundle) {
        boolean z;
        if (i != 1) {
            return null;
        }
        boolean z2 = false;
        int i2 = bundle.getInt("com.google.android.gms.common.ui.EXTRA_DIALOG_TITLE", 0);
        String string = bundle.getString("com.google.android.gms.common.ui.EXTRA_DIALOG_TITLE_STR");
        int i3 = bundle.getInt("com.google.android.gms.common.ui.EXTRA_DIALOG_MESSAGE", 0);
        String string2 = bundle.getString("com.google.android.gms.common.ui.EXTRA_DIALOG_MESSAGE_STR");
        this.f30394a = bundle.getInt("com.google.android.gms.common.ui.EXTRA_DIALOG_RESULT_CODE", -1);
        AlertDialog.Builder onCancelListener = new AlertDialog.Builder(this).setNeutralButton(17039370, this).setOnCancelListener(this);
        if (i2 != 0) {
            if (string == null) {
                z = true;
            } else {
                z = false;
            }
            rzz.m34729a(z);
            onCancelListener.setTitle(i2);
        } else if (string != null) {
            rzz.m34729a(true);
            onCancelListener.setTitle(string);
        }
        if (i3 != 0) {
            if (string2 == null) {
                z2 = true;
            }
            rzz.m34729a(z2);
            onCancelListener.setMessage(i3);
        } else if (string2 != null) {
            rzz.m34729a(true);
            onCancelListener.setMessage(string2);
        }
        AlertDialog create = onCancelListener.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        removeDialog(1);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        showDialog(1, getIntent().getExtras());
    }
}
