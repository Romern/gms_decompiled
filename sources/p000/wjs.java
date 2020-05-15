package p000;

import android.content.DialogInterface;

/* renamed from: wjs */
final /* synthetic */ class wjs implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wju f50775a;

    /* renamed from: b */
    private final boolean f50776b;

    public wjs(wju wju, boolean z) {
        this.f50775a = wju;
        this.f50776b = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wju wju = this.f50775a;
        wju.f50778a.getSupportLoaderManager().restartLoader(1, null, new wju(wju.f50778a, this.f50776b));
    }
}
