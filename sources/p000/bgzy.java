package p000;

import android.content.DialogInterface;
import android.widget.CheckBox;

/* renamed from: bgzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgzy implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ CheckBox f118181a;

    public bgzy(CheckBox checkBox) {
        this.f118181a = checkBox;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f118181a.setChecked(false);
    }
}
