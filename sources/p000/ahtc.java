package p000;

import android.content.DialogInterface;

/* renamed from: ahtc */
final /* synthetic */ class ahtc implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final ahtd f67976a;

    public ahtc(ahtd ahtd) {
        this.f67976a = ahtd;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f67976a.f67977a.finish();
    }
}
