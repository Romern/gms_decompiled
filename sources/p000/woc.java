package p000;

import android.content.DialogInterface;

/* renamed from: woc */
final /* synthetic */ class woc implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final woe f51024a;

    public woc(woe woe) {
        this.f51024a = woe;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        woe woe = this.f51024a;
        woe.f51026a.f51029c.clear();
        woe.f51026a.getLoaderManager().restartLoader(1, null, new woe(woe.f51026a));
    }
}
