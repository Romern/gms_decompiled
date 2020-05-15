package p000;

import android.content.DialogInterface;

/* renamed from: wjf */
final /* synthetic */ class wjf implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wjh f50762a;

    public wjf(wjh wjh) {
        this.f50762a = wjh;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wjh wjh = this.f50762a;
        wjh.f50764a.getSupportLoaderManager().restartLoader(0, null, new wjh(wjh.f50764a));
    }
}
