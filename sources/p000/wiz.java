package p000;

import android.content.DialogInterface;

/* renamed from: wiz */
final /* synthetic */ class wiz implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wjb f50756a;

    public wiz(wjb wjb) {
        this.f50756a = wjb;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wjb wjb = this.f50756a;
        wjb.f50758a.getSupportLoaderManager().restartLoader(4, null, new wjb(wjb.f50758a));
    }
}
