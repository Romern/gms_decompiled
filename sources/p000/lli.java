package p000;

import android.content.DialogInterface;

/* renamed from: lli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lli implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ llm f26308a;

    public lli(llm llm) {
        this.f26308a = llm;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f26308a.f26315b.remove("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicycheckedItemPlusOne");
        this.f26308a.f26315b.putBoolean("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicytypeDialogShowing", false);
    }
}
