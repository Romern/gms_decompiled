package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* renamed from: lll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lll implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ llm f26312a;

    public lll(llm llm) {
        this.f26312a = llm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == 0 || i == 1) {
            ((AlertDialog) dialogInterface).getButton(-1).setEnabled(true);
            this.f26312a.f26315b.putInt("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicycheckedItemPlusOne", i);
        }
    }
}
