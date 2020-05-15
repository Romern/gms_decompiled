package p000;

import android.content.DialogInterface;

/* renamed from: ycn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ycn implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ycp f53603a;

    public ycn(ycp ycp) {
        this.f53603a = ycp;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
        this.f53603a.f53605a.setVisibility(0);
    }
}
