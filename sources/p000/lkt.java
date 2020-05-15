package p000;

import android.content.DialogInterface;

/* renamed from: lkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lkt implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ lkx f26267a;

    public lkt(lkx lkx) {
        this.f26267a = lkx;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f26267a.f26160b.putBoolean("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllersetUpLockDialogShowing", false);
    }
}
