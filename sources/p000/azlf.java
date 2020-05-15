package p000;

import android.content.DialogInterface;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azlf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azlf implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ azlg f99584a;

    public azlf(azlg azlg) {
        this.f99584a = azlg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f99584a.getArguments().getBoolean("from_sticky_ui_instance")) {
            CardChimeraActivity a = this.f99584a.mo9306a();
            a.mo60410b(77);
            a.mo60409b();
            a.f111225i.setVisibility(0);
            a.f111227k.setVisibility(0);
            return;
        }
        CardChimeraActivity a2 = this.f99584a.mo9306a();
        a2.mo60410b(77);
        a2.finish();
    }
}
