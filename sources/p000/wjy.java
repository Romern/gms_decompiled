package p000;

import android.content.DialogInterface;

/* renamed from: wjy */
final /* synthetic */ class wjy implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wkc f50783a;

    public wjy(wkc wkc) {
        this.f50783a = wkc;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wkc wkc = this.f50783a;
        wkc.f50788a.getSupportLoaderManager().restartLoader(3, null, new wkc(wkc.f50788a));
    }
}
