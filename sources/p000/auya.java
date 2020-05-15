package p000;

import android.content.DialogInterface;

/* renamed from: auya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auya implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ auyb f92764a;

    public auya(auyb auyb) {
        this.f92764a = auyb;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f92764a.getDialog().cancel();
    }
}
