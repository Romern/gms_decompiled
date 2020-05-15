package p000;

import android.content.DialogInterface;

/* renamed from: dni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dni implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ dnj f13624a;

    public dni(dnj dnj) {
        this.f13624a = dnj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dnj dnj = this.f13624a;
        dnj.f13625a = i;
        dnj.f13629b = -1;
        dialogInterface.dismiss();
    }
}
