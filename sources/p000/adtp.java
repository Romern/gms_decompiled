package p000;

import android.content.DialogInterface;

/* renamed from: adtp */
final /* synthetic */ class adtp implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final adtr f62722a;

    public adtp(adtr adtr) {
        this.f62722a = adtr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        adtr adtr = this.f62722a;
        adtr.dismiss();
        if (adtr.mo9306a()) {
            ((adtq) adtr.getParentFragment()).mo33812a();
        }
    }
}
