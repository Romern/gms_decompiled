package p000;

import android.content.DialogInterface;

/* renamed from: asaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asaw implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ asbb f88633a;

    public asaw(asbb asbb) {
        this.f88633a = asbb;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        new adzt().post(new asav(this));
    }
}
