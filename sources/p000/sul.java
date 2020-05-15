package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.CheckBox;

/* renamed from: sul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sul implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ AlertDialog f45172a;

    /* renamed from: b */
    final /* synthetic */ CheckBox f45173b;

    public sul(AlertDialog alertDialog, CheckBox checkBox) {
        this.f45172a = alertDialog;
        this.f45173b = checkBox;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f45172a.getButton(-1).setEnabled(this.f45173b.isChecked());
    }
}
