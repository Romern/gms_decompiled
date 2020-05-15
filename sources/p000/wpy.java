package p000;

import android.content.DialogInterface;

/* renamed from: wpy */
final /* synthetic */ class wpy implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wqa f51119a;

    public wpy(wqa wqa) {
        this.f51119a = wqa;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wqa wqa = this.f51119a;
        wqa.f51121a.f51124c.clear();
        wqa.f51121a.getLoaderManager().restartLoader(1, null, new wqa(wqa.f51121a));
    }
}
