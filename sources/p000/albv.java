package p000;

import android.content.DialogInterface;

/* renamed from: albv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class albv implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ albu f73372a;

    public albv(albu albu) {
        this.f73372a = albu;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ((alaq) this.f73372a).f73230a.finish();
    }
}
