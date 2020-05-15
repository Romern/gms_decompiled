package p000;

import android.content.DialogInterface;

/* renamed from: wjc */
final /* synthetic */ class wjc implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wje f50759a;

    public wjc(wje wje) {
        this.f50759a = wje;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wje wje = this.f50759a;
        wje.f50761a.getSupportLoaderManager().restartLoader(8, null, new wje(wje.f50761a));
    }
}
