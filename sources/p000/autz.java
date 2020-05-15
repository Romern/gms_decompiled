package p000;

import android.content.DialogInterface;

/* renamed from: autz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class autz implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ auug f92529a;

    public autz(auug auug) {
        this.f92529a = auug;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f92529a.getDialog().cancel();
    }
}
