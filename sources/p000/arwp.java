package p000;

import android.content.DialogInterface;

/* renamed from: arwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arwp implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ arws f88373a;

    public arwp(arws arws) {
        this.f88373a = arws;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.f88373a.f88378d.mo59177d();
        } else {
            dialogInterface.dismiss();
        }
    }
}
