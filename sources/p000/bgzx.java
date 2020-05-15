package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.CheckBox;

/* renamed from: bgzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgzx implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ AlertDialog f118179a;

    /* renamed from: b */
    final /* synthetic */ CheckBox f118180b;

    public bgzx(AlertDialog alertDialog, CheckBox checkBox) {
        this.f118179a = alertDialog;
        this.f118180b = checkBox;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f118179a.getButton(-1).setEnabled(this.f118180b.isChecked());
    }
}
