package p000;

import android.content.DialogInterface;

/* renamed from: wjm */
final /* synthetic */ class wjm implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wjo f50769a;

    public wjm(wjo wjo) {
        this.f50769a = wjo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wjo wjo = this.f50769a;
        wjo.f50771a.getSupportLoaderManager().restartLoader(6, null, new wjo(wjo.f50771a));
    }
}
