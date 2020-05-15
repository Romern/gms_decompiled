package p000;

import android.content.DialogInterface;

/* renamed from: wji */
final /* synthetic */ class wji implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wjk f50765a;

    public wji(wjk wjk) {
        this.f50765a = wjk;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wjk wjk = this.f50765a;
        wjk.f50767a.getSupportLoaderManager().restartLoader(7, null, new wjk(wjk.f50767a));
    }
}
