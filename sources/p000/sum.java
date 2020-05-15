package p000;

import android.content.DialogInterface;
import android.widget.CheckBox;

/* renamed from: sum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sum implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ CheckBox f45174a;

    public sum(CheckBox checkBox) {
        this.f45174a = checkBox;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f45174a.setChecked(false);
    }
}
