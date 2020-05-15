package p000;

import android.app.AlertDialog;
import android.widget.CompoundButton;

/* renamed from: suk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class suk implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ AlertDialog f45171a;

    public suk(AlertDialog alertDialog) {
        this.f45171a = alertDialog;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f45171a.getButton(-1).setEnabled(z);
    }
}
