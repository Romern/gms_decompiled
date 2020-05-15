package p000;

import android.content.DialogInterface;

/* renamed from: biiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class biiy implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ bijb f120707a;

    public biiy(bijb bijb) {
        this.f120707a = bijb;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        biij biij = this.f120707a.f120713d.f151374b;
        if (biij != null) {
            biij.mo64646a();
        }
    }
}
