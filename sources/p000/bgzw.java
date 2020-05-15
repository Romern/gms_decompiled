package p000;

import android.app.AlertDialog;
import android.widget.CompoundButton;

/* renamed from: bgzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgzw implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ AlertDialog f118178a;

    public bgzw(AlertDialog alertDialog) {
        this.f118178a = alertDialog;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f118178a.getButton(-1).setEnabled(z);
    }
}
