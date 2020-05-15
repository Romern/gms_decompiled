package p000;

import android.content.DialogInterface;

/* renamed from: llj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class llj implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ llm f26309a;

    public llj(llm llm) {
        this.f26309a = llm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f26309a.f26315b.remove("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicycheckedItemPlusOne");
        this.f26309a.f26315b.putBoolean("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicytypeDialogShowing", false);
        this.f26309a.mo15235c();
    }
}
