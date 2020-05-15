package p000;

import android.content.DialogInterface;

/* renamed from: wjv */
final /* synthetic */ class wjv implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wjx f50780a;

    public wjv(wjx wjx) {
        this.f50780a = wjx;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wjx wjx = this.f50780a;
        wjx.f50782a.getSupportLoaderManager().restartLoader(5, null, new wjx(wjx.f50782a));
    }
}
