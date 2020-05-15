package p000;

import android.content.DialogInterface;

/* renamed from: wlm */
final /* synthetic */ class wlm implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wlo f50832a;

    public wlm(wlo wlo) {
        this.f50832a = wlo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wlo wlo = this.f50832a;
        wlo.f50834a.getLoaderManager().restartLoader(2, null, new wlo(wlo.f50834a));
    }
}
