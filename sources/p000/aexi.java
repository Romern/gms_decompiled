package p000;

import android.app.AlertDialog;
import android.widget.CompoundButton;

/* renamed from: aexi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aexi implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ AlertDialog f63978a;

    /* renamed from: b */
    final /* synthetic */ aexj f63979b;

    public aexi(aexj aexj, AlertDialog alertDialog) {
        this.f63979b = aexj;
        this.f63978a = alertDialog;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f63978a.getButton(-2).setEnabled(!z);
        this.f63979b.f63982b = z;
    }
}
