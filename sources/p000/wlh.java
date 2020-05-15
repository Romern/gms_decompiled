package p000;

import android.content.DialogInterface;

/* renamed from: wlh */
final /* synthetic */ class wlh implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wlj f50828a;

    public wlh(wlj wlj) {
        this.f50828a = wlj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wlj wlj = this.f50828a;
        wlj.f50830a.getLoaderManager().restartLoader(0, null, new wlj(wlj.f50830a));
    }
}
