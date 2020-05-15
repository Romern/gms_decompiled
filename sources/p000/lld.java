package p000;

import android.content.DialogInterface;

/* renamed from: lld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lld implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ llg f26294a;

    public lld(llg llg) {
        this.f26294a = llg;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f26294a.f26301b.remove("com.google.android.gms.autofill.ui.controllers.PasswordsManagerPolicypasswordViewDialogShowing");
    }
}
