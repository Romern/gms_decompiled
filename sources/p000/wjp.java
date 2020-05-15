package p000;

import android.content.DialogInterface;

/* renamed from: wjp */
final /* synthetic */ class wjp implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wjr f50772a;

    public wjp(wjr wjr) {
        this.f50772a = wjr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wjr wjr = this.f50772a;
        wjr.f50774a.getSupportLoaderManager().restartLoader(2, null, new wjr(wjr.f50774a));
    }
}
