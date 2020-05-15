package p000;

import android.content.DialogInterface;

/* renamed from: owb */
final /* synthetic */ class owb implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final owc f38518a;

    public owb(owc owc) {
        this.f38518a = owc;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        owc owc = this.f38518a;
        owc.mo22762a(bpea.FRX_SCREEN_CANCELLED);
        bnsi b = owc.f38519a.mo68387b();
        b.mo68432a("owc", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68405a("Critical error: user aborted car connection");
        owc.mo22763b().mo22754a("EVENT_CAR_CONNECTION_CANCELLED");
    }
}
