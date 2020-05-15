package p000;

import android.content.DialogInterface;

/* renamed from: auyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auyd implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ auyf f92769a;

    public auyd(auyf auyf) {
        this.f92769a = auyf;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f92769a.getDialog().cancel();
    }
}
