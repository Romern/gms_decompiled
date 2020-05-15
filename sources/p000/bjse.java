package p000;

import android.content.DialogInterface;

/* renamed from: bjse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjse implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bjsj f123219a;

    public bjse(bjsj bjsj) {
        this.f123219a = bjsj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f123219a.f123224b.execute(new bjsd(this));
    }
}
